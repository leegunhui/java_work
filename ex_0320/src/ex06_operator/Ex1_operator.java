package ex06_operator;

public class Ex1_operator {

	public static void main(String[] args) {
		int x = 100;
		int resultPlus = +x; //+부호
		int resultMinus = -x; //-부호

		System.out.println(resultPlus);
		System.out.println(resultMinus);

		double d = 1.11; //기본값이 +이기 때문에 생략 가능하다.
		double result = -d;

		System.out.println(-d);
		System.out.println(result);
		
		//선행증감
				//1이 먼저 증감되고 코드에 즉시 반영되어 실행
				int a = 10;
				System.out.println("a : " + ++a); //결과 11
				
				
				//후행증감
				//코드가 먼저 실행되고 1이 증감
				//다음에 다시 사용될 때 증감값을 반영한다.
				int b = 10;
				System.out.println("b : " + b++); //결과 10
				System.out.println("b++ : " + b); //결과 11

				char alphabetA = 'A'; //아스키 정수 65가 저장되어 'A'와 매핑
				System.out.println(alphabetA++);//코드가 실행된후 65+1이 됨
				System.out.println(alphabetA);//66값인 B가 출력이 된다.

				//오버플로우와 언더플로우
				//정수 타입 연산에서 오버플로우 또는 언더플로우가 발생하면
				//실행에러가 발생할 것 같지만 해당 정수 타입의 최소값 또는
				//최대값으로 되돌아간다.
				byte value = 127;
				value++;
				System.out.println(value);

				byte value2 = -128;
				value2--;
				System.out.println(value2);
				
				boolean isHuman = false;
				System.out.println(!isHuman);//true
				System.out.println(isHuman);//false
	}

}
