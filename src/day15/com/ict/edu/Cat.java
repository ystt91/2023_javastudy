package day15.com.ict.edu;

public class Cat extends Animal{
	String color = "삼색이";
	
	@Override
	public void sound() {
		System.out.println("야옹~");
	}
	
	public void play() {
		System.out.println("창밖을 바라본다.");
	}
	
//	Animal(부모 클래스)의 sleep(해당메서드)에 final이 있으면 오버라이딩 안됨
	
//	@Override
//	public void sleep() {
//		System.out.println("12시간 이상 잠을 잔다.");
//	}
	
}
