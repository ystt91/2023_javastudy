package day05.com.ict.edu;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * for 문으로 플기 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
		 * 
		 */

//		for (int i = 1; i < 5; i++) {
//			for (int j = 1; j < 5; j++) {
//				System.out.print("0 ");
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if(i%4 == 0) {
				System.out.println();
			}
		}
	}

}
