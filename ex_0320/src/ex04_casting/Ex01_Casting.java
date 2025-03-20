package ex04_casting;

public class Ex01_Casting {

	public static void main(String[] args) {
		//형 변환(casting)
		//데이터를 다른 자료형의 데이터로 변환하는 것을 의미한다
		//모든연산은 기본적으로 같은 자료형들끼리만 가능하다
		//따라서 형변환이 필요
		
		int num = 11;
		double num2 = 3.14;
		double numChange = (double)11;
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(numChange);
		// 형 변환은 숫자를 담을 수 있는 기본 자료형 간에만 가능
		// 정수형,실수형 자료형 뿐만 아니라
		// 문자이면서 동시에 숫자기도한 문자형도 가능하다.
		
		//자동형변환
		//1. 작은 자료형에서 큰 자료형을 변환
		//정수형
		
		//byte ->short -> int ->long
		//실수형
		//float -> double
		
		//2.정수형이 실수형을 바뀔때
		int i = 100;
		char c = 'a';
		int j = c; //char형에서 int형으로 자동 변환
		double d = i; //int형에서 double형으로 자동 변환
		
		System.out.println("int형 변수 j의 값 : " + j);
		System.out.println("double형 변수 d의 값 : " + d);
		
		
		//강제형변환(Demotion)
		//(원하는 자료형)데이터 or 변수;
		
		//큰쪽에서 작은쪽으로 바꿀때 강제로 바꿔야한다
		int x = 10; //4
		byte y = (byte)x; //1byte
		
		System.out.println(x+"  "+y);
		
		//int -> byte 강제형변환
		int l = 1000;
		byte k = (byte)l;
		System.out.println(l+" "+k);
	}

}
