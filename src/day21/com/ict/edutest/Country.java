package day21.com.ict.edutest;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Country extends JPanel {
	
	Main main;
	
	JPanel jp1;
	JTextField jtf;
	JButton jb,jb1, jb2;
	JTextArea jta;
	JScrollPane jsp;
	
	CardLayout card;

	
	public Country(Main main) {
		
		this.main = main;
		
		jp1 = new JPanel();
		jb = new JButton("계산기 이동");
		jtf = new JTextField(15);
		jb1 = new JButton("확인");
		jb2 = new JButton("취소");
		
		jp1.add(jb);
		jp1.add(new JLabel("나라 입력 : "));
		jp1.add(jtf);
		jp1.add(jb1);
		jp1.add(jb2);

		jta = new JTextArea(10, 30);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true); // 자동 줄바꿈
		jta.setEditable(false); // 고칠거니? 아뇨

		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setVisible(true);

		jtf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dataPrn();
			}
		});

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dataPrn();
			}
		});

		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText(" ");
				jta.setText(" ");
				// 커서 지정
				jtf.requestFocus();
			}
		});
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		
	}

	// 위 중복된 코드가 있으므로 메서드를 만들자
	public void dataPrn() {
		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");

		Set<String> keys = map.keySet();

		if (jtf.getText().length() == 0) {
			jta.append("데이터를 입력하세요\n");
			jta.requestFocus();
		} else {
			String str = jtf.getText().trim(); // trim() 공백제거
			if (keys.contains(str)) {
				String city = map.get(str);
				jta.append(str + "의 수도는 " + city + "입니다.\n");
			} else {
				jta.append("데이터에 없는 나라입니다.\n");
			}
		}

		jtf.setText(" ");
		jtf.requestFocus();
	}


}
