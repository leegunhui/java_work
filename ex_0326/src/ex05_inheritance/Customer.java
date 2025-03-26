package ex05_inheritance;

public class Customer extends Person{
	int memberId;
	
	public Customer(String name, int age, int memberId) {
		//super(); 생략 되어있는것 부모생성자의 호출
		super(name,age);
		this.memberId = memberId;
	}
	
	void enter() {
		System.out.printf("회원번호 %d(%s,%d세)님 입장 \n" , memberId,name,age);
	}
}
