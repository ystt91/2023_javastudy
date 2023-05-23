package day11.com.ict.edu;

public class TeacherMain {
	public static void main(String[] args) {
		
		//객체생성
		Teacher teacher = new Teacher();
		
		//이름 큰뿔소 변경
		teacher.setName("큰뿔소");
		//나이 3변경
		teacher.setAge(3);
		//생존여부 살아있음
		teacher.setLive(true);
		//결과출력
		
		String m1 = teacher.getName();
		System.out.println("이름 : " +m1);
		int m2 = teacher.getAge();
		System.out.println("이름 : " +m2);
		boolean m3 = teacher.getLive();
		if(m3) {
			System.out.println("생존여부 살아있음");
		}else {
			System.out.println("생존여부 : 죽었음");
		}

		System.out.println("==========");

		//이름을 펭귄, 나이1, 생존여부살아 있음으로 변경
		teacher.setName("펭귄");
		teacher.setAge(1);
		teacher.setLive(true);
		
		//결과출력
		
		String p1 = teacher.getName();
		System.out.println("이름 : " +p1);
		
		int p2 = teacher.getAge();
		System.out.println("이름 : " +p2);
		
		boolean p3 = teacher.getLive();
		if(p3) {
			System.out.println("생존여부 살아있음");
		}else {
			System.out.println("생존여부 : 죽었음");
		}
		
		System.out.println("==========");
		
		teacher.play(false, 14, "엄지");
		teacher.prn();
		
		System.out.println("==========");
		
		teacher.play("까치", 14, true);
		teacher.prn();
	}
}
