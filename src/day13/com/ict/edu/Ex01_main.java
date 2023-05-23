package day13.com.ict.edu;

public class Ex01_main {

	public static void main(String[] args) {
		
		Ex01_Constructor p1 = new Ex01_Constructor();
		
		System.out.println(p1);
		
		System.out.println(p1.getName());
		
		Ex01_Constructor p2 = new Ex01_Constructor();
		
		p2.setName("바보");
		
		System.out.println(p2.getName());
		
	}

}
