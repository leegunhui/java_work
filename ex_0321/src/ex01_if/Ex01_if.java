package ex01_if;

import java.util.Scanner;

public class Ex01_if {

	public static void main(String[] args) {
//		단순 if문
//		조건문 중에서도 가장 기본이 되는 명령문이다.
		// 조건식에는 논리형으로 결과를 확인할 수 있는 모든 식을 넣을 수 있다.
		// 조건식의 값이 true라면 {}안에 있는 코드를 실행한다.
//		기본형
//		if(조건식){
//		  조건식이 참일 때 실행할 문장.
//		}
//
//		//만약 실행해야 하는 명령이 하나라면 중괄호를 생략할 수 있다.
//		if(조건식)
//		  조건식이 참일 때 실행할 문장.
//
//		if(조건식)조건식이 참일 때 실행할 문장;
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력  ");
		int age = sc.nextInt();
		if(age > 19) {
			System.out.println("성인입니다.");
		}
		System.out.println("프로그램을 종료합니다.");
		
		
	}

}
