package ex02_break;
import java.util.Random;
import java.util.Scanner;
public class Exam1 {

	public static void main(String[] args) {
		//1~50사이의 난수를 생성하고 난수를 맞추는 프로그램 만들기
		//입력한 값이 난수보다 작으면 " 맞춰야할 숫자가 더큽니다"
		//입력한 값이 난수보다 크면 "맞춰야할 숫자가 더 작습니다."
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int random = r.nextInt(50)+1;
		int guess = 0;
		int count = 0;
		
		while (guess != random) {
            System.out.print("숫자를 입력하세요: ");
            guess = sc.nextInt();

            if (guess < random) {
                System.out.println("맞춰야 할 숫자가 더 큽니다.");
                count ++;
            } else if (guess > random) {
                System.out.println("맞춰야 할 숫자가 더 작습니다.");
                count ++;
            } else {
                System.out.println("정답입니다! 맞췄습니다!");
                System.out.printf("%d번 만에 맞췄습니다." , count+1);
                break;
            }
        }


    }

		
}


