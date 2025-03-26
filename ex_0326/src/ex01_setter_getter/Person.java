package ex01_setter_getter;

public class Person {
	//일반적으로 setter메서드를 사용할 때는, 필드의 값을 객체 외부에서
	//직접 접근하지 못하도록 제한한다.
	private int age;
	
	//나이의 값을 설정하는 메서드
	//해당 메서드가 setter역할을 하는 메서드임을 알려주는 방법은
	//메서드명의 접두사에 set을 붙인다.
	
	public void setAge(int num) {
		if(num <= 0) {// 만약, age에 넣으려는 값이 0보다 작거나 같다면
			System.out.println("잘못된 수를 입력하셨습니다.");
			return; //메서드 종료
		} else {
			age = num; //age필드에 num을 저장
		}
	}
	
	//메서드가 getter임을 알 수 있는 방법은
	//메서드 앞에 get 접두사를 붙힌다.
	
	public int getAge() {
		return age;
	}
	
	
}
