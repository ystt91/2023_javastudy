package day20.com.ict.edu.practice;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Menu extends JFrame implements ActionListener, ItemListener {

	JPanel jp1, jp2, jp3, jp4, jp5;
	ButtonGroup bg1, bg2, bg3;
	JRadioButton jrb1, jrb2, jrb3, jrb4, jrb5, jrb6, jrb7, jrb8, jrb9, jrb10;
	JButton jb1, jb2;
	JTextField jtf;

	double price = 15000 + 500;

	public Menu() {

		super("피자 주문판");

		jp1 = new JPanel();
		jp1.add(new JLabel("자바 피자에 오신 것을 환영합니다."));

		jp2 = new JPanel();
		jrb1 = new JRadioButton("콤보(15000)", true);
		jrb2 = new JRadioButton("포테이토(20000)");
		jrb3 = new JRadioButton("불고기(30000)");
		bg1 = new ButtonGroup();
		bg1.add(jrb1);
		bg1.add(jrb2);
		bg1.add(jrb3);
		jp2.setBorder(BorderFactory.createTitledBorder("종류"));
		jp2.setLayout(new GridLayout(3, 1));
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);

		jp3 = new JPanel();
		jrb4 = new JRadioButton("피망(500)", true);
		jrb5 = new JRadioButton("치즈(1000)");
		jrb6 = new JRadioButton("페퍼로니(1500)");
		jrb7 = new JRadioButton("베이컨(2000)");
		bg2 = new ButtonGroup();
		bg2.add(jrb4);
		bg2.add(jrb5);
		bg2.add(jrb6);
		bg2.add(jrb7);
		jp3.setBorder(BorderFactory.createTitledBorder("추가토핑"));
		jp3.setLayout(new GridLayout(4, 1));
		jp3.add(jrb4);
		jp3.add(jrb5);
		jp3.add(jrb6);
		jp3.add(jrb7);

		jp4 = new JPanel();
		jrb8 = new JRadioButton("Small(80%)");
		jrb9 = new JRadioButton("Medium(100%)", true);
		jrb10 = new JRadioButton("Large(120%)");
		bg3 = new ButtonGroup();
		bg3.add(jrb8);
		bg3.add(jrb9);
		bg3.add(jrb10);
		jp4.setBorder(BorderFactory.createTitledBorder("사이즈"));
		jp4.setLayout(new GridLayout(3, 1));
		jp4.add(jrb8);
		jp4.add(jrb9);
		jp4.add(jrb10);

		jp5 = new JPanel();
		jb1 = new JButton("주문");
		jb2 = new JButton("취소");
		jtf = new JTextField(10);
		jtf.setEditable(false);
		jp5.add(jb1);
		jp5.add(jb2);
		jp5.add(jtf);

		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.WEST);
		add(jp3, BorderLayout.CENTER);
		add(jp4, BorderLayout.EAST);
		add(jp5, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 300, ds.height / 2 - 200, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jb1.addActionListener(this);
		jb2.addActionListener(this);

		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
		jrb3.addItemListener(this);
		jrb4.addItemListener(this);
		jrb5.addItemListener(this);
		jrb6.addItemListener(this);
		jrb7.addItemListener(this);
		jrb8.addItemListener(this);
		jrb9.addItemListener(this);
		jrb10.addItemListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton order = (JButton) e.getSource();
		if (order == jb1) {
			jtf.setText((int)(price) + "원");
		} else if (order == jb2) {
			jtf.setText(" ");
			jrb1.setSelected(true);
			jrb4.setSelected(true);
			jrb9.setSelected(true);
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Enumeration<AbstractButton> bg1_list = bg1.getElements();
		while (bg1_list.hasMoreElements()) {
			AbstractButton abstractButton = (AbstractButton) bg1_list.nextElement();
			JRadioButton jb = (JRadioButton) abstractButton;
			if (jb.isSelected()) {
				if (jb == jrb1) {
					price = 15000;
				} else if (jb == jrb2) {
					price = 20000;
				} else if (jb == jrb3) {
					price = 30000;
				}
			}
		}

		Enumeration<AbstractButton> bg2_list = bg2.getElements();
		while (bg2_list.hasMoreElements()) {
			AbstractButton abstractButton = (AbstractButton) bg2_list.nextElement();
			JRadioButton jb = (JRadioButton) abstractButton;
			if (jb.isSelected()) {
				if (jb == jrb4) {
					price = price + 500;
				} else if (jb == jrb5) {
					price = price + 1000;
				} else if (jb == jrb6) {
					price = price + 1500;
				} else if (jb == jrb7) {
					price = price + 2000;
				}
			}
		}

		Enumeration<AbstractButton> bg3_list = bg3.getElements();
		while (bg3_list.hasMoreElements()) {
			AbstractButton abstractButton = (AbstractButton) bg3_list.nextElement();
			JRadioButton jb = (JRadioButton) abstractButton;
			if (jb.isSelected()) {
				if (jb == jrb8) {
					price = price * 0.8;
				} else if (jb == jrb9) {
					price = price * 1.0;
				} else if (jb == jrb10) {
					price = price * 1.2;
				}
			}
		}
	}

	public static void main(String[] args) {

		new Menu();

	}

}
