package day14.com.ict.edu4;

public class Ex01_Sub extends Ex01_Super {

	String name = "홍반장";
	int age = 13;
	double weight = 78.4;

	// this() : 자기자신 생성자를 뜻한다.
	// 생성자의 첫번째 줄에 있어야 다른 생성자 호출
//	public Ex01_Sub() {
//		this("홍두께" , 14);
//	}
	
	//super() : 부모클래스 생성자를 뜻한다.
	//자식 클래스 생성자 첫줄에 부모클래스 생성자가 숨어있다.
	//자식 생성자는 먼저 부모 생성자를 찾는다.
	public Ex01_Sub() {
		//super("서울 마포구");
		//부모 생성자의 인자를 따라간다.
		this("kkk",14);
	}

	public Ex01_Sub(String name, int age) {
		super("서울 마포구");
		//부모 생성자의 인자를 따라간다.
		this.name = name;
		this.age = age;
	}
	
}
