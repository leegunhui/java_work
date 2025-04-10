package ex02_BufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex02_BufferedReader {
	public static void main(String[] args) {
		//BufferedReader를 이용해서 키보드에서 값을 입력받는다
		//장점 : Scanner보다 속도가 빠르다
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
//			키보드로부터 문자열 입력받기
			System.out.println("문자열 입력 : ");
			String str = reader.readLine();

//			정수 입력받기
			System.out.println("정수 입력 : ");
			int n = Integer.parseInt(reader.readLine());
			
			System.out.println("문자열 : " + str);
			System.out.println("정수 : " + n);
			
//			특정 기준을 가지고 정수 여러개 입력받기
			String[] arr = reader.readLine().split("");
			System.out.println(Arrays.toString(arr));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//원칙대로면 close()를 통해 닫아줘야하는데
		//System.in은 닫으면 별로 좋지않다
		//static이기때문에 System.in을 받아서 사용하는
		//다른객체들이 못쓰게된다
		

	}
}
