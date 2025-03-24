package ex02_break;

import java.util.Scanner;

public class Ex02_break {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		
		
		 //break
//		 break문은 이전에 switch문을 학습할 때 나왔던 구문으로 case문을 종료할 때 사용되었다.
//		 break라는 단어의 의미와 동일하게 반복문을 미리 종료할 때 사용한다.
//		 반복문이 진행되는 도중, 특정 조건을 만족해 더이상 반복문을 실행할 필요 없이 종료하려고 할 때 사용한다.
		int magicNumber = (int)(Math.random() * 50) + 1;
		
		boolean isMatched = false;
		
		for(int i = 0 ; i < 10; i++) {
			System.out.print("찾는 숫자를 입력 >>  ");
			int guess = scan.nextInt();
			
			if(guess == magicNumber) {
				System.out.println((i+1) + "번째에 맞췄습니다!");
				isMatched = true;
				break;
			} else if(guess > magicNumber) {
				System.out.println("맞춰야할 숫자가 더 작습니다.");
			} else if(guess < magicNumber) {
				System.out.println("맞춰야할 숫자가 더 큽니다.");
			}
		}
		
		if(!isMatched) {
			System.out.println("정답을 맞추지 못했습니다.");
		}
	}

}
