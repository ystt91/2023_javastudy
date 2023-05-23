package day06.com.ict.edu;

public class Ex03_break_continue {

	public static void main(String[] args) {
//		break와 continue
//		break : 현재 위치의 블록을 탈출하는 예약어 or 명령어
//		continue : continue만을 만나면 아래 수행문을 포기하고 다음 회차를 하기 위해서 **증감식으로 이동
//		
//		보통 if문과 함께 사용 된다.
//		break는 for문과 while문에 모두 사용, continue는 for문에만 사용하는게 좋다.
		
		// 1~ 10 출력
		
		for (int i = 0; i < 11; i++) {
		    System.out.print(i +" ");
		}
		System.out.println();
		
		// 1~ 10 출력 6일 때 break 사용
		
		//5까지만 찍힘
		for (int i = 0; i < 11; i++) {
			if(i == 6) break;
			System.out.print(i +" ");
		}
		System.out.println();
			
		//6까지 찍힘	
		for (int i = 0; i < 11; i++) {
		    System.out.print(i +" ");
			if(i == 6) break;
		}
		System.out.println();
		
		System.out.println("=====================");
		
		// 1~ 10 출력 6일 때 continue사용
		
		//5까지만 찍힘
		for (int i = 0; i < 11; i++) {
			if(i == 6) continue;
			System.out.print(i +" ");
		}
		System.out.println();
			
		//6까지 찍힘	
		for (int i = 0; i < 11; i++) {
		    System.out.print(i +" ");
			if(i == 6) continue;
		}
		System.out.println();
		
		System.out.println("=====================");
		
		//0~10까지 홀수만 출력하자(continue)
		for (int i = 0; i < 11; i++) {
			if(i%2 == 0) continue;
			System.out.print(i);
		}
		System.out.println();
		
		
	}
}
