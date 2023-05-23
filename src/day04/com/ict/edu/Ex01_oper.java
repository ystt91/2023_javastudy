package day04.com.ict.edu;

public class Ex01_oper {

	public static void main(String[] args) {
		/*
		  삼항 연산자 : 조건식=> 조건이 참일때와 거짓일때를 구분해서 실행한다.
		  형식) 자료형 변수이름 = (조건식)?조건식이 참일 때 실행할 문장 : 조건식이 거짓일 때 실행할 문장;
		  주의사항) 변수, 참일때 실행 결과, 거짓일 때 실행 결과 모두 같은 자료형(데이터 타입)이어야 한다.
		  조건식에는 boolean(true,false), 비교연산자(<,>), 논리연산자(AND,OR,NOT)
		*/
		
		  String str = (true) ? "강아지" : "고양이";
		//String str = (true) ? "강아지" : 10; 컴파일 오류
		  System.out.println(str);
		  
		  str = (false) ? "강아지" : "고양이";
		  System.out.println(str);
		  
		//int avg = 80;
		//실수와 정수는 비교할 수 있는가? 가능
		  double avg = 85.3;
		  str = (avg>=60)?"합격":"불합격";
		  System.out.println(str);
		  
		  char c1 = 'g';
		  str = (c1 >= 'a' && c1 <= 'z')?"소문자":"소문자 아님";
		  System.out.println(str);
		  
          c1 = 'K';
		  str = (c1 >= 'a' && c1 <= 'z')?"소문자":"소문자 아님";
		  System.out.println(str);
		  
		  //1 또는 3이면 남자, 아니면 여자
		  int gender = 1;
		  str = (gender == 1 || gender == 3)?"남자":"여자";
		  System.out.println(str);
		  
		  //홀수이면 남자, 짝수이면 여자
		  gender = 4;
		  str = (gender%2 == 1)?"남자":"여자";
		  System.out.println(str);
		  
		  //3의배수인지 아닌지 알아보자
		  int su1 = 157;
		  str = (su1%3 == 0)?"3의 배수":"3의 배수 x";
		  System.out.println(str);
		  
	}
}
