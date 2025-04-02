package ex02_lamda;

public class CalMain {
	public static void main(String[] args) {
		//구현한 클래스를 객체로 만들어 메서드 사용하기
		
		CalculatorImpl cal1 = new CalculatorImpl();
		int res = cal1.plus(10, 20);
		System.out.println(res);
		
		//2. 익명 클래스를 통한 메서드의 구현
		//cal2
		
		MyCalculator cal2 = new MyCalculator() {
			
			@Override
			public int plus(int num1, int num2) {
				
				return num1+num2;
			}
		};
		System.out.println(cal2.plus(10, 20));
		
		//3. 람다식으로 구현하기
		//let f = () =>{};
		MyCalculator cal3 = (num1,num2) -> num1+num2;
		
		res = cal3.plus(10, 20);
		System.out.println("cal3 : " + res);
		
	}
}
