package day11.com.ict.edu;

public class Ex04_main {

	public static void main(String[] args) {
		Ex04_method m4 = new Ex04_method();
		
		m4.add();
		System.out.println(m4.res);
		m4.add(1000);
		System.out.println(m4.res);
		m4.add(100,24);
		System.out.println(m4.res);
		//위의 두 실행문 System.out.println(m4.res); 없을 경우 
		//마지막 add(100,24) 실행
		
		System.out.println("==============");
		
		int k1 = m4.sub();
		System.out.println(k1);
		int k2 = m4.sub(120);
		System.out.println(k2);
		int k3 = m4.sub(24,12);
		System.out.println(k3);
	}

}
