package day09.com.ict.edu;

public class Ex01_Array {

	public static void main(String[] args) {
//		배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
//				반드시 같은 자료형이어야 한다. (단, 프로모션, 디모션 가능)
//		
//				생성할 때 반드시 크기(타입)를 지정해야 된다
//				한번 지정된 크기는 변경되지 않는다.
//				배열 데이터를 추출할 때는 일반적으로 for문을 사용한다.
//		
//		배열의 종류 : -1차원 배열과 다차원 배열(배열 안에 배열 존재)
//					- 기본자료형 배열과 참조자료형 배열(객체 배열)
//		
//		배열 생성 순사 : 선언=>생성=>초기화(데이터 저장)
//		1. 선언 : 자료형[] 이름, 또는 자료형 이름[];
//		
        int [] su;
//		
//		2.생성 : 이름 = new 자료형[배열의 크기 = 방의 수 = length = 길이];
//		
//				  new 예약어 : 메모리에 데이터를 저장할 공간을 만들어라
//							 => 인스턴스, 객체 생성
		su = new int[4];
		
//		3. 데이터 저장 : 이름[index = 방번호 = 위치 = 0부터]
//					  같은 자료형이어야만 저장 가능 (프로모션, 디모션 가능)
		su[0] = 100;
		su[1] = 'a'; //프로모션
		su[2] = (int) 2.4; //디모션 형변환 하면 가능
		su[3] = 124;
//		su[4] = 14; //실행오류 (배열 크기 보다 크면 실행 오류)
		su[0] = 12; //현재 데이터를 삭제하고 12가 저장된다.(변수와 같음)
		
//		배열을 호출하면 주고(생성ID)가 출력
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		
		System.out.println("======================");
		
//		인덱스와 length 1차이
		for (int i = 0; i < su.length; i++) {
			if(i%2==0)
			System.out.println(su[i]*10);
			else
			System.out.println(su[i]);
		}
		
		System.out.println("======================");
		
//		개선된 for문 : 배열이나 컬렉션에 주로 사용
//					배열 전체에 대해서 정보 출력 및 가공 가능
//					그러나 특정 몇개나 특정 하나를 별도로 출력하거나 가공할 수 없다.(단점)
//					인덱스 값을 이용할 수 없다.
		
//		: => 오른쪽 배열을 하나씩 순서대로 왼쪽에 넘긴다.
		
		for (int k : su) {
			if(k>90)
				System.out.println(k*10);
			else
				System.out.println(k);
		}
		
		
	}

}
