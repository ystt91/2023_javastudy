package day14.com.ict.edu2;

public class Main {
	
	public static void main(String[] args) {
		MP3_Phone mp3 = new MP3_Phone();
		
		System.out.println(mp3.number);
		
		mp3.call();
		mp3.sms();
		mp3.sound();
	}
	
	
}
