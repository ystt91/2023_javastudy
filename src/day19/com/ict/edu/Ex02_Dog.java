package day19.com.ict.edu;


public class Ex02_Dog extends Thread {
//	public void start() {
//		for (int i = 0; i < 20; i++) {
//
//			System.out.println("멍멍~~~멍~~~~~" + Thread.currentThread().getName());
//
//		}
//	}
	// start를 만들면 thread 처리가 안된거

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {

			System.out.println("멍멍~~~멍~~~~~" + Thread.currentThread().getName());

		}

	}


}
