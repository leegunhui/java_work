package ex04_while;

import java.util.Random;
import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		반면 while문은 반복 횟수가 정해져 있지 않고, 조건식이 true일 경우 계속해서 반복하는 문법이다.
//		부여된 조건식이 true이면 반복문이 실행되고 false면 종료된다.
//		주의하지 않으면 무한루프에 빠질수 있다.
//		while(조건식){
//		    조건식이 참일때 반복할 명령
//		}
//		while문은 for문처럼 시작값과 증감값을 가지고 있지 않기 때문에 값을 변화시켜주지 않으면 무한반복이 일어나게된다.
		
		
		//int타입 변수 num에 정수를 입력받고
		// 각 자리수의 합을 더한 결과를 출력하세요
		
		int num2 = sc.nextInt();
		int sum = 0;

		while (num2>0) {
			sum += num2%10;
			num2 = num2/10;
		}

		System.out.println("sum="+sum);
	}

}
