package day13.com.ict.edu;

public class Ex01_Constructor {
	
	// this와 this()
	// this : 객체 내부에서 객체 자신을 지칭하는 예약어
	//		  지역변수와 전역변수 이름이 같을 때 전역변수 앞에 this를 붙여라
	
	//		  클래스 안에서 자기 자신의 주소를 지칭하는 this
	
	//this() : 객체 내부에서 객체 자신의 생성자를 지칭하는 예약어
	//		   this는 자기 자신, ()는 생성자
	
	private String name = "홍길동";
	private int age = 34;
	
	public Ex01_Constructor() {
		//생성자가 다른 생성자 호출(반드시 첫번째 줄에서)
		this("야호");
		//this(); 오류 Ex01_Constructor(String name) 호출이 아니라
		//public Ex01_Constructor() 호출이기 때문에
		
		System.out.println("기본생성자: " +this);
		//생성자에서 메서드를 호출
		//prn();
		this.prn();
	}
	
	//생성자 오버로딩 (같은 이름의 생성자가 2개 이상 있음)
	public Ex01_Constructor(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void prn() {
		
	}
}
