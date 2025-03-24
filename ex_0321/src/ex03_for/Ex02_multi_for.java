package ex03_for;
import java.util.Scanner;
public class Ex02_multi_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		다중 for문
//		for문안에 또 다른 for문을 사용하는 경우를 말한다.
//		for문을 중첩하여 사용하기 때문에 코드가 어려워 보일 수 있으나 반복문의 원리는 같다.
//		for(초기식;조건식;증감식){
//			for(초기식;조건식;증감식){
//				
//			}
//		}
		
		//ABCD
		//EFGH
		//IJKL
		char ch = 'A';

		for(int i = 1; i <= 3; i++){	          
			for(int j = 1; j <= 4 ; j++){
				System.out.print(" " + ch++);
		     }
		    System.out.println();
		}
		
		System.out.println();
		
		//두개의 주사위 던졌을 때 눈의 합이 6이되는 모든 경우의수 출력
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if(i+j == 6) {
					System.out.printf("%d, %d \n",i,j);
				}
			}
		}
		System.out.println();
		
		
	}

}
