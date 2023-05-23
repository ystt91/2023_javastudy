package day14.com.ict.edu5;

public class Ex01_Sub extends Ex01_Super{
	
	int weight = 35;
	
	@Override
	public void sound() {
		System.out.println("음악소리");
	}
	//정보은닉 : 부모의 메서드를 숨김
	
	public void hobby() {
		System.out.println("잠자기");
		
	}
}
