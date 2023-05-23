package day07.com.ict.edu;

import java.util.Iterator;

public class Ex02_String {

	public static void main(String[] args) {
		
//		String 클래스는 문자열을 처리하는 클래스
//		기본자료형은 아니지만 기본자료형처럼 사용
		
//		String에서 자주사용되는 메서드들
//		메서드(인자) : 실행 결과의 자료형
//		인자 = 메서드가 실행하기 위해서 받은 재료(source)
		
//		1. charAt(int index) : char
//		   위치 정보 = index	
//		   위치정보를 받아서 해당 위치의 존재하는 글자를 char형으로 변환
//		   인덱스 범위 = 0 ~ 길이 -1
		
		String str = "한국 ICT 인재개발원 1강의장";
		char k1 = str.charAt(0);
		System.out.println(k1);
		
		k1 = str.charAt(2);
		System.out.println(k1);
		
		k1 = str.charAt(8);
		System.out.println(k1);
		
		k1 = str.charAt(3);
		System.out.println(k1);
		
//		에러
//		k1 = str.charAt(24);
//		System.out.println(k1);
		
	    str = "대한민국 I Love You 123";
//	    모두 소문자로 만들자  -32
//	    str.length() => str 문자열의 길이를 구해준다.
	    for (int i = 0; i < str.length(); i++) {
			char k2 = str.charAt(i);
			if(k2>='a' && k2<='z'){
			   System.out.print((char)(k2-32));
			} else {
			 System.out.print(k2);
			}
		}
		System.out.println();

//		2. concat(String str) : String
//		입력된 문자열을 현재 문자열과 합친다.("문자열" + "문자열")
		String s1 = "대한민국";
		String s2 = "KOREA";
        String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1 + s2);
		
		System.out.println("============================");
		
//		3. contains(CharSequence s) : boolean
//		   CharSequence = char 값을 읽을 수 있는 시퀀스, 인터페이스
//		   CharSequence을 지금은 String이라고 생각하자.
//		   현재 가지고 있는 문자열 중에 인자로 들어온 문자나 문자열을 가지고 있으면 true, 없으면 false
		String s4 = "KOREA @ 대한민국";
		System.out.println(s4.contains("@"));
		System.out.println(s4.contains("REA"));
		System.out.println(s4.contains("rea"));
		
		System.out.println("============================");
		
//		4.equals(Object anObject) : boolean
//		  입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자를 구별)
//		5.equalsIgnoreCase(String anotherString) : boolean
//	      입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자를 구별하지 않음)
		
		String s5 = "Korea";
		String s6 = "KOREA";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		
		System.out.println("============================");
		
//		6. format(String format, Object ... args) : static String
//		 형식을 지정하고 형식에 맞춰 생성
		String s7 = "ICT 인재개발원";
		// 문자열 => %s
		String s8 = String.format("%s", s7);
		System.out.println(s8);
		
		// %30s 30자리 차지하는 문자열 (남은 자리는 비워둔다.) 오른쪽 정렬
		s8 = String.format("%30s", s7);
		System.out.println(s8);
		
		// %-30s 30자리 차지하는 문자열 (남은 자리는 비워둔다.) 왼쪽 정렬
		s8 = String.format("%-30s", s7);
		System.out.println(s8);
		
		// 자리가 모자르면 알아서 다 나옴
		s8 = String.format("%4s", s7);
		System.out.println(s8);
		
		//자리가 모자르면 짤린다.
		s8 = String.format("%.4s", s7);
		System.out.println(s8);
		
		System.out.println("============================");
		
		//%d 정수 형식 지정
		int s9 = 23144564;
		s8 = String.format("%d**", s9);
		System.out.println(s8);
		
		//오른쪽 정렬
		s8 = String.format("%5d", s9);
		System.out.println(s8);
		
		//왼쪽 정렬
		s8 = String.format("%-5d", s9);
		System.out.println(s8);
		
		//오른쪽 정렬(빈 공간 0으로 채운다.)
		s8 = String.format("%05d", s9);
		System.out.println(s8);
		
		//오른쪽 정렬(세자리마다 컴마)
		s8 = String.format("%,d", s9);
		System.out.println(s8);
		System.out.println("============================");
		
		// %f => 실수형식
		double s10 = 1245.44547954;
		System.out.println(String.format("%f", s10));
		System.out.println(String.format("%20f", s10));
		System.out.println(String.format("%.3f", s10));
		System.out.println(String.format("%.1f", s10));
		System.out.println(String.format("%,.1f", s10));
		
