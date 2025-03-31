package exam1;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//정수가 아닌걸 입력했을 때 해당값은 정숙 ㅏ아닙니다라고 출력하기
		
		System.out.print("정수 입력");
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		try {
			str = sc.next();
			int num = Integer.parseInt(str);
			System.out.println("결과 :" + num);
		} catch(Exception e) {
			System.out.println(str+"은 정수가아닙니다");
		}
	}
}
