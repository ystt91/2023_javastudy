package day22.com.ict.prac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ex01 extends JFrame {
	JPanel jp;
	JButton jb;
	JProgressBar jpg1, jpg2;

	public ex01() {
		super("프로그레스바 스레드");
		jp = new JPanel();
		jb = new JButton("start");
		jpg1 = new JProgressBar();
		jpg2 = new JProgressBar();
		jp.add(jb);
		jp.add(jpg1);
		jp.add(jpg2);
		add(jp);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {

					@Override
					public void run() {
						int cnt = 0;
						while (cnt < jpg1.getMaximum()) {
							cnt = cnt + (int) (Math.random() * 10);
							jpg1.setValue(cnt);
							try {
								Thread.sleep(100);
							} catch (Exception e2) {
								// TODO: handle exception
							}
						}
						System.out.println("1번 도착");
					}
				}).start();

				new Thread(new Runnable() {

					@Override
					public void run() {
						int cnt = 0;
						while (cnt < jpg2.getMaximum()) {
							cnt = cnt + (int) (Math.random() * 10);
							jpg2.setValue(cnt);
							try {
								Thread.sleep(1000);
							} catch (Exception e2) {
								// TODO: handle exception
							}
						}
						System.out.println("2번도착");
					}
				}).start();
			}
		});
	}

	public static void main(String[] args) {
		new ex01();
	}
}
