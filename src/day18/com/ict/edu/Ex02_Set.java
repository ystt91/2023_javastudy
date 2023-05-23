package day18.com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {
		
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 : 중복 안댐, 특정 기준으로 정렬할 수 없다.
		//		 (단, TreeSet은 항상 오름차순을 유지한다.)
		// 형식 : HashSet<제네릭타입=객체타입=클래스> 참조변수 = new HashSet<제네릭타입=객체타입=클래스>();
		//															  (생략 가능)
		//		 TreeSet<제네릭타입=객체타입=클래스> 참조변수 = new TreeSet<제네릭타입=객체타입=클래스>();
		//															  (생략 가능)
		
		// 1. 컬렉션 생성 ( 래퍼클래스 : 기본 자료형들을 클래스로 만들어주는 클래스)
		// 			   (Integer, Double, Character, String)
		HashSet<Integer> h1 = new HashSet<>();
							//new : 힙 메모리에 사용 공간을 차지하게 댐
		HashSet<Double> h2 = new HashSet<>();
		HashSet<Character> h3 = new HashSet<>();
		HashSet<String> h4 = new HashSet<>();
		
		System.out.println(h1);
		
		// 2. 컬렉션에 객체 넣기(add)
		h1.add(new Integer(14));
		h1.add(new Integer("16"));
		h1.add(20);  //오토박싱 : 기본자료형이 해당 객체로 만들어진다.  int = > Integer
					 //오토언박싱 : 해당 객체를 기본 자료형으로 되돌리는 것 
		System.out.println(h1);
		
		h2.add(new Double(30.1));
		h2.add(new Double("35.1"));
		h2.add(38.2);
		// h2.add(30); int가 안 들어가짐. 프로모션이 안댐. 무조건 제네릭 타입을 맞춰야 한다.
		System.out.println(h2);
		
		h3.add(new Character('j'));
		h3.add('a');
		h3.add('v');
		h3.add('a'); // 중복 불가, 들어가지 않ㅇ므
		System.out.println(h3);
		
		System.out.println("하나씩 처리하기 (개선된 for문)");
		for (Integer k : h1) {
			System.out.println(k+10);
		}
		System.out.println();
		
		System.out.println("하나씩 처리하기 (iterator)");
		Iterator<Double> it = h2.iterator(); //제네릭 타입이 알아서 바낌 h1,h2,h3 넣고 주석 설명 한번 보세요
		while (it.hasNext()) {
			Double k = (Double) it.next();
			System.out.println(k);
		}
		System.out.println();
		Iterator<Character> it2 = h3.iterator();
		while (it2.hasNext()) {
			Character k = (Character) it2.next();
			
		}
	}
}
