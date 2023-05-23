package day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중 catch : 예외가 하나가 아니라 여러가지가 발생할 경우 사용
//    주의사항 : Exception을 사용할 경우 반드시 가장 아래 catch문에 사용
//       형식 : try{
//          예외 발생 가능한 문장;
//          예외가 발생되면 아래 문장들을 무시하고, catch문으로 이동한다.
//          예외 발생 가능한 문장;
//          예외 발생 가능한 문장;
//       }catch(발생한 예외 객체 e){
//          예외 발생 시 처리하는 문장;
//       }
public class Ex02_Exception {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			//Scanner scan = new Scanner(System.in);
			//Scanner가 다시 만들어집니다.
			try {

				int su1 = 50;
				System.out.println("정수입력: ");
				int su2 = scan.nextInt();
				System.out.println("정답: " + (su1 / su2));
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
				//scan.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("0으로는 나눌 수 없어요.");
			}
		}
		//System.out.println("수고욤");
	}
}
