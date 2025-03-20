package ex_01.print;

public class Ex1_print {

	public static void main(String[] args) {
		
		System.out.println("welcome");
		System.out.println("JAVAWORLD");
		
		//printf()
		//문자열 속에서 다른 타입의 데이터를 같이 출력할 수 있게 해주는 형식
		//서식문자
		
//      %d	정수(10진수)
//		%o	정수(8진수)
//		%x	정수(16진수)
//		%f	실수
//		%s	문자열
//		%c	문자형
//		%b	논리형
		
		System.out.printf("저는 대학교 %d학년에 재학중입니다." ,4 );
		
		//서식문자를 한번에 여러개 넣을 수 있다.
		System.out.printf("이름은 %s이고\n 나이는 %d살이고 \n 키는 %f입니다. \n","홍길동",30,182.5);
		
		//출력값의 정렬
		System.out.printf("%5d\n" ,1);
		System.out.printf("%5d\n" ,12);
		System.out.printf("%5d\n" ,123);
		System.out.printf("%5d\n" ,1234);
		System.out.printf("%5d\n" ,12345);
		
		//실수의 정렬
		System.out.printf("%.1f\n",1.123456);
		System.out.printf("%.2f\n",1.123456);
		System.out.printf("%.3f\n",1.123456);
		System.out.printf("%.4f\n",1.123456);
		System.out.printf("%.5f\n",1.123456);
		System.out.printf("%.6f\n",1.123456);
		
		//2+2=4
		int num1 = 2;
		
		System.out.printf("%d+%d = %d", num1,num1,num1+num1);
		
		
		
		
		
		
		
		
	}

}
