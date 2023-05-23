package day03.com.ict.edu;

public class Test05 {

	public static void main(String[] args) {
		/*결과
		  천의 자리:3
		  백의 자리:7
		  십의 자리:8
		  일의 자리:1
		*/
		
		int su = 3781;
		
		int su1 = su/1000;
		int su2 = su/100%10;
		int su3 = su%100/10;
		int su4 = su%10;
		System.out.println("천의자리: " +su1);
		System.out.println("백의자리: " +su2);
		System.out.println("십의자리: " +su3);
		System.out.println("일의자리: " +su4);		
		
	    System.out.println("=================================");
		
		int num = 3781;
		int c = 0;
		int b = 0;
		int s = 0;
		int i = 0;
		int res = 0;
		
		c = num/1000;     // 3
		res = num%1000;   // 781
		b = res/100;     // 7
		res = res%100;   // 81 
		s = res/10;      // 8
		i= res%10;       // 1
		
		System.out.println("천의자리: " +c);
		System.out.println("백의자리: " +b);
		System.out.println("십의자리: " +s);
		System.out.println("일의자리: " +i);		
		
	}
}
