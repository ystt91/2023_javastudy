package day05.com.ict.edu;

public class Day05test {

	public static void main(String[] args) {
		/*
		 1. if~ else문 
        농구공 5개씩 한 박스에 들어간다. 
        40개면 8상자, 26개면 6개이다.
        int k1 = 127개이다. 
        몇 상자가 필요한가요?
		 */
		
		int box = 5;
		int k1 = 127;
		
		if(k1%box == 0) {
			System.out.println(k1/box);
		} else{
			System.out.println((k1/box)+1);
		}
		
		/*
		 * for 문으로 플기 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
		 * 
		 */

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		
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
		
		 /*
	     1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
	     */
			
			    int sum = 0;
			    int count = 0;
			    for(int i=1;i<200;i++) {
			    	if(i%2 == 0) {
			    		sum = sum *-1;
			    	}else {
			    		sum = sum + i ;
			    	}
			    	count = i;
			    }
			    System.out.println(sum);
			    System.out.println(count);
			    
			    /*
				 
				 *
				 **
				 ***
				 ****
				 
				 */
				
				for (int  i = 1;  i<5; i++) {
					for (int j=1; j<5; j++) {
						if(i>=j) {
							System.out.print("*");
						}
					}
					System.out.println();
				}
				
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
	}

}
