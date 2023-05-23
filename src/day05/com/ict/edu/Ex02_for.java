package day05.com.ict.edu;

public class Ex02_for {
	public static void main(String[] args) {
		 /*
		  for문 : 정해진 규칙에 따라 실행문을 반복 처리한다.
		  형식) for(초기식; 조건식; 증감식){
		          조건식이 참일 때 실행할 문장;
		          조건식이 참일 때 실행할 문장;
		          조건식이 참일 때 실행할 문장;
		        }
		  ** for문을 만나면 무조건 초기식으로 이동
		     초기식은 조건식으로 이동
		     조건식이 참이면 for문 실행, 거짓이면 for문을 실행하지 않는다.
		     for문의 끝을 만나면 무조건 증감식으로 간다.
		     
		     {}에서 만들어진 변수는 {}밖을 벗어나면 사라진다.(사용 불가)
		     
		  */
		
		//초기식을 만나서 조건식이 참일 때 구현부 실행
		//구현부 끝을 만나면 증감식으로 간다
		//증감식을 만나서 조건식으로 간다
		//조건 참 실행
		
		//거짓일 때 for문 탈주
		  
		
		//안녕하세요를 열번 출력하기
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " = 안녕하세요");
		}
		
		System.out.println("========================");
		
		//0~10까지 출력
		for(int i = 0;i<11;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n========================");
		
		//0~10까지 짝수만 출력	
		for(int i = 2;i<11;i = i+2) {
			System.out.print(i+" ");	
		}
		
	    System.out.println("\n========================");
	    
	    for (int i = 0; i < 11; i++) {
			if(i%2 == 0)
			System.out.print(i +" ");
		}
	    
	    System.out.println("\n========================");
	    
	    //구구단 중 7단을 출력하세용
	    for(int i = 1; i<10;i++) {
	    	System.out.println("7 x "+i+" = " +(7*i));
	    }
	    
	    System.out.println("\n========================");
	    
	    //1~10 누적합 (합계 구하기)
	    //누적합 공식 : 이전 저장 변수 = 이전 저장 변수 + 현재값
	    int sum = 0;
	    for (int i = 0; i < 11;i++) {
	    	System.out.println(sum + "," + i);
	    	sum = sum + i;
		}
	    System.out.println("누적합 : " +sum);
	    
	    System.out.println("\n========================");
	    
	    //0~10까지 짝수의 누적합
	    int even = 0;
	    for (int i = 0; i < 11; i = i+1) {
	    	if(i%2 ==0)
	    		even = even + i;
		}
	    System.out.println("0~10 짝수의 누적합: " + even);
	    
	    System.out.println("\n========================");
	    
	    // 7! = 7*6*5*4*3*2*1
	    sum = 1;
	    for (int i = 1;i<8;i++){
	    	sum = i*sum;
	    }
	    System.out.println("7!" +sum);
	    
	    // 다른 풀이
	    sum = 1;
	    for (int i = 7;i>0;i--){
	    	sum *= i;
	    }
	    System.out.println("7!" +sum);
	    
	    System.out.println("\n========================");
	    
	    // 1 + (-2) + 3 +(-4) +5 (-6) + 7 +(-8) + 9 +(-10)
	    
	    sum = 0;
	    for(int i=1;i<11;i++) {
	    	if(i%2 == 0) {
	    		sum = sum +(i*-1);
	    	}else {
	    		sum = sum + i;
	    	}
	    }
	    System.out.println(sum);
	    		
	}
}