		System.out.println("============================");

//		7.getBytes() :byte[]
//		해당 문자열을 byte[]로 변환 시킨다.
//		보통 입출력할 때 사용한다.(대/소문자, 숫자, 일부 특수문자만 가능(아스키코드), 영어를 제외한 글자 안됨)
		
		String a1 = "java";
		byte [] b1 = a1.getBytes();
		System.out.println(b1[0]); // 
		System.out.println(b1[1]); //
		System.out.println(b1[2]); //
		System.out.println(b1[3]); //
		
		System.out.println("============================");
		
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
//			System.out.println((char)(b1[i]));
		}
		
//		8.hashCode() : int
//		일반적인 hashCode는 객체의 주소값을 반환하여 생성한 객체의 고유한(유일한) 정수값
//		String hashCode는 각 문자열에서 정수값으로 변경
		
		String a2 = "홍길동";
		System.out.println(a2.hashCode());
		
		String a3 = "홍길동";
		System.out.println(a2.hashCode());
		
		System.out.println("============================");
		
		// 문자열일 때 == 주소가 같냐?
		System.out.println(a2 == a3);
		//문자열일 때 equals (내용이 같냐?)
		System.out.println(a2.equals(a3));
		
//		9.indexOf(int ch), indexOf(String str) : int
//		contains와 같이 쓴다
//		입력된 char, String을 해당 문자열에 char나 String의 **위치값**을 알려준다.
//		찾는 문자나 문자열이 없으면 -1 반환
		
		String a4 = "BufferedReader";
		// R을 찾아라
		System.out.println(a4.indexOf('R'));
		// r을 찾아라
		System.out.println(a4.indexOf('r'));
		// k를 찾아라
		System.out.println(a4.indexOf('k'));
		// er을 찾아라
		System.out.println(a4.indexOf("er"));
		
		System.out.println("============================");
		
//		10.lastIndexOf(int ch),lastIndexOf(String str) 
//		   : int
//		   입력된 char,String을 해당 문자열에 char나 String의 마지막 위치값을 알려줌
		
		// R을 찾아라
		System.out.println(a4.lastIndexOf('R'));
		// r을 찾아라
		System.out.println(a4.lastIndexOf('r'));
		// k를 찾아라
		System.out.println(a4.lastIndexOf('k'));
		// er을 찾아라
		System.out.println(a4.lastIndexOf("er"));
		
//		11. indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex) 
//		    : int
//		    2번째, 3번째 문자나 문자열 찾기 위함
//		    fromIndex =>시작 위치값
		a4 = "BufferedReader";
		System.out.println(a4.indexOf('e', 0));
		//a4.indexOf('e)와 같은 내용
		
//		첫번째 'e'의 위치가 4로 나와서 5부터 시작
		System.out.println(a4.indexOf('e', 5));
		System.out.println(a4.indexOf('e', a4.indexOf('e', 0)+1));
		
//		두번째 'e'의 위치는 6이 나와서 7부터 시작
		System.out.println(a4.indexOf('e', 7));
		System.out.println(a4.indexOf('e', a4.indexOf('e',a4.indexOf('e', 0)+1)+1));
		
		System.out.println("============================");
		
//		12.length() : 문자열의 길이(갯수) => 1부터 시작
//					  문자열의 위치(index) => 0부터 시작
		System.out.println(a4.length());
		
//		13.replace(char oldChar, char newChar) : String
//		13.replace(String oldStr, char newStr) : String
//		새로운 문자나 문자열을 받아서 치환(바꾸기)한다.
		
		String a5 = "대한민국";
		String a6 = a5.replace('한', '韓');
		String a7 = a5.replace("한", "한❤");
		System.out.println(a6);
		System.out.println(a7);
		
//      이름의 첫자와 마지막 자를 제외하고 * 찍기
		/*
		String a8 = "선우은숙";
		int a9 = a8.length();
		String a10 = " ";
		for (int i = 0; i < a9; i++) {
			
			if(i == 1 && 1< a9 && a9<4) {
				a10 = a8.replace(a8.charAt(1), '*');
			}else if(i == 2 && 1<a9 && a9<5) {
				a10 = a8.replace(a8.charAt(1), '*');
			}
		}
		System.out.println(a10);
		*/
		
