package day12.com.ict.edu;

import java.util.Scanner;

public class Ex01_main2 {

	public static void main(String[] args) {

//		Ex01_method[] arr = new Ex01_method[4];
//		arr[0] = coffee;
//		arr[1] = ion;
//		arr[2] = coke;
//		arr[3] = juice;

		Scanner scan = new Scanner(System.in);

		Ex01_method coffee = new Ex01_method();
		coffee.name = "커피음료";
		coffee.price = 1000;

		Ex01_method ion = new Ex01_method();
		ion.name = "이온음료";
		ion.price = 1500;

		Ex01_method coke = new Ex01_method();
		coke.name = "탄산음료";
		coke.price = 1200;

		Ex01_method juice = new Ex01_method();
		juice.name = "탄산음료";
		juice.price = 1800;

		Ex01_method[] arr = { coffee, ion, coke, juice };

		int input = 0;

		System.out.println("금액을 투입하세요");
		input = scan.nextInt();

		esc: while (true) {
			if (input < 1000) {
				System.out.println("금액이 부족합니다.");
				System.out.println("현재 돈: " + input);
				break esc;
			} else {
				System.out.println("커피\t이온\t탄산\t과일");
			}

			// 입력금액과 각 음료수의 가격을 비교

			for (int i = 0; i < arr.length; i++) {
				if (arr[i].price <= input) {
					System.out.print("O\t");
					// System.out.print(arr[i].name+"\t");
				} else {
					System.out.print("X\t");
				}
			}

			System.out.println();

			System.out.print("선택하세요>>");

			String drink = scan.next();

			int output = 0;

			switch (drink) {
			case "커피":
				output = input - arr[0].price;
				break;
			case "이온":
				output = input - arr[1].price;
				break;
			case "탄산":
				output = input - arr[2].price;
				break;
			case "과일":
				output = input - arr[3].price;
				break;
			default:
				System.out.println("잘못 선택하셨네요");
				output = input;
			}

			if (output >= 1000) {
				System.out.println("잔돈이 천원 이상입니다. 다른 음료를 선택하세요");
				input = output;
				continue esc;
			} else if (output < 1000) {
				System.out.println("잔돈: " + output);
				break esc;
			}

		}

	}
}
