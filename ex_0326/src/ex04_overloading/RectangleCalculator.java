package ex04_overloading;

public class RectangleCalculator {
	//다양한 방식으로 사각형의 넓이 구하기
	
	//메서드명 area
	//1.정사각형의 한변의 길이를 받아 넓이 반환하기
	//2. 가로 세로의 길이를 받아 직사각형의 넓이 반환
	//3.실수형 가로 세로를 받아 실수결과 반환하기
	
	public void area(int a) {
		System.out.printf("정사각형의 넓이는 %d \n" , a*a);
	}
	
	public void area(int a, int b) {
		System.out.printf("직사각형의 넓이는 %d \n" , a*b);
	}
	
	public void area(double a, double b) {
		System.out.printf("사각형의 넓이는 %f \n" , a*b);
	}
}
