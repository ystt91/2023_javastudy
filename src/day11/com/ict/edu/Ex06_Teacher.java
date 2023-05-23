package day11.com.ict.edu;

public class Ex06_Teacher {
	//총점을 구하는 총점 리턴하는 메서드
	public int getSum(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
		
         //return kor + eng + math;
	}
	
	//평균을 구하는 평균 리턴하는 메서드
	public double getAvg(int sum) {
		double avg = (int)(sum/3.0*10)/10.0;
		//double avg = (int)((kor+eng+math)/3.0*10)/10.0;
		return avg;
	}
	
	//학점을 구하는 학점 리턴하는 메서드
	public String getHak(double avg) {
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
	
//	public String getHak(int kor, int eng, int math) {
//		double avg = (int)((kor+eng+math)/3.0*10)/10.0;
//		String hak = " ";
//		if(avg>=90) {
//			hak = "A";
//		}else if(avg>=80) {
//			hak = "B";
//		}else if(avg>=70) {
//			hak = "C";
//		}
//		else{
//			hak = "F";
//		}
//		return hak;
//	}
		
		
		
	
}
