package day06.com.ict.edu2;

import java.util.Scanner;

public class ScannerTest3 {

	public static void main(String[] args) {
		/*
		첫번째 숫자 받기
		두번째 숫자 받기
		연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
		*/
		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("첫번째 숫자: ");
//		int num1 = s.nextInt();
//		System.out.print("두번째 숫자: ");
//		int num2 = s.nextInt();
//		System.out.println(" 1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ");
//		int num = s.nextInt();
//		
//		int add = num1+num2;
//		int subs = num1-num2;
//		int multi = num1*num2;
//		double di = (int)(num1/(double)num2*100)/100.0;
//		
//		
//		
//		if(num == 1) {
//			System.out.println("결과: " +add);
//		}else if(num == 2) {
//			System.out.println("결과: " +subs);
//		}else if(num == 3) {
//			System.out.println("결과: " +multi);
//		}else if(num == 4) {
//			System.out.println("결과: " +di);
//		}
		
        Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = s.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = s.nextInt();
		System.out.println(" 1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ");
		int num = s.nextInt();
		
		double res = 0.0;
		String oper = " ";
		if(num ==1) {
			res = num1 + num2;
			oper = "+";
		}else if(num == 2) {
			res = num1 - num2;
			oper = "-";
		}else if(num == 3) {
			res = num1 * num2;
			oper = "*";
		}else if(num == 4) {
			res = (int)(num1 *10/num2)/10.0;
			oper = "/";
		}
		
		System.out.println(num1 + oper +num2 +"=" +res);

		
			
			
			
	}
}