package ex05_enum;

import java.util.Scanner;

public class Operation_main {
	public static void main(String[] args) {
		Operation[]op = Operation.values();
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		for(Operation oper : op) {
			System.out.println(oper.apply(x,y));
		};
		
	}
}
