package ex01_if;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int box;
		System.out.println("농구공의 개수는?");
		int ball = sc.nextInt();
		
		if(ball % 5 == 0) {
			box = ball/5;
		}
		else {
			box=  ball/5 + 1;
		}
		System.out.println("필요한 상자의 수 : " + box);
	}

}
