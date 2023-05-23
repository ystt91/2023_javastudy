package day05.com.ict.edu;

import java.util.Iterator;

public class Test4 {

	public static void main(String[] args) {
		
		
   /*
     1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
   */
		
//		
//		    int sum = 0;
//		    int count = 0;
//		    for(int i=1;i<200;i++) {
//		    	if(i%2 == 0) {
//		    		sum = sum *-1;
//		    	}else {
//		    		sum = sum + i ;
//		    	}
//		    	count = i;
//		    }
//		    System.out.println(sum);
//		    System.out.println(count);
		
		int sum = 0;
		int cnt = 0;
		int i = 1;
		while(true) {
			if(i%2 == 0) {
				sum = sum +(i*-1);
			}else{
				sum = sum +(i*1);
			}
			cnt = i;
			if(sum>=100) {
				break;
			}
			i++;
		}
		System.out.println(cnt);
	    
	    
	}

}
