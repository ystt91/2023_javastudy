package day16.com.ict.edu;

public class Ex01_enum {
	
	//열거형(enum) : 상수를 하나의 객체로 인식하고, 여러 개의 상수 객체들을 한곳에
	//			   모아둔 하나의 묶음
	// enum 이름 {상수,상수,...}
	int su = 12;
	static final int JAVA = 200;  //기본자료형 상수
	static final int HTML = 300;
	
	public void play() {
		//지역변수는 static을 사용할 수 없다.
		//지역변수는 메소드 안에서 사용 가능
		//static final int CSS = 500;
	}
	
	//열거형
	public enum Lesson{
		JAVA, JSP, SPRING, ANDROID, HTML
		//하나하나가 객체임
	}
	
	public static void main(String[] args) {
		
		int num = 100;
		
		//지역 변수를 static으로 사용할 수 없습니다.
		//static final int JSP = 400;
		
		//static 메서드에서는 전역변수 사용 불가
		//System.out.println(su);
		
		//지역 변수 사용 가능
		System.out.println(num);
		
		System.out.println(JAVA);
		System.out.println(HTML);
		
		
		//열거형 안에 있는 JAVA 추출
		Lesson s1 = Lesson.JAVA;
		System.out.println(s1);
		System.out.println(Lesson.JAVA);
		
		//한번에 다 추출
		Lesson[] items = Lesson.values();
		//ordinal() => index()
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i] + ":" + items[i].ordinal());
		}                                             
	}
	
	
}
