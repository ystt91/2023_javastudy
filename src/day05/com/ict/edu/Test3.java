package day05.com.ict.edu;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * 이중 for 문으로 풀기 
		 * 1 0 0 0 
		 * 0 1 0 0 
		 * 0 0 1 0 
		 * 0 0 0 1
		 */
		
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if(i == j) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
		
	}
}
