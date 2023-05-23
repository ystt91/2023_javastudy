package day05.com.ict.edu;

public class Test {

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
   }
}
