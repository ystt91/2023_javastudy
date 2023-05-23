package day06.com.ict.edu2;

import java.util.Scanner;

public class ScannerTest {

		/*
		 * 원하는 횟수를 입력 받고 숫자를 입력 받아서 
		 * 입력 받은 숫자가 홀수인지
		 * 짝수인지 판별하는 코딩
		 */
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			
			
			System.out.print("원하는 숫자: ");
			int num = s.nextInt();
			System.out.print("원하는 횟수: ");
			int su = s.nextInt();
			
			String str = " ";
			
			if(num%2 == 0)
				str = "짝수";
			else
				str = "홀수";
			
			for (int i = 0; i < su; i++) {
				System.out.println(str);
			}
			
		}
	}

	
