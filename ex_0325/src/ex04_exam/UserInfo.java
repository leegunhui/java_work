package ex04_exam;

public class UserInfo {
	int money;
	public void deposit(int money) {
		System.out.println("입급완료");
		this.money += money;
	}
	
	public void withdraw(int money) {
		if(this.money - money <0) {
			System.out.println("잔액부족");
		}
		else {
			System.out.println("출금완료");
			this.money -= money;
		}
	}
	
	public int showMoney() {
		return money;
	}
}


