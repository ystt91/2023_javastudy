package day14.com.ict.edu;

public class Ex03_main {

	public static void main(String[] args) {

	    // 자식 클래스를 객체로 만들면 부모클래스는 알아서 만들어진다.
		// 순서상 부모 클래스가 먼저 만들어지고 그 다음에 자식 클래스가 만들어진다.
		
		// 전체를 감싸는 영역이 만들어지고 그 안에 부모클래스와 자식클래스가 있다. 
		// 영역에서는 자식클래스가 우선이다.
		
		Ex03_Sub sub = new Ex03_Sub();
		System.out.println("메인에서 호출: " +sub);
		
		System.out.println(sub.name);
		System.out.println(sub.age);
		
		System.out.println(sub.addr);
		//sub에게 없는데 부모님에게 물어봐서 있으면 가져다 쓴다.
		
		
		//외부에서는 private 호출 안됨
		//System.out.println(sub.cat);
		//System.out.println(sub.dog);
		
		//static(접근제한자가 우선순위가 높다.)
		System.out.println(sub.playStation);
		System.out.println(Ex03_Sub.computer);
		System.out.println(Ex03_Super.playStation);
		
		//컴파일 오류 System.out.println(Ex03_Super.name);
		
	}

}
