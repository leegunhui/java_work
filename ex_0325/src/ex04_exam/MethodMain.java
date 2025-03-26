package ex04_exam;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int arr[]= {1,2,3,4,5};
		
		mt.maxFinder(arr);
		
		mt.circleArea(5);
		
		mt.calculator(3, 2,'+');
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자입력 : ");
			int num = sc.nextInt();
			if(mt.check(num).equals("정답")) {
				System.out.println(mt.count+"회 만에 정답");
				break;
			} else {
				System.out.println(mt.check(num));
				mt.count++;
			}
			
		}
	}
}
