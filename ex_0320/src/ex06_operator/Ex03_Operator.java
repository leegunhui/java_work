package ex06_operator;

public class Ex03_Operator {

	public static void main(String[] args) {
		
//	&	논리곱(AND)	두 항이 모두 참이면 true, 아니면 false)
//	|	논리합(OR)	두 항 중 하나라도 참이면 true, 아니면 false
//	^	배타적논리합(XOR)	두 항이 다르면 true, 같으면 false
//	~	부정(not)	참을 거짓으로, 거짓을 참으로 연산
		int a = 10; //1010
		int b = 7; //0111
		int c = a & b; 
		System.out.println("c : " + c);

		int a2 = 12;
		int b2 = 8;
		int c2 = a2 | b2; 
		System.out.println("c2 : " + c2);

		int a3 = 9;
		int b3 = 11;
		int c3 = a3 ^ b3; 
		System.out.println("c3 : " + c3); 
		
		int x = 10;
		int result = x << 1;
		System.out.println(result);
		
		int a4 = 10;
		int b4 = 15;
		boolean result2;		
		result2 = ++a4 >= b4 ? true : false;
		System.out.println("result :" + result);
				
		int n1 = 10;
		int n2 = 20;
		char result3;
		result3 = (n1 += n1) == n2 ? 'O' : 'X';
		System.out.println("result : " + result3);
		//삼항연산의 값을 받을 변수의 자료형과 ?뒤의 결과값의 타입이 같아야 한다.
	}

}
