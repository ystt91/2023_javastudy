package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main_2dimension {
	public static void main(String[] args) {
	
	System.out.print("학생수: ");
	Scanner scan = new Scanner(System.in);
	int su = scan.nextInt();
	
	Ex07_method m1 = new Ex07_method();
	
	double [][] info = new double[su][8];
	
	for (int i = 0; i < info.length; i++) {
		
		
		double [] p = new double[8];
		
		System.out.print("번호: ");
		p[0] = scan.nextInt();
		
		System.out.print("국어: ");
		p[1] = scan.nextInt();
		
		System.out.print("영어: ");
		p[2] = scan.nextInt();
		
		System.out.print("수학: ");
		p[3] = scan.nextInt();
		
		//총점 구하기
		double k1 = m1.getSum(p[1],p[2],p[3]);
		p[4] = k1;
		//평균 구하기
		double k2 =m1.getAvg(p[4]);
		p[5] = k2;
		//학점 구하기
		m1.getHak(p[5]);
		p[6] = m1.hak;
		
		
		p[7] = 1;
		
		info[i] = p;
	}
	
	//순위
	for (int i = 0; i < info.length; i++) {
		for (int j = 0; j < info.length; j++) {
			if(info[i][4]<info[j][4]) {
				info[i][7]++;
			}
		}
	}
	
	//순위 오름차순
	double[] tmp = new double [8];
	
	for (int i = 0; i < info.length-1; i++) {
		for (int j = i+1; j < info.length; j++) {
			if(info[i][7]>info[j][7]) {
				tmp = info[i];
			    info[i] = info[j];
			    info[j] = tmp;
			}
		}
	}
	
	//출력
	System.out.println("번호\t국어\t영어\t수학\t총합\t평균\t학점\t순위");
	for (int i = 0; i < info.length; i++) {
		for (int j = 0; j < info[i].length; j++) {
			if(j == 6) {
				System.out.print((char)info[i][6]+"\t");
			}else {
				System.out.print(info[i][j]+"\t");
			}
		}
		System.out.println();
	}
	
	
  }
}
