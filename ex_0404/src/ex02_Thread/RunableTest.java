package ex02_Thread;

//스레드를 생성하는 방법2번째
//Runnable 인터페이스를 구현한다

public class RunableTest implements Runnable{

	@Override
	public void run() {
		//작업할내용
		for(int i = 0; i<10; i++) {
			System.out.println("Runnable 진행중" +i);
		}
	}
	
}
