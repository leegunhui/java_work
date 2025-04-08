package ex01_Thread;

public class ThreadCount extends Thread{
	private int count;
	//private으로 생성된 필드에 값 전달받기
	//1. 생성자를 통해 전달한다
	public ThreadCount(int count) {
		this.count = count;
	}
	//2. setter를 통해 받는다
	public void setCount(int count) {
		this.count = count;
	}
	
	//값을 반환받고싶으면 getter를 만든다
	public int getCount() {
		return count;
	}
	@Override
	public void run() {
		try {
			for(int i = count; i >=0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			
		}
		System.out.println("종료");
	}

}

	