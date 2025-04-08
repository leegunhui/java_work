package ex01_ThreadMethod;

public class SleepThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("카운트 다운 5초");
		for(int i = 5; i>=0; i--) {
			if(i!=0) {
				try{
					Thread.sleep(1000);//1000당 1초
					System.out.println(i);
					//InterruptedException
					//스레드가 해야할 일을 처리하지 못할 때
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("종료!");
	}
}
