package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex11_Map_Me {

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

		Iterator<String> it = country.keySet().iterator();


		esc:for (String coun : country.keySet()) {
			
			System.out.println("나라를 말씀하시면 수도를 알려드립니당.");
			coun = scan.next();
			
			System.out.println(coun + "의 수도는 " +country.get(coun));
			
			esc2 : while(true) {
				System.out.println("계속할까요? Y(y)/N(n)");
				String choice = scan.next();

				if (choice.equalsIgnoreCase("y")) {
					continue esc;
				} else if (choice.equalsIgnoreCase("n")) {
					break esc;
				} else {
					continue esc2;
				}
			}
		}
		

	}
}
