package test;

public class Main {
	public static void main(String[] args) {
		//클래스를 직접 생성하고 구현하여 기능 만들기
		MyCalculator cal1 = new Calculator();
		int res = cal1.plus(10, 20);
		System.out.println("cal1 : " + res);
		
		//익명클래스를 통한 구현
		MyCalculator cal2 = new MyCalculator() {
			@Override
			public int plus(int num1, int num2) {
				return num1 + num2;
			}
		};
		res = cal2.plus(10, 20);
		
		System.out.println("cal2 : " + res);
		
		//람다식을 통한 구현
		MyCalculator cal3 = (num1,num2)->num1 +num2;
		
		res = cal3.plus(10, 20);
		
		System.out.println("cal3 : " + res);
			
	}
}
