package ex06_operator;

public class Ex02_Opterator {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		System.out.println(x + y);// 100 + 200
		System.out.println(x - y);// 100 - 200
		System.out.println(x * y);// 100 * 200
		System.out.println(x / y);// 100 / 200 정수형의 계산으로 0.5가 아닌 0을 반환
		System.out.println(x % y);// 100 % 200

		//계산 결과가 표현범위를 벗어나면 오버플로우가 발생하거나 쓰레기 값이 입력된다.
		int result = 1000000 * 100000;
		System.out.println(result);
		
//		기본적으로 이항 연산자의 연산은 두 피연산자의 타입이 일치해야 연산이 가능하다.
//		컴퓨터는 서로 다른 타입을 계산하지 못하므로 값의 손실이 적은쪽으로 타입을 맞춰준다.
//		long + int -> long + long -> long
//		float + int -> float + float -> float
//		double + float -> double + double -> double
		
		int n1 = 10; //n1이라는 int형 변수에 10이라는 정수를 대입함.
		int n2 = 7;
		System.out.println("=연산자: n1 = " + n1 + ", n2 = " + n2);
		
		int z = 10;
		int k = 1;
		
		z += k; // y = y + x; -> y = 1 + 10;
		System.out.println(k); //11
		
		z *= k; // y = y * x -> y = 11 * 10;
		System.out.println(k); //110
		
		z %= k; //y = y % x; -> y = 110 % 10;
		System.out.println(k); //0
		
//		int a = 10;
//		int b = 20;
//		
//		System.out.println(a > b);
//		System.out.println(a <= b);
//		System.out.println(a == b);
//		System.out.println(a != b);
//		
		int myAge = 30;
		int limit = 35;

		//&&은 앞쪽의 연산이 false일때 뒤쪽연산을 수행하지 않고 넘어간다.
		//&&는and의 뜻. '~하고'라는 의미로 이해하면 도움이 된다.
		//참 && 참 = 참
		//참 && 거짓 = 거짓
		//거짓 && 참 = 거짓
		//거짓 && 거짓 = 거짓
		//둘 다 참일때만 참
		boolean result2 = (limit - myAge) >= 5 && myAge > 30;
		System.out.println("&&연산결과: " + result2);
		
		int a = 10; //1010
		int b = 7; //0111
		int c = a & b; //논리곱(and) - 2진수로바꿨을 때 두값이모두1 일때만결과가1. 나머지는0
		System.out.println("c : " + c);

		int a2 = 12;
		int b2 = 8;
		int c2 = a2 | b2; //논리합(or) - 2진수로바꿨을 때 두값이모두0일때만결과가0. 나머지는1
		System.out.println("c2 : " + c2);

		int a3 = 9;
		int b3 = 11;
		int c3 = a3 ^ b3; //배타적or(xor) - 2진수로바꿨을때 두값이 서로같을때는0.서로다를때는1
		System.out.println("c3 : " + c3);  
	}

}
