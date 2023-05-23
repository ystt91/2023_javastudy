package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Ex10_Main extends JFrame{
	public Ex10_Main() {
		super("JTab_2");
		
		
		//JPanel을 상속한 클래스 객체로 만들기
		Ex10_BLUE bl = new Ex10_BLUE();
		Ex10_CYAN cy = new Ex10_CYAN();
		Ex10_GREEN gr = new Ex10_GREEN();
		
		//JPanel 들을 JTab에 넣기
		JTabbedPane jtb = new JTabbedPane();
		jtb.addTab("블루 탭",bl);
		jtb.addTab("시안 탭",cy);
		jtb.addTab("그린 탭",gr);
		
		//JTab를 JFrame에 넣자
		add(jtb);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	public static void main(String[] args) {
		new Ex10_Main();
	}
	
}
