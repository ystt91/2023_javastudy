package day04.com.ict.edu;

public class Ex03_if {

	public static void main(String[] args) {
		// 단순 if문 : 조건식이 참일 때만 실행, 거짓이면 if문 무시
		// 형식) if(조건식){
		//          조건식이 참일 때 실행할 문장;
		//          조건식이 참일 때 실행할 문장;
		//      }
		// 단, 실행 문장이 한줄이면 {} 블록을 생략 할 수 있다.
		
		// 형식 1) if(조건식) 조건식이 참일때 실행할 문장;
		// 형식 2) if(조건식)
		//           조건식이 참일때 실행할 문장;
		
		
		//int k1이 60이상이면 합격
		int k1 = 60;
		String res = "초기값";
		
		if (k1>=60) res = "합격";
		if(k1<=60) res = "불합격";
		
		System.out.println("결과: " + res);
		
		// int k2가 홀수인지 짝수인지 판별하자
		
		int k2 = 2;
        res = "짝수";
		if(k2%2 == 1) res = "홀수";
		System.out.println("결과: " + res);
		
		//char c1이 대문자인지 아닌지 판별하자
		
		char c1 = 'A';
		res = "대문자";
		if(c1 >='a' && c1<='z') { res = "소문자"; }
		System.out.println("결과: " + res);
		

        //근무 시간이 8시간 까지는 시간당 9620이고
		//8시간을 초과한 시간 만큼은 1.5배 지급한다.
		//현재 근무한 시간이 10이다.
		//얼마를 받아야 하는가?
		
		int dan = 9620;
		int workTime = 10;
		int standardTime = 8;
		double overWageRate = 1.5;
		double pay = dan * standardTime;
		
		if(workTime>standardTime) {
			pay = dan*(standardTime) +(overWageRate*(workTime-standardTime)*dan);
		}
		
		System.out.println("결과: " + pay);

		
		
		
	}
}
