package day17.com.ict.edu3;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex07_Layout extends JFrame{
	
	public Ex07_Layout() {
		super("절대좌표 : null");
		
		JPanel jp = new JPanel();
		//절대좌표는JPnel()생성자에 new 생성자 못한다네요~
		//그래서 아래처럼 해줘야 한데요
		jp.setLayout(null);
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		
		//setbounds(x,y,w,h);
		jb1.setBounds(10, 10, 200, 300);
		jb2.setBounds(220, 10, 200, 100);
		//210 + 10 해서 중복되지 않게 햇어요
		jb3.setBounds(10, 320, 420, 10);

		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		
		add(jp);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		
		new Ex07_Layout();

	}
}
