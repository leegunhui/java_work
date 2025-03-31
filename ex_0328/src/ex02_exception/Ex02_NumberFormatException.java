package ex02_exception;

public class Ex02_NumberFormatException {
	
	String str01 = "11";
	String str02 = "11.2";
	
	//정수 형태의 문자열을 정수로 변
	int num01 = Integer.parseInt(str01);
	
	//System.out.println("String to int : " + num01);
	
	//실수 형태의 문자열을 정수로 변환
	int num02 = Integer.parseInt(str02);
	
	//System.out.println("String to int : " + num02);

}
