package day07.com.ict.edu;

import java.util.Scanner;

public class Ex01_Scanner3 {

	public static void main(String[] args) {
		//계속할까요(1.yes,2.no)일 때 Ex01_Scanner2는 숫자로 받았는데
		//문자가 들어오면 오류가 발생된다.
		//그래서 문자로 받아서 처리하자.
		
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

			while (true) {
				System.out.print("계속할까요?(Y(y), N(n)) >>");
				String s1 = scan.next();

				if (s1.equalsIgnoreCase("y")) {
					continue esc;
				} else if (s1.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.print("잘못 입력되었습니다.");
				}
			}
		}
		//double per = (evencount/(count*1.0)) * 100;
		System.out.println("전체 갯수: " +count);
		System.out.println("짝수 갯수: " +evencount);
		System.out.println("짝수가 나온 확률: " + (int) (evencount * 100 / count) + "% 입니다.");

	}
}