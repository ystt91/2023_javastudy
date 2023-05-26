package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.InputMismatchException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Calc extends JFrame implements ItemListener, ActionListener {

	JPanel jp1, jp2;
	JLabel jl1, jl2, jl3;
	JTextField jf1, jf2;
	JRadioButton jb1, jb2, jb3, jb4;
	JTextArea jta;
	JScrollPane jsp;
	JButton jc1, jc2, jc3;

	double res = 0;
	double su1 = 0;
	double su2 = 0;

	public Calc() {
		super("계산기");

		jp1 = new JPanel();

		jl1 = new JLabel("수1");
		jf1 = new JTextField(10);
		jl2 = new JLabel("수2");
		jf2 = new JTextField(10);

		jl3 = new JLabel("연산자");

		jp1.add(jl1);
		jp1.add(jf1);
		jp1.add(jl2);
		jp1.add(jf2);
		jp1.add(jl3);

		jb1 = new JRadioButton(" + ");
		jb2 = new JRadioButton(" - ");
		jb3 = new JRadioButton(" * ");
		jb4 = new JRadioButton(" / ");

		ButtonGroup bg = new ButtonGroup();
		bg.add(jb1);
		bg.add(jb2);
		bg.add(jb3);
		bg.add(jb4);

		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);

		jta = new JTextArea(10, 0);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jp2 = new JPanel();

		jc1 = new JButton("계산");
		jc2 = new JButton("종료");
		jc3 = new JButton("초기화");

		jp2.add(jc1);
		jp2.add(jc2);
		jp2.add(jc3);

		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jb1.addItemListener(this);
		jb2.addItemListener(this);
		jb3.addItemListener(this);
		jb4.addItemListener(this);

		jc1.addActionListener(this);
		jc2.addActionListener(this);
		jc3.addActionListener(this);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
		try {
			su1 = Double.parseDouble(jf1.getText());
			su2 = Double.parseDouble(jf2.getText());
		} catch (InputMismatchException e2) {
			jta.append("숫자를 입력하세요\n");
		}
		
		if (jb1.isSelected()) {
			res = su1 + su2;
		} else if (jb2.isSelected()) {
			res = su1 - su2;
		} else if (jb3.isSelected()) {
			res = su1 * su2;
		} else if (jb4.isSelected()) {
			res = (int)(su1/su2*10)/10.0;
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton obj = (JButton) e.getSource();

		if (obj == jc1) {
			jta.append(String.valueOf(res)+"\n");
		} else if (obj == jc2) {
			System.exit(0);
		} else if (obj == jc3) {
			jta.setText(" ");
			jf1.setText(" ");
			jf2.setText(" ");
			res = 0;
			su1 = 0;
			su2 = 0;
		}

	}

	public static void main(String[] args) {
		new Calc();
	}

}
