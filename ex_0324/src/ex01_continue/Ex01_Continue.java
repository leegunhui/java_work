package ex01_continue;

import java.util.Scanner;

public class Ex01_Continue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		반복문(for,while,do-while)은 각각 정해진 횟수 또는 조건에 의해 반복을 진행한다.
//		하지만 숫자가 표시된 100개의 공에서 특정 숫자가 적힌 공을 찾는데, 10번만에 찾았다면 더이상 반복을 할 필요가 없을 것이다.
//		기타제어문은 반복문을 좀 더 개발자의 입맞에 맞게 다룰 수 있게 해준다.
		
//		continue
//		반복문 안에서 continue를 만나게 되면 이후의 실행 코드는 수행되지 않고, 반복문의 처음으로 돌아가 반복문을 진행하게 된다.
//		for문의 증감식으로 이동하며, while문과 do-while의 경우 조건식으로 이동한다.
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("짝수 합 : " + sum);
		
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
