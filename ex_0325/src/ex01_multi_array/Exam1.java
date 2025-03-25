package ex01_multi_array;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [][] arr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		
		//배열 arr의 총합과 평균
		System.out.println("-----------1번----------");
		int total = 0;
		float average = 0;
		int count = 0;

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				total += arr[i][j];
				count++;
			}
		}
		System.out.println("총합 : " + total);
		average = (float)total / count;
		System.out.println("평균 : " + average);
		
		System.out.println("-----------2번----------");
		System.out.println("");
		//학생들의 정보를 입력하고, 출력하는 프로그램 작성하기
		//학생들의 수학과 영어성적등록프로그램
		//1. 프롬그램 실행하면 몇명 정보를 저장할건지 입력받음
		//2. 입력받은 수만큼 학생들의 이름 수학 영어 성적을 입력받고 출력
		//3개다 string
		
		System.out.print("학생수 입력 : ");
		int students = scan.nextInt();

		String str[][] = new String[students][3];
		

		for(int i = 0; i < str.length; i++){
			
			System.out.printf("%d번 학생 입력 \n" , i+1);
			System.out.print("이름 : ");
			str[i][0] = scan.next();

			System.out.print("수학 : ");
			str[i][1] = "수학 : " + scan.next();

			System.out.print("영어 : ");
			str[i][2] = "영어 : " + scan.next();
			
		}		
		
		for(int i = 0; i < str.length; i++){
			for(int j = 0; j < str[i].length; j++){
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}

	}

}