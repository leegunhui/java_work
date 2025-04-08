package ex01_Thread;

import java.util.Random;
import java.util.Scanner;
//2번
//QuizThread클래스를 만들어 스레드를 상속받는다.
//startGame()메서드를 만들고 그 안에서 1~100사이의 난수 두개를 더하는 문제를 출제
//키보드에서 값을 입력하여 5문제가 정답처리 될때까지 로직을 반복한다.
//
//-> 스레드 들어가는 부분
//모든 문제를 맞추는데 몇초가 걸렸는지를 화면에 출력하며 프로그램을 종료하기
//
//
//QuizMain클래스에서는
//QuizThread qt = new QuizThread();
//qt.start();
//qt.startGame();
public class QuizThread extends Thread {
	int num1, num2;
	int howmuchtime = 0;
	int tryCount = 0;
	boolean check = true;
	int success = 5;

	public void startGame() {
		Scanner sc = new Scanner(System.in);
		while(check) {
			try {
				num1 = new Random().nextInt(100)+1;
				num2 = new Random().nextInt(100)+1;
				System.out.print(num1+"+"+num2+"=");
				int result = sc.nextInt();

				if(result == (num1+num2)) {
					System.out.println("정답");
				}
				else {
					System.out.println("오답");
					continue;
				}
				tryCount++;

				if(tryCount == success) {
					System.out.println("결과 :" + howmuchtime + "초");
					check = false;
				}

			} catch (Exception e) {
				System.out.println("잘못 입력한거같은데... 다시 입력해");
				sc.nextLine();
			}
		}
	}

	@Override
	public void run() {
		while(check) {
			try {
				Thread.sleep(1000);
				howmuchtime++;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
