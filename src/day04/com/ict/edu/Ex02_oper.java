package day04.com.ict.edu;

public class Ex02_oper {

	public static void main(String[] args) {
		// 중첩 삼항 연산자 : 삼항 연산자가 중첩 되는 것
		// 형식) 자료형 변수이름 = (조건식 1) ? [(조건식2)?조건식2가 참일때 : 조건식2가 거짓일 때] : 조건식1이 거짓일 때
		// 형식) 자료형 변수이름 = (조건식 1) ? 조건식1이 참일때 : [(조건시2)?조건식2가 참일때 : 조건식2가 거짓일 때]
		// 일반적으로 2번째 방식을 많이 쓴다
		
		//int k1이 90이상이면 A학점, 80이상이면 B학점, 나머지는 "F학점"
		
		int k1 = 84;
		
		String str = (k1>=90)? "A학점" :(k1>=80)?"B학점":"F학점";
		System.out.println(str);
		
		//char k2가 대문자인지, 소문자인지, 기타문자인지 판별하자
		
		char k2 = 'A';
		
		str = ('A' >= k2 && k2 <= 'Z')?"대문자":('a' <= k2 && k2 <= 'z')?"소문자":"기타문자";
		System.out.println(str);
		
		//int k3이 1 or 3이면 남자, 2 or 4이면 여자
		//        1 or 2 1900년대 태어남, 3 or4 2000년 태어남, 나머지는 외국인
		
		int k3 = 3;
		str = (k3 == 1 || k3 == 3)?(k3 == 1)?"1900년대 출생 남자":"2000년대 태어난 남자" :
			  (k3 == 2 || k3 == 4)?(k3 == 2)?"1900년대 출생 여자":"2000년대 태어난 여자": "외국인";
		
		System.out.println(str);
		        
		
	}

}
