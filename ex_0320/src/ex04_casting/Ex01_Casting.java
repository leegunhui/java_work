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

	}

}
