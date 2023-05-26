package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ex05_Canvas extends Canvas{
	
	int x = -50;
	//저 세상으로 감
	int y = -50;
	//저 세상으로 감
	int wh = 30;
	
	
	@Override
	public void paint(Graphics g) {
		int r1 = (int)(Math.random()*256);
		int g1 = (int)(Math.random()*256);
		int b1 = (int)(Math.random()*256);
		
		g.setColor(new Color(r1, g1, b1));
		//마우스 클릭 위치 전달 해줘야 댐 x,y에
		g.fillOval(x-wh/2, y-wh/2, wh, wh);

	}
	
	// 기존 내용 그대로 남겨두고 추가하자
	@Override
	public void update(Graphics g) {
		paint(g);
	}
}
