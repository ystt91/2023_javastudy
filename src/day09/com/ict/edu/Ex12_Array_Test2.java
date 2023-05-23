package day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array_Test2 {

	public static void main(String[] args) {
		
		/*
		 int[][0] = 번호
		 int[][1] = 국어
		 int[][2] = 영어
		 int[][3] = 수학
		 int[][4] = 총점
		 int[][5] = 평균
		 int[][6] = 학점
		 int[][7] = 순위(초기값 지정)
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.print("인원 수: ");
		int su = scan.nextInt();

		int[][] num = new int[su][8];

		for (int i = 0; i < su; i++) {
			System.out.print("번호: ");
			num[i][0] = scan.nextInt();

			System.out.print("국어 점수: ");
			num[i][1] = scan.nextInt();

			System.out.print("영어 점수: ");
			num[i][2] = scan.nextInt();

			System.out.print("수학 점수: ");
			num[i][3] = scan.nextInt();

			num[i][4] = num[i][1] + num[i][2] + num[i][3];
			num[i][5] = num[i][4] / 3;

			if (num[i][5] >= 90)
				num[i][6] = 'A';
			else if (num[i][5] >= 80)
				num[i][6] = 'B';
			else if (num[i][5] >= 70)
				num[i][6] = 'C';
			else
				num[i][6] = 'F';

			num[i][7] = 1;
		}

		for (int i = 0; i < su; i++) {
			for (int j = 0; j < su; j++) {
				if (num[i][4] < num[j][4]) {
					num[i][7]++;
				}
			}
		}

		int [] tmp;

		for (int i = 0; i < su - 1; i++) {
			for (int j = i + 1; j < su; j++) {
				if (num[i][7] < num[j][7]) {
					tmp = num[i];
					num[i] = num[j];
					num[i] = tmp;
				}
			}
		}

		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t순위\t");
		for (int i = 0; i < su; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}

	}

}