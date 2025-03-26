package ex04_exam;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		int select;
		int money;
		
		UserInfo ui = new UserInfo();
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1. 입  금");
			System.out.println("2. 출  금");
			System.out.println("3. 잔액확인");
			System.out.println("4. 종  료");
			
			select = scan.nextInt();
			
			if(select == 1) {
				System.out.println("입금 메뉴입니다.");
				System.out.println("입금할 금액을 입력하세요 : ");
				money = scan.nextInt();
				ui.deposit(money);
				continue;
			}
			
			else if(select == 2) {
				System.out.println("출금 메뉴입니다.");
				System.out.println("출금할 금액을 입력하세요 : ");
				money = scan.nextInt();
				ui.withdraw(money);
				continue;
			}
			else if(select == 3) {
				System.out.println("잔액 확인 메뉴입니다.");
				System.out.println("잔액은" + ui.showMoney() + "원 입니다.");
				continue;
			}
			
			else if(select == 4){
				System.out.println("종료");
				break;
			}
			
			else {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
				continue;
			}
		}
		
	}

}
