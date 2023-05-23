package day16.com.ict.edu;


//Local 내부 클래스
public class Ex06_LocalInnerClass {
	
	String name = "둘리";
	public Ex06_LocalInnerClass() {
		System.out.println("외부생성자:" +this);
	}
	
	public void sound() {
		String str = "호이~ 호이~";
		System.out.println(str);
	}
	
	public void play() {
		int age = 24;
		
		// 내부 클래스
		class Inner02{
			
			String addr = "서울 용산구";
			
			public Inner02(){
				System.out.println("내부생성자:" +this);
			}
			public void prn() {
				System.out.println(name);
				System.out.println(age);
				System.out.println(addr);
				//System.out.println(str);
			}//내부 클래스 메서드 끝
		}//내부 클래스 끝
		Inner02 inner02 = new Inner02();
		inner02.prn();
	}// 외부 클래스 멤버 메서드 끝
	
}
