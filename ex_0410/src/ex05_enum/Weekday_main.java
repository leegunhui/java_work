package ex05_enum;

public class Weekday_main {
	public static void main(String[] args) {
		
		Weekday today = Weekday.SUNDAY;
		
		if(today == Weekday.SUNDAY) {
			System.out.println("쉬는날 입니다");
		}
		else {
			System.out.println("출근날 입니다.");
		}
		
	}
}
