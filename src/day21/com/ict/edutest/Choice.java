package day21.com.ict.edutest;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Choice extends JPanel{
	
	JButton jb1,jb2,jb3,jb4;
	CardLayout card;
	
	public Choice(CardLayout card) {
		
		this.card = card;
		
		
		jb1 = new JButton("계산기");
		jb2 = new JButton("나라-도시");
		jb3 = new JButton("성적");
		
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
}
