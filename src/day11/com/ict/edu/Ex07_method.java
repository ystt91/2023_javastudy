package day11.com.ict.edu;

public class Ex07_method {
	
//	double sum = 0;
//	double avg = 0.0;
	char hak = ' ';
	//총점을 구하는 메서드
	public void getSum(int kor, int eng, int math) {
		int sum = kor + eng + math;
	}
	
	public double getSum(double kor, double eng, double math) {
		return kor + eng + math;
		
	}
	
	//평균을 구하는 메서드
//	public void getAvg() {
//		double avg = (int)(sum/3.0*10)/10.0;
//	}
	
	public double getAvg(double k1) {
		double avg = (int)(k1/3.0*10)/10.0;
		return avg;
	}
//	public void getAvg(int sum) {
//		double avg = (int)(sum/3.0*10)/10.0;
//   }

	
	
	//학점을 구하는메서드
//	public void getHak() {
//		if(avg>=90) {
//			hak = 'A';
//		}else if(avg>=80) {
//			hak = 'B';
//		}else if(avg>=70) {
//			hak = 'C';
//		}else {
//			hak = 'F';
//		}
//	}
	
	public void getHak(double k1) {
		if(k1>=90) {
			hak = 'A';
		}else if(k1>=80) {
			hak = 'B';
		}else if(k1>=70) {
			hak = 'C';
		}else {
			hak = 'F';
		}
	}
}