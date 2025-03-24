package ex06_operator;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//1번
//		int x = 5;
//		int y = x++;
//
//		System.out.println("x의 값 : " +x); // x : ?  -> 6
//		System.out.println("y의 값 : " +y); // y : ?  -> 5

		
		//2번 
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);
//		System.out.println(z); // 31
		
		//3번
//		int a = 10;
//		int b = 12;
//		//++a >= b 
//		|| 2 + 7 <=b     ->true  
//				&& 13 - b >= 0 ->true 
		//&& (a += b) - (a % b) > 10; -> true..????

		
//		국 수 영 에대한 점수를 스캐너로 정수로 입력받고
//		세과목의 합, 평균 출력
//		세과먹의 점수와 평균을 가지고 합격여부 출력 각각 40점이상이면서 평균 60점이상일 때 합격 아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();

		int total = korean + english + math;
		double avg = ((total) / 3.0);

		System.out.println(total);
		System.out.println(avg);

		String result = (korean >= 40 && english >= 40 && math >= 40 && avg >= 40) ? "합격" : "불합격"; 
		System.out.println(result);
		
		System.out.println("농구공의 개수는?");
		int ball = sc.nextInt();
		int box = ball % 5 == 0 ? ball/5 : ball/5 + 1;
		System.out.println("필요한 상자의 수 : " + box);
		
		int pear = 5; 
		int apple = 7;
		int orange = 5;
				
		int fruitSum = pear + apple + orange;
		System.out.println("하루에 생산되는 과일 수 : " + fruitSum + "개");
				
		float average = fruitSum / (float)24; //시간당 평균
		System.out.println("시간당 평균 생산 갯수 : " + average + "개");
	}

}
