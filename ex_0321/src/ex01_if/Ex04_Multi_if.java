package ex01_if;

public class Ex04_Multi_if {

	public static void main(String[] args) {
//		if문의 중첩
//		제어문은 자유롭게 중첩해서 사용할 수 있습니다.
//		if문 안에 if문이 있는 경우
//		if(조건식1){
//		  if(조건식2){
//		      조건식1,2가 모두 참일 때 실행할 문장 
//		  }
//		}
		int num = 5;
		if(num <=10){
		  if(num % 2 == 1){
		    System.out.println(num + "은 홀수입니다."); 
		  }
		}
		
		
	}

}
