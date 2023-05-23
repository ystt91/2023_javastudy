package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ex10_GREEN extends JPanel{
	
	public Ex10_GREEN() {
		setBackground(Color.GREEN);
		
		JCheckBox jcb1 = new JCheckBox(" + ");
		JCheckBox jcb2 = new JCheckBox(" - ");
		JCheckBox jcb3 = new JCheckBox(" * ");
		JCheckBox jcb4 = new JCheckBox(" / ");
		
		add(jcb1);
		add(jcb2);
		add(jcb3);
		add(jcb4);
		
//		jcb1.setBackground(Color.GREEN);
//		jcb2.setBackground(Color.GREEN);
//		jcb3.setBackground(Color.GREEN);
//		jcb4.setBackground(Color.GREEN);
	}
}
