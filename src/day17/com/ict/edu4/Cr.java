package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Cr extends JFrame{
	public Cr() {
	super("회원가입");
	
	JPanel jp1 = new JPanel(new GridLayout(3, 3));
	JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JTextField jtf1 = new JTextField(10);
	JRadioButton jrb1 = new JRadioButton("남");
	JRadioButton jrb2 = new JRadioButton("여");
	
	ButtonGroup bg = new ButtonGroup();
	bg.add(jrb1);
	bg.add(jrb2);
	
	jp2.add(new JLabel("이름 : "));
	jp2.add(jtf1);
	jp2.add(new JLabel("성 별 : "));
	jp2.add(jrb1);
	jp2.add(jrb2);
	
	
	JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JTextField jtf2 = new JTextField(10);
	
	jp3.add(new JLabel("생년월일"));
	jp3.add(jtf2);
	
	JPanel jp4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JTextField jtf3 = new JTextField(20);
	
	jp4.add(new JLabel("주 소 : "));
	jp4.add(jtf3);
	
	jp1.add(jp2);
	jp1.add(jp3);
	jp1.add(jp4);
	
	JPanel jp5 = new JPanel(new GridLayout(3, 3));
	
	JPanel jp6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	String[] name = {"부서", "개발부", "영업부"};
	JComboBox<String> jcb1 = new JComboBox<>(name);	
	
	jp6.add(new JLabel("부서명 : "));
	jp6.add(jcb1);
	
	JPanel jp7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JCheckBox jch1 = new JCheckBox("운동");
	//jch1.setText("운동");
	JCheckBox jch2 = new JCheckBox("영화");
	JCheckBox jch3 = new JCheckBox("독서");
	JCheckBox jch4 = new JCheckBox("컴퓨터");
	
	jp7.add(new JLabel("취미 : "));	
	jp7.add(jch1);
	jp7.add(jch2);
	jp7.add(jch3);
	jp7.add(jch4);	
	
	JPanel jp8 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	jp8.add(new JLabel("자 기 소 개"));
	
	jp5.add(jp6);
	jp5.add(jp7);
	jp5.add(jp8);
	
	JPanel jp9 = new JPanel(new GridLayout(2, 2));	
	jp9.add(jp1);
	jp9.add(jp5);
	
	JTextArea jta = new JTextArea();
	jta.setLineWrap(true);
	JScrollPane jsp = new JScrollPane(jta,
			ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER  );
	
	
	JPanel jp10 = new JPanel();
	JButton jb1 = new JButton("저장");
	JButton jb2 = new JButton("종료");
	JButton jb3 = new JButton("취소");
	
	jp10.add(jb1);
	jp10.add(jb2);
	jp10.add(jb3);
	
	add(jp9, BorderLayout.NORTH);
	add(jta, BorderLayout.CENTER);
	add(jp10, BorderLayout.SOUTH);
	
	Dimension ds =  Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	new Cr();
}
}
