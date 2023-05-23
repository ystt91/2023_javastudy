package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Grade extends JFrame implements ActionListener {

	JPanel jp1, jp2, jp3, jp4;
	JTextField name, kor, eng, math;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3;

	public Grade() {
		super("성적계산");

		jp1 = new JPanel();
		name = new JTextField(10);
		jp1.add(new JLabel("이 름 : "));
		jp1.add(name);

		jp2 = new JPanel();

		kor = new JTextField(10);
		eng = new JTextField(10);
		math = new JTextField(10);

		jp2.add(new JLabel(" 국 어 : "));
		jp2.add(kor);
		jp2.add(new JLabel(" 영 어 : "));
		jp2.add(eng);
		jp2.add(new JLabel(" 수 어 : "));
		jp2.add(math);

		jta = new JTextArea(20, 0);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jp3 = new JPanel();
		jb1 = new JButton("계 산");
		jb2 = new JButton("종 료");
		jb3 = new JButton("취 소");

		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);

		jp4 = new JPanel();
		jp4.setLayout(new BorderLayout());
		jp4.add(jp2, BorderLayout.NORTH);
		jp4.add(jsp, BorderLayout.CENTER);
		jp4.add(jp3, BorderLayout.SOUTH);

		add(jp1, BorderLayout.NORTH);
		add(jp4, BorderLayout.CENTER);

		// 컴포넌트 크기에 맞춰서, pack 앞에 아무것도 없기 때문에 JFrame 메서드임
		pack();

		setLocationRelativeTo(null); // 화면 중간

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		name.addActionListener(this);
		kor.addActionListener(this);
		eng.addActionListener(this);
		math.addActionListener(this);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);

	}

	public static void main(String[] args) {
		new Grade();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String na = name.getText();

		String ko = kor.getText();
		String en = eng.getText();
		String ma = math.getText();

		String hak = " ";

		int su1 = Integer.parseInt(ko);
		int su2 = Integer.parseInt(en);
		int su3 = Integer.parseInt(ma);

		int sum = su1 + su2 + su3;
		int avg = (int) (sum / 3 * 10.0) / 10;

		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}

		JButton obj = (JButton) e.getSource();

		if (obj == jb1) {
			jta.append("이름: " + na + "\n");
			jta.append("총점: " + sum + "\n");
			jta.append("평균: " + avg + "\n");
			jta.append("학점: " + hak + "\n");
		} else if (obj == jb2) {
			System.exit(0);
		} else if (obj == jb3) {
			jta.setText(" ");
		}

	}
}