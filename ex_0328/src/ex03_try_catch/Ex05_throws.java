package ex03_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05_throws {
	
	public static void checkYourSelf(Scanner scan)throws InputMismatchException{
		System.out.println("1. 사람과 어울리는 것이 좋다. 2. 혼자 있 것이 좋다.");
		System.out.print("선택 : ");
		int check = scan.nextInt();
		
		//성격 체크 후 출력
		if(check == 1) {
			System.out.println("당신은 E");
		}else {
			System.out.println("당신은 I");
		}
	}
	
	public static void main(String[] args) {
		//예외 던지기
		//메서드에서 발생하는 예외를 직접 처리하는것이 아닌
		//메서드를 호출하는 쪽에서 대신 처리를 해주는것
		Scanner sc = new Scanner(System.in);
		try {
			Ex05_throws.checkYourSelf(sc);// -> 예외가 발생할 확률이 있음
		}catch (Exception e) {
			System.out.println("키보드 입력이 잘못되었습니다");
		}finally {
			System.out.println("프로그램 종료");
		}
	}
	
	
}
