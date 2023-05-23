package day04.com.ict.edu;

public class Ex04_if_else {

	public static void main(String[] args) {
		// if ~ else문
		// 조건식이 참일 때와 거짓일 때 각각 나눠서 처리한다.
		// 형식) if(조건식){
		//       조건식이 참일 때 실행할 문장;
		//       조건식이 참일 때 실행할 문장;
		//      }else{
		//       조건식이 거짓일 때 실행할 문장;
		//       조건식이 거짓일 때 실행할 문장;
		//      }
		
		//int k1이 60 이상이면 합격 아니면 불합격
		int k1 = 60;
		String result;
		if (k1>=60) 
			result = "합격";
		else 
			result = "불합격";
		
		System.out.println(result);
		
		// int k2가 홀수인지, 짝수인지 판별하자
		int k2 = 30;
		String result1;
		if (k2%2 == 0) {
			result1 = "짝수";
		} else {
			result1 = "홀수";
		}
		
		System.out.println(result1);	
		
		//char k3가 대문자인지, 대문자가 아닌지 판별하자.
		char k3 = 'a';
		String result2;
		if (k3>='a' && k3 <='z') {
			result2 = "소문자";
		} else if(k3>='A'&& k3<='Z'){
			result2 = "대문자";
		} else {
			result2 = "다른 문자";
		}
		System.out.println(result2);
		
        //근무 시간이 8시간 까지는 시간당 9620이고
		//8시간을 초과한 시간 만큼은 1.5배 지급한다.
		//현재 근무한 시간이 10이다.
		//얼마를 받아야 하는가?
		
		int wage = 9620;
		int standardTime = 8;
		int workTime = 10;
		double overWageRate = 1.5;
		double pay;
		
		if (workTime>8) {
			pay = wage*standardTime + (workTime-standardTime)*overWageRate*wage;
		} else {
			pay = wage*workTime;
		}
		System.out.println(pay);
		
		
		
	}

}
