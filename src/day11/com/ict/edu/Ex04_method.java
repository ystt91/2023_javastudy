package day11.com.ict.edu;

public class Ex04_method {

	
	int su1 = 10;
	int su2 = 20;
	int res = 0;
	
	//메서드이름([매개변수(인자)],...)
	//인자 : 메서드가 실행 할 때 외부에서 필요한 정보를 받기 위한 통로이다.
	//인자의 수나 자료형에 따라서 같은 이름의 메서드를 여러개 만들 수있다.
	
	//더하기
	public void add() {
		res = su1 + su2;
	}
	
	public void add(int k1) {
		res = k1 + su2;
	}
	
	public void add(int k1, int k2) {
		res = k1 + k2;
	}
	
	
	public int sub() {
		res = su1 - su2;
		return res;
	}
	
	public int sub(int k1) {
		res = k1 - su2;
		return res;
	}
	
	public int sub(int k1, int k2) {
		return k1 - k2;
	}
}
