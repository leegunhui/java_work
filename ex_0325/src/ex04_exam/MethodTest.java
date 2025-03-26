package ex04_exam;

import java.util.Random;

public class MethodTest {
	
	//배열의 최대값을 찾는 maxFinder메서드
	//임의의 배열은 매개변수로 받자
	public void maxFinder(int[] arr) {
		
		int max = arr[0];
		
		for(int i =0; i< arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		
	
		
	}
	//원의 넓이와 둘레 구하기
	//함수를 호출하면서 반지름을 받는다
	//원의 넓이를 구하는 circleArea
	//원의 둘레를 구하는 circleRound
	//circleArea는 결과 출력하기
	//circleRound는 결과 반환하기
	
	public void circleArea(int r) {
		float area = (float)(r*r*3.14);
		System.out.println("원의 넓이 : " + area);
	}
	
	public float circleRound(int r) {
		float round = (float)(2*3.14*r);
		return round;                                 
	}
	
	//계산기 만들기
	//calculator 메서드
	//두 수와 연산자를 매개변수로 받는다
	
	public void calculator(float a, float b,char op) {
		float temp = 0;
		
		if(a<b) {
			temp = a;
			a = b;
			b = temp;
		}
		switch(op) {
		case '+':
			System.out.printf("a+b = %f \n" , a+b);
			break;
		case '-':	
			System.out.printf("a-b = %f \n" , a-b);
			break;
		case '*':
		System.out.printf("a*b = %f \n" , a*b);
		break;
		case '/':
			System.out.printf("a/b = %f \n" , a/b);
			break;
		}
		
		
	}
	//1~50사이의 난수를 생성
	//main쪽에서 키보드를 통해 정수를 입력받는다
	//check()메서드를 만들어서 사용자가 입력한 숫자를 판단
	//발생한 난수보다 크다면 down 작다면 up
	//사용자가 입력한 숫자와 발생한 난수가 같을 경우에 프로그램을 종료
	
	Random rd = new Random();
	
	int rnum = rd.nextInt(50)+1;
	int count = 1;
	
	public String check(int num) {
		
		if(num == rnum) {
			return "정답";
		} else if(num >rnum) {
			return "DOWN!";
		} else {
			return "UP!";
		}
	}
	
	
}