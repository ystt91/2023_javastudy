package day21.com.ict.edu;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex02_LogIn extends JPanel{
	
	CardLayout cl;
	JPanel pg1;
	//main에 있는 cardLayout, pg1를 이용하기 위해서 정보를 받아야 함
	//새로 만들어지면 정보교류를 할 수 없다.
	JButton jb1,jb2;
	
	//메인의 정보가 여기로 왓다
	
	public Ex02_LogIn(CardLayout cl, JPanel pg1) {
		//생성자에서 받은 인자는 무조건 전역 변수로 만들자
		this.cl = cl;
		this.pg1 = pg1;
		
		jb1 = new JButton("회원가입");
		jb2 = new JButton("로그인");
		
		add(jb1);
		add(jb2);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(pg1, "join");
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(pg1, "loginok");
			}
		});
		
	}
	
}
