package day21.com.ict.edutest;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Calc extends JPanel implements ActionListener {
	
	JPanel jp, jp1, jp2;
	JLabel jl1, jl2, jl3;
	JTextField jf1, jf2;
	JRadioButton jrb1, jrb2, jrb3, jrb4;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	
	CardLayout cl;
	
	Main main;
	
	double su1 = 0;
	double su2 = 0;
	double res = 0;

	public Calc(Main main) {
		
		this.main = main;

		jp1 = new JPanel();
		jb4 = new JButton("도시 구하기 이동");
		jb5 = new JButton("성적 구하기 이동");
		
		jl1 = new JLabel("수1");
		jf1 = new JTextField(10);
		jl2 = new JLabel("수2");
		jf2 = new JTextField(10);

		jl3 = new JLabel("연산자");
		
		jp1.add(jb4);
		jp1.add(jb5);
		
		jp1.add(jl1);
		jp1.add(jf1);
		jp1.add(jl2);
		jp1.add(jf2);
		jp1.add(jl3);

		jrb1 = new JRadioButton(" + ", true);
		jrb2 = new JRadioButton(" - ");
		jrb3 = new JRadioButton(" * ");
		jrb4 = new JRadioButton(" / ");

		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);

		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		jp1.add(jrb4);

		jta = new JTextArea(10, 0);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jp2 = new JPanel();

		jb1 = new JButton("계산");
		jb2 = new JButton("종료");
		jb3 = new JButton("초기화");

		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);

		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);

		setVisible(true);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);

		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(jp, "country");
			}
		});

		jb5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(jp, "grade");
			}
		});


	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton obj = (JButton) e.getSource();

		if (obj == jb1) {
			su1 = Double.parseDouble(jf1.getText());
			su2 = Double.parseDouble(jf2.getText());

			if (jrb1.isSelected()) {
				res = su1 + su2;
			} else if (jrb2.isSelected()) {
				res = su1 - su2;
			} else if (jrb3.isSelected()) {
				res = su1 * su2;
			} else if (jrb4.isSelected()) {
				res = (int) (su1 / su2 * 10) / 10.0;
			}

			jta.append(String.valueOf(res) + "\n");
		} else if (obj == jb2) {
			System.exit(0);
		} else if (obj == jb3) {
			jta.setText(" ");
			jf1.setText(" ");
			jf2.setText(" ");
			res = 0;
			su1 = 0;
			su2 = 0;
		}

	}
}
