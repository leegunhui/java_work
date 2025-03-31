package exam1;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//키보드에서 특수문자를 제외한 알파벳을 무작위로 받는다
		//입력받은 문자열에서 소문자 a가 몇개 있는지 판별하시오
		//예시
		//입력 :asdfasdf
		//결과 : 2
		
		String str;
		int count = 0;
		
		System.out.println("문자열을 입력하세요");
		str = scan.next();
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == 'a') {
				count ++;
			}
		}
		
		System.out.println("a의 갯수 : " + count);
		//1,3이면 남자 2,4면 여자
		//생일과 성별 구하기
		//예시
		//주민번호를 모드 입력하세요 (-포함)
		//001101-0011101
		//당신은 2000년 12월 23일에 태어난 남자입니다
		
		System.out.println("주민번호를 모두 입력하세요(-포함)");
		System.out.print("입력 : ");
		String juminNum = scan.next();
		
		if(juminNum.trim().length() > 14 || juminNum.trim().charAt(6) != '-'){

			System.out.println("주민번호를 잘못 입력했습니다.");
		}
		else {
			String year = "";
			String result = "";
			year = juminNum.substring(0, 2); 
			
			//00년생 부터 앞이 20  --> 
			if(Integer.parseInt(year) <= 25 ){
				result = "당신은 20";
			}else{
				result = "당신은 19";
			}
			result += year + "년 "
					+ juminNum.substring(2, 4) +"월 " 
					+ juminNum.substring(4, 6)
					+ "일에 태어난 ";

			if(juminNum.charAt(7)%2 != 0){
				result += "남자입니다.";
			}else{
				result += "여자입니다.";
			}

			System.out.println(result);


		}
		
		//회문 판별하기
		//앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문자열
		//키보드에서 문자열을 입력받아 회문이면 xxx는 회문입니다
		//아니면 xxx는 회문이 아닙니다
		//토마토는 회문입니다
		//지하철은 회문이 아닙니다
		
		String str1 = "";
		String str2 = "";
		
		System.out.print("문자를 입력하세요 : ");
		str = scan.next();
		
		for(int i = str1.length(); i>0; i--){
			str2 += str1.charAt(i-1);
		}
		
		if(str1.equals(str2)){
			System.out.println(str + "은 회문 입니다.");
		}else{
			System.out.println(str + "은 회문이 아닙니다.");
		}			
	}
}
