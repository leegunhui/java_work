package exam2;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		Calculator calc = new Calc();
		
		Scanner scan = new Scanner(System.in);
		int []a = {1,2,3,4,5};
		System.out.println("합 차를 구할 두개의 수를 입력");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int temp;
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.printf("합 %d\n" , calc.add(num1, num2));
		System.out.printf("차 %d\n" , calc.substract(num1, num2));
		
		System.out.printf("평균 %f" , calc.average(a));
		
	}

}
