package day11.com.ict.edu;

public class Ex01_method {
	//클래스 : 멤버필드, 멤버메서드, 생성자
	//멤버필드 : 인스턴스변수, 인스턴스상수, static변수, static 상수
	String name = "홍길동";
	int kor = 80;		//인스턴스 변수
	int eng = 95;		//인스턴스 변수	
	int math = 85;		//인스턴스 변수
	int total = 0;		//인스턴스 변수
	double avg = 0.0;	//인스턴스 변수
	
	static double ki = 178.5;// ㄴㅅㅁ샻 qustn
	//멤버메서드() : 동작, 기능, 실행
	
	//** 메서드는 호출해야만 실행할 수있고, 실행 후 반드시 호출한 곳으로 되돌아 간다.
	//형식) [접근제한자][메서드종류]반환형 메서드이름([인자],...){실행할 내용}
	
	//		**반환형 : 반드시 호출한 곳으로 되돌아 가는데 실행 결과를 가지고 갈 때 
	//				 실행결과의 자료형을 반환형
	
	//				 실행 결과를 가지고 가지 않으면 void라는 예약어를 사용한다.
	
	// instance 메서드
	public void getTotal() {
		total = kor + eng +math;
		//return이 생략되어 있다;
	}
	
	public int getTotal2() {
		int sum = kor + eng + math;
		//반환형이 void가 아니면 맨 마지막 return 데이터나 데이터를 가지고 있는 변수
		return sum;
	}
	
	public int getTotal3() {
		//static 변수 사용 가능
		return kor + eng + math+(int)ki;
	}
	
	public static void getAvg() {
		//static일 경우는 instance 변수 사용 불가
		//avg = total/3.0; 오류
		
		//ki가 static이므로 사용 가능
		ki = ki+5;
	}
	
	public static double getAvg2() {
		
		return ki = ki + 0.7;
		//return 0.0;
		//return 0; 으로 가능 호출 됐을 때는 0.0으로 됨
	}
	
}
