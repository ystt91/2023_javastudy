package day11.com.ict.edu;

public class Ex01_main {
	
	//11 static String str = "대한민국";

	public static void main(String[] args) {
		
		//11 str = "korea";
		
		//객체 생성 상관 없이 공통으로 사용하는 static 멤버변수, 멤버메서드
		//static 호출 : 클래스이름.변수, 클래스이름.메서드
		//객체 생성 시에만 사용할 수 있는 instance 멤버
		
		System.out.println(Ex01_method.ki);
		
		Ex01_method.getAvg();
		System.out.println(Ex01_method.ki);
		
		Ex01_method m1 = new Ex01_method();
		
		//인스턴스 호출 방법: 참조변수.변수, 참조변수.메서드
		//변수를 호출하면 호출한곳으로 가서 데이터를 가지고 온다.
		String name = m1.name;
		
		//void는 호출한 곳으로 아무것도 가져오지 않는다.
		m1.getTotal();
		
		//total 변경 된 것을 확인
		int k1 = m1.total;
		System.out.println(name);
		System.out.println(k1);
		
		System.out.println("==========");
		
		double k2 = Ex01_method.getAvg2();
		System.out.println(k2);
		

	}

}
