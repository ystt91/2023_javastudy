package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {

	public static void main(String[] args) {
		
		// 근무시간이 8시간까지는 시간당 9620이고 
        // 8시간을 초과한 시간 만큼은 1.5배 지급한다. 
        // 현재 근무한 시간이 10이다. 
        // 얼마를 받아야 하는가?
		
		Scanner s = new Scanner(System.in);
		System.out.print("근무 시간: ");
		int overTime = s.nextInt();
		int standardTime=8;
		int pay = 0;
		int wage = 9620;
		double overWageRate = 1.5;
		
		
		if (overTime>standardTime) {
			pay = wage*standardTime + (int)((overTime-standardTime)*overWageRate*wage);
		} else {
			pay = wage*overTime;
		}
		System.out.println("당신의 일급은" +pay +"입니다.");
		
		
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
        // 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
        // 친구와 함께 2잔을 10000 내고 먹었다.
        // 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
        // (친구와 같은 음료을 먹어야 한다.)
         System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)"
                 + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
         int menu = s.nextInt();
         int input = 10000;
         int change = 0;
         String res = " ";
         if(menu == 1) {
        	 res = "카페모카";
        	 menu = 3500;
         }else if(menu == 2) {
        	 res = "카페라떼";
        	 menu = 4000;
         }else if(menu == 3) {
        	 res = "아메리카노";
        	 menu = 3000;
         }else if(menu == 4) {
        	 res = "과일쥬스";
        	 menu = 3500;
         }
         change = input -(int)(menu*2*1.1);
         System.out.println("잔돈은" +change +"입니다.");
         
         
         System.out.println();
         System.out.println("=================");

        // 나라를 입력하면 수도가 출력되게 하자 
        // 한국=>서울,  중국=>베이징, 일본=>도쿄, 미국=>워싱턴 , 이외에는 데이터 없음 
        // (swtich~case)
        System.out.print("나라 : ");
		String country = s.next();
        res = " ";
        switch (country) {
		case "한국" : res = "서울"; break;
		case "중국" : res = "베이징"; break;
		case "일본" : res = "도쿄"; break;
		case "미국" : res = "워싱턴"; break;
		default: res = null;
		}
        System.out.println(country +"의" +" 수도는 " +res +"입니다.");
       
		
		
	}
}
