package day03.com.ict.edu;

public class Test03 {
	public static void main(String[] args) {
		// 3989초는 몇시간, 몇분, 몇초인가?
		int input = 3989;
		int hour = input/3600;
		int min = (input/60)%60;
		int sec = input%3600%60;
	    System.out.println("3989초는 " +hour+"시간 "+min+"분 "+sec+"초" );
	    
	    System.out.println("=================================");
	    

	     int time = 3989;
	     int h = 0;  //시
	     int m = 0;  //분
	     int s = 0;  //초
	     int rest = 0; //나머지
	     
	     h = time/(60*60);  //1
         rest = time%(60*60); //389
         m = rest/60; //분
	     s = rest%60; //초
	     
         System.out.println("3989초는 " +h+"시간 "+m+"분 "+s+"초" );
	}
}