//      이름의 첫자와 마지막 자를 제외하고 * 찍기
		String a8 = "김수한무";
		int t1 = a8.length();
		String res = " ";
		for (int i = 0; i <t1; i++) {
	        char s = a8.charAt(i);
			if(i == 0 || i == t1-1) {
				res += s;
			} else {
				res += "*";
			}
		}
		System.out.println(res);
		
		//전화번호 : 010-9876-7410 => 010-9876-****, 010-****-7410으로 변경하기
		a8 = "010-9732-9110";
		int t2 = a8.length();
		int t3 = a8.lastIndexOf("-");
		res = " ";
		for (int i = 0; i < t2; i++) {
			char s = a8.charAt(i);
			if(i>=0 && i<=t3) {
				res += s;
			}else {
				res += "*";
			}
		}
		
		a8 = "010-9732-9110";
		t2 = a8.length();
		t3 = a8.indexOf("-");
		int t4 = a8.lastIndexOf("-");
		res = " ";
		for (int i = 0; i < t4; i++) {
			char s = a8.charAt(i);
			if(i>=t3+1 && i<=t4-1) {
				res += "*";
			}else {
				res += s;
			}
		}
		
//		14. isEmpty() : boolean
//			해당 문자열이 비어있으면 true, 내용이 있으면 false
		String t5 = "HelloWorld";
		System.out.println(t5.isEmpty());
		
		t5 = " ";
		System.out.println(t5.isEmpty());
		
		System.out.println("============================");
		
//		15. split(String regex)
//			split(String regex, int limit) : String[]
//		regex = > 구분자(나누는 기준), limit => 배열의 크기 (방의 갯수)
		t5 = "사과,딸기,망고, @오렌지,두리안,용과";
		String[] arr = t5.split(",");
//		String[] arr = t5.split("@"); 로 작성할 경우 sysout arr[0]~arr[5]오류
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		//배열을 크기가 안 맞으면 무조건 오류
		//System.out.println(arr[6]);
		
		System.out.println("============================");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("============================");
		
		String[] arr2 = t5.split("," , 3);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("============================");
		
//		16.substring(int beginIndex) : String
//		입력된 시작위치부터 끝까지 문자열 추출
		String t6 = "010-9732-9110";
		String t7 = t6.substring(4);
		System.out.println(t7);
		
		t7 = t6.substring(9);
		System.out.println(t7);
		
		t7 = t6.substring(t6.lastIndexOf("-")+1);
		System.out.println(t7);
		
//		16-2 substring(int beginIndex, int endIndex) : String
//			 beginIndex 위치부터 endIndex 위치까지(endIndex 위치는 포함하지 않는다.)
		t6 = "010-9732-9110";
		t7 = t6.substring(4, 7); 
		System.out.println(t7);   //예상 출력 결과 973
		
		//첫글자 추출
		t7 = t6.substring(0, 1);
		System.out.println(t7);
		
		//010-9732-9110 => 010-****-9110, 010-9732-****
		String t8 = "010-9732-9110";
		String t9 = "****";
		
		String t10 = t8.replace(t8.substring(4, 8), t9);
		System.out.println(t10);
		t10 = t8.replace(t8.substring(t8.indexOf("-") +1, t8.lastIndexOf("-")), t9);
		System.out.println(t10);
		
		t10 = t8.replace(t8.substring(t8.lastIndexOf("-")+1), t9);
		System.out.println(t10);
		
		String[] arr3 = t8.split("-");
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		System.out.println(arr3[0]+ "-****-" +arr3[2]);
		System.out.println(arr3[0]+"-" +arr3[1] + "-****");
		
//		17. toLowerCase() : String => 해당 문자열을 모두 소문자로 변경
//			toUpperCase() : String => 해당 문자열을 모두 대문자로 변경
		
		String str1 = "javaLand03Exam";
		String str2 = "";
		
		for (int i = 0; i < str1.length(); i++) {
			char k = str1.charAt(i);
			//다 대문자 만들기
			//소문자 => 대문자로 변경
			if(k>='a' && k<='z') {
				str2 = str2 + (char)(k-32);
			} else {
				//나머지는 그대로 출력
				str2 = str2 + k;
			}
		}
		System.out.println(str2);
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println("============================");
		
//		18. toString : String
//		   	객체(클래스)에서 toString : 모든 클래스(객체)에서 사용가능한 메소드
//		   						   클래스(객체)가 가지고 있는 정보나 값(데이터)들을 
//		   						   문자열로 만들어서 반환하는 메소드
		
