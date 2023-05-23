package day15.com.ict.edu3;

//인터페이스 : 서비스를 제공하는 목록
//			상수와 추상 메서드만 가지고 있다.
//			일반적인 변수와 일반적인 메서드는 존재하지 않는다.
//			객체 생성 안됨(생성자도 없다.)
//			다중 상속을 할 수 있다.(인터페이스는 여러개의 인터페이스를 부모로 만들 수 있다.)
//			클래스를 부모로 만들 수 없다.

//			반드시 기억하세요
//			'인터페이스가 같다'라른 말은 '대체가 가능하다.', '호환이 가능하다.' 라는 뜻
//			ex)c타입 충전단자 : 삼성폰, 화웨이폰, 엘지폰에 쓸 수 있다.

//인터페이스 상속: 인터페이스 extends 인터페이스, 클래스 extends 클래스, 클래스 implements 인터페이스

public interface Ex01_interface {
	
	//모두 다 static final이다.
	//인터페이스 안에 모든 멤버 필드는 static final이다.
	
	final int SU1 = 10; 
	static final int SU2 = 20;
	int su3 = 30;              //인터페이스 안에 모든 멤버 필드는 어차피 static final이다.
	static int su4 = 40;       //인터페이스 안에 모든 멤버 필드는 어차피 static final이다.
	
	//추상 메서드
	public abstract void sound();
	public void play();	//abstract 안 붙여도 어차피 추상 메서드임. abstract 생략 가능
	
	//일반 메서드 사용 불가
	//public void hobby() {};
	public static void like() {
		System.out.println("놀기 좋아");
	} // 인터페이스가 아니라 따로 static에 만들어진 것이기 때문에 사용 가능
	  // 근데 이런건 잘 안 씀
	
}
