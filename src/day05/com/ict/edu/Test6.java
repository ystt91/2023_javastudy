package day05.com.ict.edu;

public class Test6 {

	public static void main(String[] args) {
		/*
		 
	    *
	   **
	  ***
	 ****
	 
	 */
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1 ; j < 5; j++) {
				if(j<5-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		/*
		for (int i = 1; i < 5; i++) {
			for (int j = 4 ; j > 0; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
		
	}
}
			/*
			//i == 1 인 경우
			for(int k = 1; k<5;k++) {
				if(k <4) {
					System.out.println(" ");
				} else {
					System.out.println("*");
				}
			}
			//i == 2 인 경우
			for(int k = 1; k<5;k++) {
				if(k <3) {
					System.out.println(" ");
				} else {
					System.out.println("*");
				}
			}
			//i == 3 인 경우
			for(int k = 1; k<5;k++) {
				if(k <2) {
					System.out.println(" ");
				} else {
					System.out.println("*");
				}
			}
			
			//i == 4 인 경우
			for(int k = 1; k<5;k++) {
				if(k <1) {
					System.out.println(" ");
				} else {
					System.out.println("*");
				}
			}
			System.out.println(" ");

			System.out.println(" ");
			
			System.out.println(" ");
			
			System.out.println("*");
		}
		*/


