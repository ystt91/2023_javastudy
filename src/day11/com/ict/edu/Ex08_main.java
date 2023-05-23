package day11.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {

	public static void main(String[] args) {
		
		// 5명의이름, 국어, 영어, 수학을 입력 받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고
		// 순위 기준으로 오름차순 정렬해서 출력하자
		
		Scanner scan = new Scanner(System.in);
		
		
		//Ex08_method로 만들어진 객체만 저장하는 배열(객체형 배열 = 참조자료형 배열)
		
		Ex08_method [] arr = new Ex08_method[3];
		
		//arr[0] = person Ex08_method 객체
		//arr[1] = person Ex08_method 객체
		//arr[2] = person Ex08_method 객체
		//arr[3] = person Ex08_method 객체
		//arr[4] = person Ex08_method 객체
		
		
		for (int i = 0; i < arr.length; i++) {
			Ex08_method person = new Ex08_method();
			
			System.out.print("이름:");
			person.name = scan.next();
			System.out.print("국어:");
			person.kor = scan.nextInt();
			System.out.print("영어:");
			person.eng = scan.nextInt();
			System.out.print("수학:");
			person.math = scan.nextInt();
			
			person.sum = person.kor + person.eng + person.math;
			person.avg = (int)(person.sum/3.0*10)/10.0;
			
			if(person.avg>=90) {
				person.hak = "A";
			}else if(person.avg>=80) {
				person.hak = "B";
			}else if(person.avg>=70) {
				person.hak = "C";
			}else{
				person.hak = "F";
			}
			
			person.rank = 1;
			
			arr[i] = person;
		}
		
		//순위
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].sum<arr[j].sum) {
					arr[i].rank++;
				}
			}
		}
		
		
		Ex08_method tmp = new Ex08_method();
		
		//정렬
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].rank<arr[j].rank) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				}
			}
		}
		
		//출력
		System.out.println("이름\t국어\t영어\t수학\t총합\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name+"\t");
			System.out.print(arr[i].kor+"\t");
			System.out.print(arr[i].eng+"\t");
			System.out.print(arr[i].math+"\t");
			System.out.print(arr[i].sum+"\t");
			System.out.print(arr[i].avg+"\t");
			System.out.print(arr[i].hak+"\t");
			System.out.println(arr[i].rank);
		}
		
	}

}
