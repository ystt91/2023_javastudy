package day03.com.ict.edu;

public class Ex02_oper {
	public static void main(String[] args) {
		// 증감연산자 : 해당 변수의 값을 1씩 증가나 감소를 시킨다.
		// ++변수 : 현재 변수값을 먼저 1증가하고 나머지를 실행
		// 변수++ : 현재 변수값으로 실행 후 나중에 변수값을 1 증가
		int su1 = 10;
		int su2 = 10;
		
		System.out.println(++su1);
		System.out.println(su2++); //세미 콜론 후 1 증가
		
		System.out.println(su1);
		System.out.println(su2);
		
		char c1 = 'b'; //char는 문자지만 숫자로 저장이 됨
	    char c2 = 'B';
	    
		System.out.println(++c1);
		System.out.println(c2++);
		
		System.out.println(c1);
		System.out.println(c2);
	}
}
