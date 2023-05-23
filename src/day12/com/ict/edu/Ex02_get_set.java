package day12.com.ict.edu;

public class Ex02_get_set {
	
	// 직접 접근을 막기 위해서 접근제한자(private)를 사용한다.
	private String name = "홍길동";
	private int age = 24;
	private double weight = 72.6;
	private boolean gender = true;
	
	//get()/set() 메서드를 이용
//	public String getName(String str) {
//		return str;
//	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	
	//지역변수와 전역변수 이름이 같으면
	//전역변수에 this를 붙인다.
	//우선순위는 지역변수>전역변수
	//전역변수를 하고 싶으면 this를 붙여라
	
	public void setName(String name) {
		//전역변수를 하고 싶으면 this를 붙여라
		this.name= name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
