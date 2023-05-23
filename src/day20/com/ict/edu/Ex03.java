package day20.com.ict.edu;

// 동기화 처리할 때 현재 실행 중인 스레드를 강제로 대기 상태로
// 변경 시키는 메서드 wait
// 한번 wait()된 스레드를 풀어주지 않으면 그대로 대기 상태로 끝난다
// wait()된 스레드를 풀어주는 예약어가 notify(), notifyAll()

public class Ex03 implements Runnable {

	int x = 0;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + ":" + Thread.currentThread().getName());
			if(x == 11) {
				try {
					wait();	
					// 현재 실행  중인 스레드가 대기 상태로 빠짐(잠시 중단)
					// notify()를 안 써주면 그대로 끝난다.
					// 처음 실행 되는 Thread는 11 찍고 대기 상태로 빠지는 것
					// 그리고 Thread 나머지는 실행됨
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}else {
					notify();
					// 11 되는 순간 대기 상태
					// 이론상으로는 처음 나오는게 중간에 나올 수 있다.
				}
				
			}
		}

		
	}


