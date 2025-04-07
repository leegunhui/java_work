package ex01_ThreadMethod;

public class JoinMain {
public static void main(String[] args) {
		JoinExample je = new JoinExample();
		je.start();
		
		try {
			je,join();
			
		}catch(Exception e) {
			
		}
		System.out.println("main 스레드 종료");
	}
}
