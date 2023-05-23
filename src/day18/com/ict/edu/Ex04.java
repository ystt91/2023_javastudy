package day18.com.ict.edu;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		
		// 컬렉션을 배열로 => toArray();
		// 배열을 컬렉션으로 => Arrays.asList();
		
		String[] str = {"java", "Java", "JAVA", "자바"};
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		
		for (String k : str) {
			set1.add(k);
		}
		System.out.println(set1);
		System.out.println();

		// set1의 모든 요소를 set에 넣어 주세요(addAll());
		set2.addAll(set1);
		System.out.println(set2);
		System.out.println();
		
		// 삭제; clear(), remove(Object o)
		// 비어있는지 확인 : isEmpty();
		set1.clear();
		System.out.println(set1);
		System.out.println(set1.isEmpty());
		System.out.println();
		
		System.out.println(set2.remove("JAVA"));   //기대값 true
		System.out.println(set2.remove("jaVA"));   //기대값 false, 없다고오류가 아님, 없어서 삭제 못했어! 이거임
		System.out.println();
		
		// 중복불가
		System.out.println(set2.add("JAVA"));
		System.out.println(set2);
		System.out.println(set2.add("JAVA"));
		System.out.println(set2);
		
		
	}

}
