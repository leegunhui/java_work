package ex02_switch;

public class Ex03_switch {

	public static void main(String[] args) {
		String day = "SUNDAY";
		
//		조건절에 복수개의 값을 사용하는것이 가능해졌다.
//		화살표 표현식을 이용하는게 가능하다.
//		기존 switch문과 달리 case에 해당하는 절만 실행되고, 그 이후 case들은 실행되지 않는다.
		//기존의 switch문
		//불필요하게 장황하다
		//에러 발생시 디버깅이 어렵다
		
		switch(day) {
		case "MONDAY":
		case "TUESDAY":
		case "WENDSDAY":
		case "THURSDAY":
		case "FRIDAY":
			System.out.println("평일");
			break;
		case "SATURDAY":
		case "SUNDAY":
			System.out.println("주말");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		//자바 12이상에서의 switch문
		switch(day) {
		case "MONDAY", "TUESDAY", "WENDSDAY", "THURSDAY", "FRIDAY" -> System.out.println("평일");
		case "SATURDAY","SUNDAY" ->System.out.println("주말");
		default -> System.out.println("잘못된 입력입니다.");
		}

	}

}
