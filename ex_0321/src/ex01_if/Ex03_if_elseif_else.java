package ex01_if;

public class Ex03_if_elseif_else {

	public static void main(String[] args) {
//		if - else if
//		비교해야할 조건이 여러개 있는 경우 사용하는 문법
//		물론 if문안에 두 개 이상의 조건식과 논리연산자를 사용할 수도 있지만
//		더욱 코드를 간결하게 하고 가독성을 높이기 위한 방법으로 if - else if문을 구현합니다.
//		기본형
//		if(조건식1){
//		  조건식1이 참일 때 실행할 문장.
//		} else if(조건식2) {
//		  조건식1이 거짓이고 조건식2가 참일 때 실행할 문장.
//		} else if(조건식3){
//		  조건식1,2가 거짓이고 조건식3이 참일 때 실행할 문장.
//		} else {
//		  위의 조건이 모두 거짓일 때 실행할 문장
//		}
//		else - if문의 개수에는 제한이 없습니다.
//		하지만 너무 많은 else - if문을 사용한다면 프로그램의 실행 속도가 현저히 느려질 수 있기 때문에 다른 방법을 함께 고려해야 한다.
//		if - else if문의 가장 마지막에 작성하는 else블록은 필요없다면 생략이 가능하다.
		
		int favorite = 7;

		if(favorite < 5) {//1번 조건문
			System.out.println("좋아하는 숫자가 5보다 작습니다.");
		}else if(favorite > 5) {//2번 조건문
			System.out.println("좋아하는 숫자는 5보다 큽니다.");
		}else {
			System.out.println("좋아하는 숫자는 5입니다.");
		}
	}

}
