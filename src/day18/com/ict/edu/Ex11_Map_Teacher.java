package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex11_Map_Teacher {

	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성

		Scanner scan = new Scanner(System.in);

		HashMap<String, String> country = new HashMap<>();
		country.put("대한민국", "서울");
		country.put("캐나다", "오타와");
		country.put("영국", "런던");
		country.put("스위스", "베른");

		Set<String> keys = country.keySet();

		esc: while (true) {
			System.out.print("나라입력 : ");
			String str = scan.next();
			if (keys.contains(str)) {
				String res = country.get(str);
				System.out.println(str + "의 수도는" + res + "입니다.");
			} else {
				System.out.println("데이터에 없는 나라입니다.");
			}
			while (true) {
				System.out.print("계속할까요?(y/n) >>>");
				String msg = scan.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				} else if (msg.equalsIgnoreCase("n")) {
					break esc;
				} else {
					continue;
				}
			}
		}

	}
}
