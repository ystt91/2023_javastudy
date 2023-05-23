package day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

//finally : 예외처리와 상관없이 반드시 실행 해야 되는 문장을 처리할 때 사용
//			주로 데이터베이스, 입/출력, 네트워크에서 사용
//    형식 : try{
//            예외 발생 가능한 문장;
//            예외가 발생되면 아래 문장들을 무시하고, catch문으로 이동한다.
//            예외 발생 가능한 문장;
//            예외 발생 가능한 문장;
//         }catch(발생한 예외 객체 e){
//            예외 발생 시 처리하는 문장;
//         }catch(발생한 예외 객체 e){
//            예외 발생 시 처리하는 문장;
//         }finally{
//		      반드시 실행 해야 되는 문장;
//	       }
public class Ex03_Exception {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//전역변수 선언을 위해 밖에 위치 해야 합니다.
		//try 안에 넣으면 지역 변수가 됩니다.
		
		try {
			int su1 = 50;
			System.out.println("정수입력: ");
			int su2 = scan.nextInt();
			System.out.println("정답: " + (su1 / su2));
			//scan.close();
			//정상적인 숫자는 close 합니다.
			//숫자나 0은 close 하지 않습니다.
			//그래서 반드시 거치는 finally에 넣어줍니다.
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요");
			//return;
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없어요.");
			//return;	
		}finally {
			System.out.println("반드시 수행되는 문장");
			//무조건 실행할거야
			scan.close();
		}
		
		System.out.println("수고하셨습니다.");
		
	}

}
