package ex02_class_casting;

public class CalendarMain {

	public static void main(String[] args) {
		DeskCalendar dc = new DeskCalendar("보라색", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();
		
		Calendar c = new DeskCalendar("검은색", 12);
		c.info();
		c.hanging(); //오버라이드된 메서드가 호출된다.
		//c.onTheDesk(); 에러

	}

}
