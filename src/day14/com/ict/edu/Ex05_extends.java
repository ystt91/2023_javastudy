package day14.com.ict.edu;

import java.util.Random;

public class Ex05_extends extends Random{
	int su = nextInt();
	//상속을 했기 때문에 그냥 그냥 갔다 쓸 수 있다. 
	
	public void play() {
		System.out.println(su);
		
	}
	
	//static 메서드는 static 변수만 사용 가능
	public static void main(String[] args) {
		
	//System.out.println(su);
	//static 메서드 안에 static 변수만 사용 가능
	//play();
	//static 메서드 안에 static 메서드만 사용 가능
		
	//자기자신이라도 객체를 만들자
	//객체 생성 후 호출
	Ex05_extends test = new Ex05_extends();
	test.play();
		
	}
	
	
}
