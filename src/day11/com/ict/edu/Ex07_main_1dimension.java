package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main_1dimension {

	public static void main(String[] args) {
		// 5명의 이름,국어,영어,수학을 입력 받아서
		// 이름, 총점,평균,학점를 구하고
		// 출력하자
		//입력 받기
		
		Ex07_method m1 = new Ex07_method();
		
		Scanner scan = new Scanner(System.in);
		int su = scan.nextInt();
		
		String[] name = new String[su];
		int [] kor = new int[su];
		int [] eng = new int[su];
		int [] math = new int[su];
		int [] sum = new int[su];
		double [] avg = new double[su];
		String [] hak = new String[su];
		
		for (int i = 0; i < su; i++) {
			
			System.out.print("이름: ");
			name[i] = scan.next();
			
			System.out.print("국어: ");
			kor[i] = scan.nextInt();
			
			System.out.print("영어: ");
			eng[i] = scan.nextInt();
			
			System.out.print("수학: ");
			math[i] = scan.nextInt();
			
//			//총점 구하기
//			sum[i] = m1.getSum(kor[i], eng[i], math[i]);
//			sum[i] = m1.sum;
//			//평균 구하기
//			m1.getAvg();
//			avg[i] = m1.avg;
//			//학점 구하기
//			m1.getHak();
//			hak[i] = m1.hak;
//			
		}
		System.out.println("이름\t총점\t평균\t학점\t");
		for (int i = 0; i < su; i++) {
			System.out.print(name[i] +"\t");
			System.out.print(sum[i] +"\t" );
			System.out.print(avg[i] +"\t" );
			System.out.println(hak[i]);

		}
		
//		for (int i = 0; i <  su; i++) {
//			System.out.println("이름: " +name[i]);
//			System.out.println("총점: " +s1);
//			System.out.println("평균: ");
//		}
		
	}

}