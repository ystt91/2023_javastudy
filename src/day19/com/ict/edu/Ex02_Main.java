package day19.com.ict.edu;

public class Ex02_Main {

	public static void main(String[] args) {
		System.out.println("스레드이름 : " + Thread.currentThread().getName());
		
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		
		//여기까지는 메인 담당
		
		//멀티 스레드 : 여러개의 스레드를 만들어서 병렬 처리
		//스레드 만드는 방법 : start()를 호출해서 run()로 가면 스레드 생성 (일꾼 생성)
		
		//메인에서 스레드 만들어놓고 dog에 일꾼 하나 생성 후 메인으로 돌아옴
		//					 cat에 일꾼 하나 생성 후 메인으로 돌아옴
		
		dog.start();
		cat.start();
		System.out.println("main : " + Thread.currentThread().getName());
		
	}

}
