package ex02_switch;

public class Ex01_switch {

	public static void main(String[] args) {
//		switch문
//		if문과 비슷하지만 if문은 괄호안에 인자값이 true, 혹은 false로 결정되는 조건식이 들어가야 한다.
//		switch문에 조건으로 사용될 수 있는 연산자는 '==' 밖에 없다.
//		즉, 두 개의 피연산자 값이 같을때만 조건으로 활용할 수 있다.
//		따라서 하나의 변수 안에 저장되어 있는 값을 다수의 값과 비교해야 할때 주로 사용한다.
//		기본형
//		switch(비교값){
//		case 조건값1 :
//		    비교값과 조건값이 일치할 때 실행할 문장.
//		    break;
//		case 조건값2 :
//		    비교값과 조건값이 일치할 때 실행할 문장.
//		    break;
//		case 조건값3 :
//		    비교값과 조건값이 일치할 때 실행할 문장.
//		    break;
//		default ://비교값과 일치하는 조건값이 없을 때 실행된다. 
//			코드;
//		}
		
		//switch문의 비교값으로 ㄱ사용 가능한 자료형
//		1) 정수(byte,short,int)
//		2) 문자형(char)
//		3) 문자열(String)
		
		int num = 7;
		
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 7:
			System.out.println("num은 7입니다.");
			break;
		default:
			System.out.println("num은 1도 7도 아닙니다.");
		}
		
		String str = "홍";
		String result;
			
		switch (str) { //인자로 비교할 값이 들어와야 한다.

		case "박"://인자와 비교할 조건값이 들어온다.	
		result = "박길동";	
		break;
			
		case "이"://콜론이다. 세미콜론 아니다.	
		result = "이길동";	
		break;
			
		case "독고":	
		result = "독고길동";	
		break;
			
		case "홍":	
		result = "홍길동";	
		break;
			
		default:	
		result = "제대로 입력하시지";	
		break;
		}
			
		System.out.println(result);
		
		//비교값과 조건값의 타입이 일치해야한다
		//case에 들어가는 조건값들은 겹칠 수 없다
		
	}

}
