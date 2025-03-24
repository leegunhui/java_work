package ex03_for;

import java.util.Scanner;

public class Ex01_for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		특정수행문을 원하는만큼 반복하여 실행하는 제어문
//		반복문의 종류
//		for, while
//		for문
//		주로 반복 횟수가 정해져 있을 때 사용하는 문법
//		for(초기식; 조건식; 증감식){
//			조건식에 해당할때 반복할 명령
//		}
//		초기식 : 반복을 하기 위한 시작값으로 변수를 하나 초기화 한다.
//		조건식 : 반복을 하기 위한 종료값으로 비교연산자를 많이 사용한다.
//		증감식 : 변수의 값을 증감시켜주는 역할을 한다 증감연산자를 많이 사용한다.\
		
		//1부터 10까지 출력하는 for문 작성하기
		for(int i = 1; i <= 10; i++){
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//10부터 1까지 출력
		for(int i = 10; i >= 1; i--){
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//1부터 10까지 3의배수만 출력
		for(int i=1; i<=10 ; i++){
			if(i%3 == 0){
			    System.out.print(i+ " ");
			}
		}
		
		System.out.println();
		
		//1~10 총합
		int total = 0;
		for(int i = 1; i<=10; i++){
		 	total += i;
		}
		System.out.println("1~10까지의 총합 : " + total);
		
		System.out.println();
		
		 //키보드에서 정수를 하나 입력받아 해당단의 구구단 출력
		System.out.println("숫자입력 :");
		int dan = sc.nextInt();
		for(int i = 1; i <= 9; i++){
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		
		System.out.println();
		
		//키보드에서 정수n을 입력받고
		//1부터 정수 n까지의 총합을 계산하여
		System.out.println("숫자입력 :");
		int n = sc.nextInt();
		int total2 = 0;
		for(int i = 1; i<=n; i++){
		 	total2 += i;
		}
		System.out.printf("%d까지의 총합 :%d ",n,total2);
		
		
		System.out.println();
		
		//10개의 정수를 입력받아 짝수가 몇개인지 확인
		int count = 0;
		for(int i = 0; i < 10; i++) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if( num % 2 == 0) {
				count++;
			}
		}
		System.out.println(count+"개");
		
		System.out.println();
		
		// 1, 1+2,1+2+3
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
			System.out.printf("%d \n",sum );
		}
		
		//양의 정수x를 키보드에서 입력받아 
		//x가 홀수면 x이하의 홀수정수의 합
		//짝수면 짝수인 정수의 제곱의 합
		System.out.print("정수 입력 : ");
		int x = sc.nextInt();
		int total3 = 0;
		int total4 = 0;
		
			if(x %2 == 0) {
				for(int j = 0; j<=x; j=j+2) {
					total3 += j*j;
				}
				System.out.printf("%d \n" , total3);
			}
			else {
				for(int k = 1; k<=x; k=k+2) {
					total4 += k;
				}
				System.out.printf("%d \n" , total4);
			}
		
	
		
	}

}
