package ex05_Scanner;
import java.util.Scanner;
public class Ex1_Scanner {

	public static void main(String[] args) {
		//데이터의 입력
		//프로그램을 실행할 때 키보드를 통해 입력한 데이터를
		//변수에 대입하겠다
		//java.util패키지에 있는 scanner을 사용
		//Scanner 객체명 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요");

		//자료형 변수명 = 객체명.Scanner함수();
		int age = sc.nextInt();

		System.out.printf("제 나이는 %d세 입니다.",age);
		//Scanner 객체명 = new Scanner(System.in);
		String name,address;
		int age2;
		double weight;
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("나이 : ");
		age2 = sc.nextInt();
		
		System.out.print("주소 : ");
		address = sc.next();
		
		System.out.print("체중 : ");
		weight = sc.nextDouble();

		System.out.printf("당신의 이름은 %s입니다.\n",name);
		System.out.printf("당신의 나이는 %d입니다.\n",age);
		System.out.printf("당신의 주소는 %s입니다.\n",address);
		System.out.printf("당신의 체중은 %.1fkg입니다.\n",weight);

	}

}
