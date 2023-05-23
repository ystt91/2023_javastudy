package day17.com.ict.edu3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex05_Layout extends JFrame{
	
	public Ex05_Layout() {
		super("JFrame을 FlowLayout으로 변경하자");
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		
		setLayout(new FlowLayout());
		//JFrame에서 setLayout 메서드를 가져옴
		//setLayout을 통해서 원하는 레이아웃으로 변경할 수 있다.
		
		
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex05_Layout();
	}
}
