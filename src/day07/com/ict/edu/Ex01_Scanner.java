package day07.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 전체 횟수, 짝수 횟수, 짝수가 나온 퍼센트 구하기(소숫점 첫째자리 까지 구하자)

		int count = 0;
		int evencount = 0;
		String str = " ";
		int i = 0;

		esc: while (true) {
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();

			if (su % 2 == 0) {
				str = "짝수";
				evencount = evencount + 1;
			} else {
				str = "홀수";
			}
			
			count = count + 1;

			System.out.print(su + "는 " + str + "입니다.");

			
			while(true) {
				System.out.print("계속할까요?(1.yes, 2.no) >>");
				su = scan.nextInt();
				
				if (su == 1) {
					continue esc;
				} else if (su == 2) {
					break esc;
				} else if (su == 0 || su >= 3) {
					System.out.print("제대로 입력하세요.");
				}
			}
		}
      System.out.println("결과: " + (int) (evencount * 100 / count) + "% 입니다.");

	}
}