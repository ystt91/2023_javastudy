package day04.com.ict.edu;

public class Ex05_multi_if {

	public static void main(String[] args) {
		// 다중 if문
		// 형식) if(조건식1){
		//         조건식1이 참일 때 실행할 문장;
		//         조건식1이 참일 때 실행할 문장;
		//     } else if(조건식2) {
		//         조건식1이 거짓이면서 조건식2가 참일 때 실행할 문장;
		//         조건식1이 거짓이면서 조건식2가 참일 때 실행할 문장;
		//     } else if(조건식3){
		//         조건식1,2가 거짓이면서 조건식3가 참일 때 실행할 문장;
		//         조건식1,2가 거짓이면서 조건식3가 참일 때 실행할 문장;
		//     } else{
		//          조건식 1,2,3 모두 거짓인 경우
		//     }
		
		
		// int k1의 점수가 90이상이면 A학점, 80이상이면 B학점, 70이상이면 C학점, 나머지 F학점
		
		int k1 = 100;
		String score;
		if (k1>=90) {
			score = "A학점";
		} else if(k1>=80) {
			score = "B학점";
		} else if(k1>=70) {
			score = "C학점";
		}else{
			score = "F학점";
		}
		System.out.println(score);
		
		System.out.println("==========================");
		
		
		//char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별하자
		char k2 = 'a';
		String res1;
		if (k2 >= 'A' && k2 <='Z') {
			res1 = "대문자";
		}else if(k2 >= 'a' && k2 <='z') {
			res1 = "소문자";
		}else if(k2 >= '0' && k2 <= '9') {
			res1 = "숫자";
		}else{
			res1 = "기타문자";
		}
		System.out.println(res1);
		
		System.out.println("==========================");
		
		//char k3이 A,a 이면 아프리카, B,b 이면 브라질, C,c이면 캐나다, 나머지는 한국
		char k3 = 'D';
		String res2;
		if (k3 == 'a'|| k3 =='A') {
			res2 = "아프리카";
		}else if(k3 == 'b'|| k3 =='B') {
			res2 = "브라질";
		}else if(k3 == 'c'|| k3 =='C') {
			res2 = "캐나다";
		}else{
			res2 = "한국";
		}
		System.out.println(res2);
		
		System.out.println("==========================");
		
		//menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		//4이면 과일쥬스 3500이다. 친구와 2잔을 10000을 내고 먹었다.
		//잔돈은 얼마인가? (부가세 10% 포함), 친구와 같은 음료만 선택 가능
		
		
		//나의 풀이
	    String menu = "카페모카";
	    
	    int menu1 = 3500;
	    int menu2 = 4000;
	    int menu3 = 3000;
	    int menu4 = 3500;
	   
		int input = 10000;
		int friends = 2;
		double vat = 1.1;
		int res3 = 0;
		
		if(menu == "카페모카") {
			res3 = input - (int)(menu1*friends*vat);
		}else if(menu == "카페라떼") {
			res3 = input - (int)(menu2*friends*vat);
		}else if(menu == "아메리카노") {
			res3 = input - (int)(menu3*friends*vat);
		}else if(menu == "과일쥬스"){
			res3 = input - (int)(menu4*friends*vat);
		}
		
		System.out.println("선택메뉴: " +menu);		
		System.out.println("잔돈 : " +res3);
		
		System.out.println("==========================");
		
		//선생님 풀이
		int menuu = 3;
		int in = 10000;
		int su = 2;
		int dan = 0;
		String drink = "";
		
		if(menuu == 1){
			drink = "카페모카";
			dan = 3500;			
		}else if (menuu == 2) {
			drink = "카페라떼";
			dan = 4000;
		}else if (menuu == 3) {
			drink = "아메리카노";
			dan = 3000;			
		}else if (menuu == 4) {
			drink = "과일쥬스";
			dan = 3500;			
		}
		
		int total = dan * su;
		int vatt = (int)(total*0.1);
		int out = in - (total+vatt);
		
		System.out.println("선택메뉴 : " + drink);
		System.out.println("잔돈: "+ out);
		
	}

}
