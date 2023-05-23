package day11.com.ict.edu;

public class Ex02_main {

	public static void main(String[] args) {
		Ex02_method_Void m1 = new Ex02_method_Void();
		
		System.out.println("====메서드 실행 전 ===");
		System.out.println("총점: " +m1.sum);
		System.out.println("평균: " +m1.avg);
		System.out.println("학점: " +m1.hak);
		
		System.out.println("====메서드 실행 후 ===");
		
		m1.getSum();
	    m1.getAvg();
		m1.getHak();

//		System.out.println("총점: " +m1.sum);
//		System.out.println("평균: " +m1.avg);
//		System.out.println("학점: " +m1.hak);
		

		
		
	}

}
