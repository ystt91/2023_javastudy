package day14.com.ict.edu5;

public class Ex02_main {

	public static void main(String[] args) {
		
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		
		dog.sound();    
		dog.hobby();    
		System.out.println(dog.eyes);   
		System.out.println(dog.color);   
		
		System.out.println();
		
		cat.sound();
		cat.hobby();
		System.out.println(cat.eyes);
		System.out.println(cat.color);
		
		System.out.println();
		
		//객체 생성
		//부모클래스 변수 = new 자식클래스 생성자();
		//부모 클래스로 선언하면 부모 클래스가 갖고 있는건 다 쓸 수 있다.
		//자식 클래스만 갖고 있는건 못 쓴다.
		
		
		//다형성
		
		Ex02_Animal animal = null; //null값을 줘서 초기화를 해줘야함
		int su = 2;
		if(su == 1) {  //고양이
			animal = new Ex02_Cat();
		}else if(su == 2) {  //강아지
			animal = new Ex02_Dog();
		}
		
		
		//오버라이딩
		animal.sound();
		animal.play();
		
		//부모 것만 나옴
		System.out.println(animal.color);
		
		
		System.out.println(animal.eyes);
		
		//자식 클래스가 가지고 있는 것은 사용 불가
		//컴파일 오류 animal.play();
		
	}

}
