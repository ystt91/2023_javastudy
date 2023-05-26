package day21.com.ict.edutest;


import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	
	JButton jb1,jb2,jb3,jb4;
	CardLayout card;
	JPanel pg;

	
	public Main() {
		super("카드레이아웃");
		
		pg = new JPanel();
		card = new CardLayout();
		pg.setLayout(card);
		
		Choice choice = new Choice(card);
		Calc cal = new Calc(this);
		
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
