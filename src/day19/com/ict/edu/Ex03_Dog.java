package day19.com.ict.edu;

public class Ex03_Dog implements Runnable{
	
	// thread는 start와 run 둘다 가지고 있지만
	// runnable는 run만 가지고 있다
	@Override
	public void run() {
		while(true) {
			System.out.println("멍~~멍~~" +Thread.currentThread().getName());
		}
		
	}

}
