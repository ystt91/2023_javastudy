package day09.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class Ex06_Array {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("인원수: ");
		int su = scan.nextInt();

		int [] suArr = new int[su];
		String[] nameArr = new String[su];
		int [] korArr = new int[su];
		int [] engArr = new int[su];
		int [] mathArr = new int[su];
		int [] sumArr = new int[su];
		double [] avgArr = new double[su];
		String [] hakArr = new String[su];
		int [] rankArr = new int[su];

//		for (int i = 0; i < su; i++) {
////			rankArr[i] = rankArr[i] + 1;
//			rankArr[i] = 1;
//		}

		for (int i = 0; i < su; i++) {
			System.out.println("이름: ");
			nameArr[i] = scan.next();
//			str = nameArr[i];
			
			System.out.println("국어점수 : ");
			korArr[i] = scan.nextInt();
//			kor = korArr[i];
			
			System.out.println("영어점수 : ");
			engArr[i] = scan.nextInt();
//			eng = engArr[i];
			
			System.out.println("수학점수 : ");
			mathArr[i] = scan.nextInt();
//			math = mathArr[i];
			
		}
		
		
		for (int i = 0; i < su; i++) {
			sumArr[i] = korArr[i] + engArr[i] + mathArr[i];
			avgArr[i] = (int) (sumArr[i] / 3.0 * 10) / 10.0;
			if (avgArr[i] >= 90) {
				hakArr[i] = "A학점";
			} else if (avgArr[i] >= 80) {
				hakArr[i] = "B학점";
			} else if (avgArr[i] >= 70) {
				hakArr[i] = "C학점";
			} else {
				hakArr[i] = "F학점";
			}
			
//			rankArr[i] = 1;
		}
		
		
		for (int i = 0; i < sumArr.length; i++) {
			for (int j = 0; j < sumArr.length; j++) {
				if(sumArr[i] == sumArr[j]) continue;
				if(sumArr[i]<sumArr[j])
					rankArr[i]++;
			}
		}
		
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < su; i++) {
			System.out.print(nameArr[i] +"\t");
			System.out.print(sumArr[i] +"\t" );
			System.out.print(avgArr[i] +"\t" );
			System.out.print(hakArr[i] +"\t" );
			System.out.println(rankArr[i]+"\t");
		}
		

	}

}
