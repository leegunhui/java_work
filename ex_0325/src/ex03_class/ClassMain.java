package ex03_class;

public class ClassMain {

	public static void main(String[] args) {
		//자동차 객체 C를 만든다
		Car c = new Car();
		//클래스에 선언된 필드를 사용하는 법
		//객체명.필드명;
		System.out.printf("바퀴 개수는%d개 \n" , c.wheel);
		
		//구현한 메서드를 사용하는 방법은 필드의 사용법과 동일함
		//다른 클래스에서 메서드를 사용하려면 객체를 생성한 후
		//참조변수를 이용해 그 객체의 메서드를 사용해야한다.
		
		c.ride();
		c.ride();
		c.ride();
		c.ride();
		
		//메서드를 한번 선언해두면 필요할때마다 여러번 호출하여 사용가능
		//즉 메서드를 사용하면 반복적인 프로그래밍을
		//보다 쉽고 간단하게 해결할 수 있다
		
		//가족 구성원 객체를 생성
		Family father = new Family();
		Family son = new Family();
		
		//정적 변수는 클래스명.필드명을 통해 대입이나 출력을 한다
		Family.address = "인천";
		System.out.println(Family.address);
		
		//정적 변수와 정적 메서드의 경우에는
		//객체 생성 없이 사용할 수 있다
		System.out.println(Student.schoolName);
		Student.goToSchool();
		
		//필드
		//ㄴ 일반필드 -> 객체마다의 상태(이름,나이,직업,키,몸무게)
		//ㄴ 정적필드 -> 객체의 공통의 상태(눈,코,입,귀,손가락)
		
		//메서드
		//ㄴ메서드는 메서드 안에서 정의할 수 없다
		//ㄴ메서드는 메서드 안에서만 호출할 수 있다
		
		Student stu1 = new Student();
		stu1.studentName = "홍길동";
		stu1.hello();
	}

}