//			String에서의 toString : 문자열 자체 반환
		
		String u1 = "java 11 자바 11";
		String u2 = u1.toString();
		
		System.out.println(u1);
		System.out.println(u2);
		
		System.out.println("============================");
		
//		19.trim() : String
//		해당 문자열의 앞,뒤 공백 제거, 글자 사이의 공백은 제거 못함
		
		String u3 = "    java    자바    JAVA   ";
		System.out.println(u3);
		System.out.println("길이:" +u3.length());
		
		String u4 = u3.trim();
		System.out.println(u4);
		System.out.println("길이:" +u4.length());
		
		System.out.println("============================");
		
//		20. startㄴWith(String prefix) : boolean
//			주어진 문자열로 시작하는지 검색
//			
//			startㄴWith(String prefix, int toffset) : boolean
//			주어진 문자로 시작하는지 검색 toffset => 시작위치
//		
//			endWith(String suffix) : boolean
//			주어진 문자로 끝났는지 검사
		String u5 = "java   자바   JAVA";
		System.out.println(u5.startsWith("JAVA"));
		System.out.println(u5.startsWith("java"));
		System.out.println(u5.startsWith("자바"));
		
		System.out.println();
		
		System.out.println(u5.endsWith("JAVA"));
		System.out.println(u5.endsWith("java"));
		System.out.println(u5.endsWith("자바"));
		
		System.out.println("============================");
		
		//기본자료형 : 컴파일러에 의해 해석 되는 자료
//		21. String.valueOf(기본자료형) : 들어온 기본 자료형을 String으로 변경 시킴
		
		boolean bo1 = true;
		char ch1 = 'a';
		int num1 = 34;
		long num2 = 37L;
		double num3 = 345.127;
		
		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("============================");
		
		//System.out.println(bo1+1);
		System.out.println(ch1+1);
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		
		System.out.println("============================");
		
		System.out.println(String.valueOf(bo1)+1);
		System.out.println(String.valueOf(ch1)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		
		System.out.println("============================");
		
		System.out.println(bo1+""+1);
		System.out.println(ch1+""+1);
		System.out.println(num1+""+1);
		System.out.println(num2+""+1);
		System.out.println(num3+""+1);
		
		System.out.println("============================");
		
//		22. Wrapper Class
//			기본자료형의 형태를 가진 문자열을 해당 자료형으로 변경시키는 클래스
//		22-1. 문자 "true" , "false" => true, false : Boolean.parseBoolean()
		String msg = "true";
		boolean msg2 = Boolean.parseBoolean(msg);
		System.out.println(msg); // "true"
		System.out.println(msg2); // true
		if(msg2) {
			System.out.println("변경1");
		} else {
			System.out.println("변경2");
		}
		
		System.out.println("============================");
		
		//22-2. 문자 "142", "25" =>142, 25 => Integer.parseInt();
		msg = "142";
		int msg3 = Integer.parseInt(msg);
		System.out.println(msg + 10);
		System.out.println(msg3 + 10);
		
		//22-3. "123123", "1321231" => 123123, 1321231 =>Long.parseLong();
		
		msg = "123123123123";
		long msg4 = Long.parseLong(msg);
		
		System.out.println(msg+9);
		System.out.println(msg4+9);
		
		//22-4. "234.234" = > 234.234 = > Double.parseDouble();
		
		msg = "123.123";
		double msg5 = Double.parseDouble(msg);
		System.out.println(msg + 0.04);
		System.out.println(msg5 + 0.04);
		
		msg = "123.123f"; //오류 발생 안됨
		msg5 = Double.parseDouble(msg);
		System.out.println(msg + 0.04);
		System.out.println(msg5 + 0.04);
		
		//22-5 Character.parseCharacter()는 존재하지 않는다.
		//	   String의 charAt() 이용하면 char를 가져올 수 있다.
		msg = "p";
		char msg6 = msg.charAt(0);
		
		System.out.println("****************************");
		
		
		msg = "java 자바 JAVA 大韓民國 2023 %*";
		// String.getBytes() = > byte[](영문자 대/소문자, 숫자 및 일부 특수문자만 가능)
		// 기계끼리
		byte[] result = msg.getBytes();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] +":" +(char)(result[i]));
		}
		
		// String.toCharArray() => 결과가 char[] 모든 문자 처리 가능
		// 사람끼리 사용
		char[] result2 = msg.toCharArray();
		for (int i = 0; i < result2.length; i++) {
			System.out.print(result2[i]);
		}
		
		
    }

}
