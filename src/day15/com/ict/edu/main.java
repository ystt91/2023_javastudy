package day15.com.ict.edu;

public class main {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		//하는 순간 부모클래스가 먼저 만들어진다.(Animal ->Cat)
		
		System.out.println(cat.eyes);
		System.out.println(cat.color);
		//부모와 자식이 똑같이 color를 가지고 있을 때는
		//자식의 color를 쓴다.
		
		cat.sound();
		//자식이 오버라이딩 하면
		cat.hobby();
		cat.sleep();
		cat.play();
		
		
	}

}
