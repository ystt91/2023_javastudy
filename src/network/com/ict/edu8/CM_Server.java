package network.com.ict.edu8;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class CM_Server implements Runnable{
		
	ServerSocket ss;
	ArrayList<CP_Client> list;
	
	public CM_Server() {
		try {
			list = new ArrayList<>();
			ss = new ServerSocket(7780); //포트
			System.out.println("서버 대기 중");
			new Thread(this).start(); // start()가 run() 런 메서드로 떨어짐
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	//보내는거 상관없이 언제든지 정보를 받아서 일처리하게끔 쓰레드 처리
	@Override
	public void run() {
		while (true) {
			try {
				//정보가 들어올 때까지 대기하다가 들어오면
				Socket s = ss.accept();
				CP_Client cc = new CP_Client(s, this);
				cc.start();
				list.add(cc);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	//서버에서 메세지 전달
	public void sendMsg(VO vo) {
		try {
			for (CP_Client k : list) {
				k.out.writeObject(vo);
				k.out.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//서버에서 그림 그리기
	public void picture(VO vo) {
		try {
			for (CP_Client k : list) {
				k.out.writeObject(vo);
				k.out.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//삭제
	public void removeClient(CP_Client cc) {
		list.remove(cc);
		//arraylist remove 메서드 
	}
	
	public static void main(String[] args) {
		new CM_Server();
	}
}
