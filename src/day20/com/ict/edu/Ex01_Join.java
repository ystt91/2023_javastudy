package day20.com.ict.edu;

//join() : 현재 스레드는 join()를 호출한 스레드가 끝날때까지
//		   대기 상태로 빠져 있다가 join()를 호출한 스레드가 끝나면
//		   다시 실행한다.

//		   즉, join()를 호출한 스레드가 끝나야 실행 할 수 있다.

public class Ex01_Join {

	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());

		Ex01 test = new Ex01();

		Thread dog = new Thread(test,"dog");
		Thread cat = new Thread(test,"cat");
		//dog.setDaemon(true);
		dog.start();
		cat.start();
		
		//캣은 조인 안 걸어놧기 때문에 구냥 찍혀버림
		//dog도 cat도 Ex01 run()를 참조 중
		//dog이 나오다가 cat도 나오고 그럼
		//임계영역 : 멀티 스레드에서 공통으로 사용되는 영역
		//         현재 실행중인 스레드가 다른 스레드에게 제어권을 빼앗긴다.
		
		try {
			dog.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main : " +Thread.currentThread().getName());
		
	}
}
