package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex10_CYAN extends JPanel{
	public Ex10_CYAN() {
		
		setBackground(Color.CYAN);
		
		JRadioButton jrb1 = new JRadioButton(" + ");
		JRadioButton jrb2 = new JRadioButton(" - ");
		JRadioButton jrb3 = new JRadioButton(" * ");
		JRadioButton jrb4 = new JRadioButton(" / ");
		
		//하나만 선택되게 하는 기능
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		add(jrb1);
		add(jrb2);
		add(jrb3);
		add(jrb4);
		
//		jrb1.setBackground(Color.CYAN);
//		jrb2.setBackground(Color.CYAN);
//		jrb3.setBackground(Color.CYAN);
//		jrb4.setBackground(Color.CYAN);
	
	}
}
