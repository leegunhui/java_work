package ex03_variable;

public class Ex1_variable {

	public static void main(String[] args) {
		//변수
		//프로그램을 만들고 실행하는데 필요한 값들을
		//메모리에 저장해두고, 필요할때마다 꺼내서 사용
		
		//메모리에 무질서하게 저장되는 것이 아닐, 메모리
		//규칙속에서 일부 공간을 할당받아야한다
		
		//메모리에 값을 저장하기 위해 할당해놓은 특정공간을
		//변수라고한다.
		
		//변수의 선언
		//변수를 사용하기 위해서는 선언을 우선해야한다
		//자료형 변수명;
		
		//변수명 짓는 규칙
		//1. 숫자 특수문자가 첫글자로 올 수 없다
		//2. 대소문자 구별한다
		//3. 일반적으로 영어소문자로 시작한다
		//4. 특수문자가 포함될 수 없다
		//5. 예약어 금지
		//6. 한글을 사용하지 않는다
		
		//표기법
		//카멜표기법
		//두번째 단어부터 첫글자를 대문자로 표기
		//userName, homeAddress
		//스네이크 표기법(snake case)
		//모든 단어가 소문자로 시작하고, 단어와 단어 사이는( _ ) 로 연결하는 방식
		//user_name,phone_number
		
		//변수에 데이터 입력하기
		//데이터를 직접 사용하는 대신, 변수에 저장하고
		//변수명을 사용하여 값을 사용한다
		
		int studentAge;
		studentAge = 20;
		
		System.out.println(studentAge);
		
		boolean b = false;
		System.out.println(b);
		
		//자바는 변수의 타입을 엄격하게 지켜야한다
		
		//문자형
		char ch = '한';
		System.out.println(ch);
		
		//아스키코드 값
		char ch3 = 65;
		System.out.println(ch3);
		
		String ch2 = "피곤하다";
		System.out.println(ch2);
		
		//정수형
		byte by = 127;
		short s = 32767;
		int n = 550;
		System.out.println(by);
		System.out.println(s);
		System.out.println(n);
		
		//실수형
		float f1,f2;
		
		//java에서는 실수의 타입을 double형으로 인식하기 때문에
		//데이터가 float타입이라는것을 명시해줘야한다
		
		f1 = 3.14f;
		f2 = 150f;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1+f2);
		
		int myAge = 20;
		int yourAge = myAge;
		myAge = 21;
		System.out.println(yourAge);
		
		//두변수에 들어있는 값을 교환하려면 어떻게 해야할까
		
		int su1 = 20;
		int su2 = 30;
		int temp = 0;
		
		temp = su1;
		su1 = su2;
		su2 = temp;
		System.out.println(su1);
		System.out.println(su2);
		
	}
}


