package ex04_Calendar;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Ex01_Calendar {
	public static void main(String[] args) {
		//java.util 패키지에 있는 날짜와 시간 정보를 제공해주는 클래스
		//객체를 만들 때 new 키워드를 이용하여 선언하지 않고 생성된 객체를 받아오는 형식으로 선언한다.
		
		//Calender cal = new Calendar(); 오류
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.printf("오늘 날짜는 %d년%d월%d일 입니다.\n",year,month,day);
		
		//LocalDateTime
		//날짜 + 시간
		//java.time패키지에 있음
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//of()
		//틀정날짜와 시간 만들기
		LocalDateTime dt = LocalDateTime.of(2025, 3,31,11,4);
		System.out.println(dt);
		
		//자주쓰는 형식 패턴
		//yyyy
		//yy
		//MM
		//dd
		//HH 24시간
		//hh 12시간
		//mm 
		//ss
		//a : 오전/오후
		//E : 요일
		//EEEE : 요일 풀네임
		
		
	}
}
