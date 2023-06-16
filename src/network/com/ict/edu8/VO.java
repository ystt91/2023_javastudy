package network.com.ict.edu8;

import java.awt.Color;
import java.io.Serializable;


public class VO implements Serializable{
				// 직렬화 하기 위한 시리얼라이저블
	private int cmd;
	// 0:종료, 1:채팅, 2:그림그리기
	
	private String msg; // 통신 왔다갔다
	private int x, y, wh; //x축, y축, 너비
	private Color color; //색깔
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWh() {
		return wh;
	}
	public void setWh(int wh) {
		this.wh = wh;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
