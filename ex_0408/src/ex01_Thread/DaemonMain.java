package ex01_Thread;

public class DaemonMain {
	public static void main(String[] args) {
		// 데몬 스레드를 생성합니다.
		Thread daemonThread = new Thread(new MyDaemonRunnable());

		// 데몬 스레드로 설정합니다.
		daemonThread.setDaemon(true);

		// 데몬 스레드 시작
		daemonThread.start();

		// 메인 스레드에서 1부터 15까지 출력합니다.
		for (int i = 1; i <= 15; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000); // 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("메인 스레드 종료");
	}
}

class MyDaemonRunnable implements Runnable {
	@Override
	public void run() {
		
		try {

			for (int i = 1; i <= 15; i++) {
				System.out.println("저장되었습니다");
				Thread.sleep(1000); // 3초 대기
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
