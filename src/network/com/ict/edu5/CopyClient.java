package network.com.ict.edu5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread{
	
	//생성자를 인자로 받으면 전역변수로 빼라
	Socket s;
	ChatServer server;
	
	BufferedReader in;
	PrintWriter out;
	String ip;
	
	public CopyClient(Socket s, ChatServer server) {
		//서버에 메서드나 변수를 사용하기 위해 this 사용
		// 보내거나,삭제하거나, 리스트가 서버에 있어서
		this.s = s;
		this.server = server;
		
		try {
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(),true); // 자동 flush를 위해 true
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
		}
	}
	
	public void run() {
		while (true) {
			try {
				String msg = in.readLine();
				if(msg.equals("exit")) {
					// 원격에 있는 실제 클라이언트에게 종료 메세지 보냄
					out.println("~bye");
					break;
				}
				server.sendMsg(ip+ ":" +msg);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}// 무한 반복
		try {
			out.close();
			in.close();
			s.close();
			
			//server에 있는 list에 현재 객체 삭제
			server.removeClient(this);
			server.sendMsg(ip + "님 퇴장");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
