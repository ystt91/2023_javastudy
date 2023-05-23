package day13.com.ict.edu;

public class Ex02_main {

	public static void main(String[] args) {
		
		Ex02_static p1 = new Ex02_static();
		System.out.println(p1.su1);
		System.out.println(p1.su2);
		
		
		Ex02_static p2 = new Ex02_static();
		System.out.println(p2.su1);
		System.out.println(p2.su2);
		//static은 공통적으로 사용하는 변수이기 때문에 결과값이 다르다
		
		
		Ex02_static p3 = new Ex02_static();
		System.out.println(p3.su1);
		System.out.println(p3.su2);
		
		
		System.out.println(p1.su1);
		System.out.println(p1.su2);
	}

}
