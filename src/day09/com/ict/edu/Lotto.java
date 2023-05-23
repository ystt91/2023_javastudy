package day09.com.ict.edu;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// new 객체 생성 예약어
		int [] lotto = new int [45];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		int n1 = 0;
		int n2 = 0;
		
		for (int i = 0; i < lotto.length; i++) {
			n2 = (int)(Math.random()*45);
			
			n1 = lotto[i];
			lotto[i] = lotto[n2];
			lotto[n2] = n1;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
		}
		
		
	}
}
