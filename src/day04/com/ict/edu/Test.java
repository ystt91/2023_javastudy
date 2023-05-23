package day04.com.ict.edu;

public class Test {
	public static void main(String[] args) {
		  /*
		   근무 시간이 8시간 까지는 시간당 9620이고
		   8시간을 초과한 시간 만큼은 1.5배 지급한다.
		   현재 근무한 시간이 10이다.
		   얼마를 받아야 하는가?
		  */
		
//		int h = 10;
//		int s = 9160;		
//		double str = (h>8)?h*s:((h-8)*s)+(1.5*2*s);
//		System.out.println(str);
		
		int overTime = 8; //  초과근무 기준~!
		int wageHour = 9620;
		double overWage = 1.5;
		
		int workTime = 10;
		int result;

		result = (workTime) > 8 ? (int)((workTime - overTime) * overWage * wageHour) 
				 + overTime * wageHour : workTime * wageHour;
		
		System.out.println(result);
		
	   int time = 10;
	   int dan = 9620;
	   
	   int pay = (time>8)? (8*dan) + (int)((time-8)*dan*1.5): time * dan;
       System.out.println("결과" + pay);
       
       int num1 = 47;
       int num2 = 32;
       
       int res = (num1>num2)?num1:num2;
       System.out.println("큰값 : " +res);
       
       int res2 = Math.max(num1, num2);
       System.out.println("큰값 : " +res2);
       
       int res3 = 38;
       int res4 = (res3>0)? res3 : res3*-1;
       System.out.println("결과: " +res3);
       
       int res5 = Math.abs(res3);
       System.out.println("결과: " +res5);
	}
}
