package ex01_Thread;

import java.util.Scanner;

//스캐너를 이용하여 키보드에서 숫자를 입력받고
//스레드에서 입력받은 숫자 1씩 감소하다가 0이 되었을 때
//"종료" 메시지와 함께 프로그램이 종료되도록 만들어보자
//Thread는 ThreadCount에다 작성하기


public class Exam1 {
	public static void main(String[] args) {
		System.out.println("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		ThreadCount tc = new ThreadCount(count);
		tc.start();
		
	}
}
