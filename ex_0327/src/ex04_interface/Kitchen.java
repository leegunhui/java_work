package ex04_interface;

public class Kitchen implements Menu1, Menu2{
	//여러개의 인터페이스를 구현할 수 있다
			//인터페이스를 구현한 클래스는 반드시 추상메서드를
			//오버라이드 해야한다
			
			//메서드의 재정의
			//컴파일러에게 메서드가 재 정의 됐다는것을 알려준다\
			
		
	@Override
	public String JJamBBong() {
			return null;
	}
	
	@Override
		public String jajang() {
			// TODO Auto-generated method stub
			return null;
		}
}
