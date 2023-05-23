package day15.com.ict.edu2;

public class Ex04_Dog extends Ex04_abstract{
	
	String name = "멍멍이";
	
	//반드시 해야 될 애들을 추상클래스로 만듬. 안 하면 오류
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	//반드시 안 해도 되는 것.
	@Override
	public void play() {
		System.out.println("바다에서 놀기");
	}
	
	public String getName() {
		return name;
	}
}
