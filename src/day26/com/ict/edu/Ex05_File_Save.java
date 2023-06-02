package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05_File_Save extends JFrame {

	JPanel jp1, jp2;
	JLabel jl1;
	JTextField jtf1;
	JButton jbt1;
	JTextArea jta1;
	JScrollPane jsp1;

	public Ex05_File_Save() {

		super("불러오기");
		jp1 = new JPanel();
		jl1 = new JLabel("파일 경로 : ");
		jtf1 = new JTextField(20);
		jbt1 = new JButton("읽기");
		jp1.add(jl1);
		jp1.add(jtf1);
		jp1.add(jbt1);

		jp2 = new JPanel();
		jta1 = new JTextArea(40, 60);
		jsp1 = new JScrollPane(jta1, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta1.setLineWrap(true);
		jta1.setEditable(false);
		jp2.add(jsp1);

		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jbt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String strPath = jtf1.getText();
				if(strPath.length() > 0) {
					String tmp = Team0531_ReadTextFile.readTextFile(strPath);
					if(tmp != null) {
						jta1.setText(tmp);
					}
				}
			}
		});
		
		

		jtf1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == e.VK_ENTER) {
					String strPath = jtf1.getText();
					if(strPath.length() > 0) {
						String tmp = Team0531_ReadTextFile.readTextFile(strPath);
						if(tmp != null) {
							jta1.setText(tmp);
						}
					}
				}
			}
		});

	}
	


	public static void main(String[] args) {

		new Ex05_File_Save();
	}
}
