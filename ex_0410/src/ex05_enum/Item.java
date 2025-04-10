package ex05_enum;

//열거형
//상수들의 집합을 나타내는 특별한 데이터 타입
//기본적으로 자바의 모든 열거형은 java.leng.Enum클래스를 상속받는다
//name() : 열거형 상수의 이름을 문자열로 반환(START,STOP,EXIT)
//ordinal() : 열거형 상수가 정의된 순서를 반환(왼쪽부터 0부터 시작)
//valueof("상수명") : String값을 enum에서 가져온다 값이 없으면 Exception을 살생시킨다.
//valueof(Item.class, "START); : 넘겨받은 class에서 String을 찾아, enum에서 가져온다.
//values() : 열거형 상수안에 들어있는 내용들을 enum타입의 배열로 반환

//특별한 형태의 클래스이다
//클래스처럼 필드,생성자,메서드를 가질 수 있다
//각각의 상수들은 Item클래스로 만든 객체라고 생각하면 된다
public enum Item {
	//public static final Item START = new Item();
	//객체를 만들기 위한 생성자를 호출하는것이라고 생각한다.
	START("시작",">"), //Item START = new Item("시작",">");
	STOP("정지","||"),
	EXIT("종료","X");
	
	//각각의 상수에 필드 추가하기
	
	//필드의 선언
	String itemStr;
	String symbol;
	//생성자의 선언
	private Item(String itemStr,String symbol){
		this.itemStr = itemStr;
		this.symbol = symbol;
	}
	
	//메서드의 선언
	public String getItemStr() {
		return itemStr;
	}
	
	public String getSymbol() {
		return symbol;
	}
}
