package ex05_Generic;

public class DataListExamaple {
	public static void main(String[] args) {
		//객체가 만들어지면서 배열을 같이 생성
		//클래스에 제네릭을 부여하게 되면 해당 클래스를 선언할 때
		//데이터 타입을 부여하게 된다
		
		//제네릭의 탑변수는 기본자료형을 인식하지 않는다
		//따라서 int, double등의 기본자료형을 제네릭타입으로 이용하고자 하면
		//Integer, Double등의 클래스를 이용해야한다
		
		DataList list = new DataList();
		
		//object타입의 배열이기 때문에 정수,문자열,실수가 들어와도 넣을 수 있다
		//정수입력
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		//문자열저장
		//list.add("문자열");
		
		//실수저장
		//list.add(10.33);
		
		//데이터 출력
		for(int i = 0; i < list.size(); i++) {
			//데이터 가져오기
			Object data = list.get(i);
			
			//저장된 데이터 타입이 어떤타입인지 검사
			if(data instanceof Integer) {
				System.out.println("정수 : " + (int)data);
			} else if(data instanceof Double) {
				System.out.println("실수 : " + (double)data);
			} else if(data instanceof String) {
				System.out.println("문자열 : " + (String)data);
			}
		}
	}
}
