package day06.com.ict.edu;

public class Ex02_do_while {

	public static void main(String[] args) {
//		
//		do ~while문 : while문과 같은 반복문
//					  단, 먼저 실행 후 조건식이 붙는다.
//		형식)
//             초기식;
//             do {
//            	 실행문;
//            	 증감식;
//             }while(조건식);
		
		int i = 0;
		do {
			System.out.print(i +" ");
			i++;
		}while(i<11);
		System.out.println();
		System.out.println("=====================");
		
//		0~10 까지 홀수 출력
		
		i = 1;
		do {
			if(i%2 == 1)
			System.out.println(i +" ");
			i++;
		}while(i<10);
		
		System.out.println("=====================");
//		7단 출력
		i = 1;
		do {
			if(i<10)
			System.out.println(7*i);
			i++;
		}while(i<10);

		System.out.println("=====================");
		
//		0~10 까지 홀수 누적합
		
		i = 1;
		int sum = 0;
		do {
			if(i%2 == 1) {
			sum = sum + i;
			}
			i++;
		}while(i<10);
		
		System.out.println(sum);
		
		

	}

}
