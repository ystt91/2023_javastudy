package day03.com.ict.edu;

public class Test02 {
	public static void main(String[] args) {
		//2시간 40분 30초는 몇 초 일까요?
		int sec = 1;
		int min = 60*sec;
		int hour = 3600*sec;
	    int result;
	    
	    result = (2*hour) + (40*min) + (30*sec);
	    
	    System.out.println("2시간 40분 30초는 몇 초일까요? : " + result + "초");
	    
	    System.out.println("=================================");

         int h = 2*60*60;  // 시간 => 초
         int m = 40 * 60;  // 분 => 초
         int s = 30;
         int result1 = h + m + s;
         
         System.out.println("2시간 40분 30초는 몇 초일까요? : " + result + "초");

	}
}
