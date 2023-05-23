package day06.com.ict.edu2;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		/*
		 이름, 국어, 영어, 수학를 입력 받아서 
         총점, 평균, 학점을 구하고 
         이름, 총점, 평균, 학점을 출력하는 코딩 
         (평균은 소숫점 첫째자리까지 구하자)
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = s.next();
		System.out.println("국어: ");
		int kor = s.nextInt();
		System.out.println("영어: ");
		int eng = s.nextInt();
		System.out.println("수학: ");
		int math = s.nextInt();
		
		int sum = kor + eng + math;
		double avg = (int)(sum/3.0*10)/10.0;
		
		String str = " ";
		
		if(avg<=100 && avg>=90) {
			str = "A학점";
		}else if(avg<=90 && avg>=80){
			str = "B학점";
		}else if(avg<=80 && avg>=70) {
			str = "C학점";
		}else if(avg<=70 && avg>=60) {
			str = "F학점";
		}
		
		System.out.println("이름:" +name +"/" +"총점:" +sum 
				           +"/"+ "평균:"+avg +"/" +"학점:" +str);
		
	}

}