package day07.com.ict.edu;

public class StringMethodEx {

	public static void main(String[] args) {
		String str = "벤치프레스는 가슴운동이다.";
		char k1 = str.charAt(4);
		System.out.println(k1);
		k1 = str.charAt(6);
		System.out.println(k1);
		k1 = str.charAt(13);
		System.out.println(13);
		
//		k1 = str.charAt(15);
//		System.out.println(k1);
		
		str = "탁영송 Tak Young Song";
		for (int i = 0; i < 18/*i<str.length()*/; i++) {
			k1 = str.charAt(i);
			if(k1>='a' && k1<='z') {
				System.out.print((char)(k1-32));
			}else {
				System.out.print(k1);
			}
		}
		
		System.out.println("============================");
		
		String s1 = "나는";
		String s2 = "코더다.";
		String s3 = s1.concat(s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("============================");
		
		String s4 = "나는 한국 ICT 인재개발원 학생이다.";
		System.out.println(s4.contains("I"));
		System.out.println(s4.contains("j"));
		System.out.println(s4.contains("인재개발"));
		
		System.out.println("============================");
		
		String s5 = "ict";
		String s6 = "ICT";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase("ICT"));
		
		System.out.println("============================");
		
		String s7 = "ICT 인재개발원";
		String s8 = String.format("%s", s7);
		System.out.println(s8);
		
		s8 = String.format("%30s", s7);
		System.out.println(s8);
		
		s8 = String.format("%-30s", s7);
		System.out.println(s8);
		
		s8 = String.format("%4s", s7);
		System.out.println(s8);
		
		s8 = String.format("%.4s", s7);
		System.out.println(s8);
		
		System.out.println("============================");
		
		int s9 = 2546876;
		
		s8 = String.format("%d", s9);
		System.out.println(s8);
		
		s8 = String.format("%15d", s9);
		System.out.println(s8);
		
		s8 = String.format("%-15d", s9);
		System.out.println(s8);
		
		s8 = String.format("%015d", s9);
		System.out.println(s8);
		
//		s8 = String.format("%0-15d", s9);
//		System.out.println(s8);

		s8 = String.format("%,d", s9);
		System.out.println(s8);
		
		
		System.out.println("============================");
		double s10 = 1245.6546;
		System.out.println(String.format("%f", s10));
		System.out.println(String.format("%20f", s10));
		System.out.println(String.format("%.3f", s10));
		System.out.println(String.format("%,.7f", s10));
		System.out.println(String.format("%.1f", s10));
		System.out.println(String.format("%,.1f", s10));
		
		
	}

}
