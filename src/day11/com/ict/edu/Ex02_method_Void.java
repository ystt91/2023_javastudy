package day11.com.ict.edu;

public class Ex02_method_Void {
	String name = "홍길동";
	int kor = 90;
	int eng = 80;
	int math = 80;
	int sum = 0;
	double avg = 0;
	String hak = " ";
	
	
	// 모두 void
	
	//void는 클래스 내부에서 일을 하고 답을 낸다
	
	// 총점 구하는 메서드
	public void getSum() {
		sum = kor + eng + math;
		System.out.println("총점: " +sum);
		//int sum = kor + eng + math;
		//sum은 메서드 내부에서만 실행되는 지역(로컬 변수)
	}

	// 평균 구하는 메서드

	public void getAvg() {
		avg = (int)(sum/3.0*10)/10.0;
		System.out.println("평균: " +avg);
	}
	
	//학점 구하는 메서드
	
	public void getHak() {
		if(avg>=90) {
			hak = "A";
		}else if(avg>=80){
			hak = "B";
		}else if(avg>=70){
			hak = "C";
		} else {
			hak = "F";
		}
		System.out.println("학점: " +hak);
	}
}
