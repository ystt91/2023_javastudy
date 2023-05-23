package day11.com.ict.edu;

public class Ex03_main {

	public static void main(String[] args) {
		
		Ex03_method_Return m3 = new Ex03_method_Return();
		
//		System.out.println(m3.getSum());
//		System.out.println(m3.getAvg());
//		System.out.println(m3.getAvg());
		
		/*
		m3.getSum();
		m3.getAvg();
		m3.getHak();
		
		System.out.println(m3.sum);
		System.out.println(m3.eng);
		System.out.println(m3.hak);
		*/
		
		//return이 있으면, 반환형이면 
		//저장할 변수를 선언하고 받아주자
		
		int k1 = m3.getSum();
		double k2 = m3.getAvg();
		String k3 = m3.getHak();
	}

}
