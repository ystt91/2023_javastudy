package day11.com.ict.edu;

public class Ex06_method {
	
//	int sum = 0;
//	double avg = 0.0;
//	String hak = "";
	
	//총점을 구하는 메서드
	public int sum(int kor,int eng, int math) {
		int sum =  kor + eng + math;
		return sum;
	}
	//평균을 구하는 메서드
	public double avg(int sum) {
		double avg = (int)(sum/3.0*10)/10.0;
		return avg;
	}
	//학점을 구하는 메서드
	public String hak(double avg) {
		String hak = " ";
		if(avg>=90) {
			hak = "A";
		}else if(avg>=80) {
			hak = "B";
		}else if(avg>=70) {
			hak = "C";
		}
		else{
			hak = "F";
		}
		return hak;
	}
}
