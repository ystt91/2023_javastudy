package day20.com.ict.edu;

public class Ex02 implements Runnable{
	
	int x = 0;
	
	@Override //synchronized 빼고도 넣고도 실행해보세용
	public synchronized void run() {
		
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + " : " +Thread.currentThread().getName());
		}
		
	}

}
