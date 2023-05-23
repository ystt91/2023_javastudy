package day09.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//정보를 배열에 넣기 위해 배열을 미리 만들기 위해 인원수를 물어본다.
		System.out.println("학생수: ");
		int su = scan.nextInt();
		
		//미리 배열을 만든다.
		String[] name = new String[su];
		int[] kor = new int [su];
		int[] eng = new int [su];
		int[] math = new int [su];
		int[] sum = new int [su];
		double[] avg = new double[su];
		String[] hak = new String[su];
		int[] rank = new int[su];
		
		for (int i = 0; i < su; i++) {
			System.out.println("이름: ");
			name[i] = scan.next();
			
			System.out.println("국어점수: ");
			kor[i] = scan.nextInt();
			
			System.out.println("영어점수: ");
			eng[i] = scan.nextInt();
			
			System.out.println("수학점수: ");
			math[i] = scan.nextInt();
			
			sum[i] = kor[i] + eng[i] +math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}
			
			rank[i] = 1;
			
		}
		//순위
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				// i == j
				if(sum[i] == sum[j]) continue;
				if(sum[i]<sum[j]) {
					rank[i] ++;
				}
			}
		}
		//출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < su; i++) {
			System.out.print(name[i] +"\t");
			System.out.print(sum[i] +"\t" );
			System.out.print(avg[i] +"\t" );
			System.out.print(hak[i] +"\t" );
			System.out.println(rank[i]);
		}
		
	}

}
