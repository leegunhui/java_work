package ex01_Thread;

class AddStackThread extends Thread{
	private Storage stroage;
	public AddStackThread(Storage storage) {
		this.stroage = storage;
	}
	
	@Override
	public void run() {
		//짐을 10개씩 쌓는다
		try {
			while(true) {
				Thread.sleep(1000);
				if(this.stroage.getStackCount() == 0) {
					System.out.println("짐 10개 추기");
					this.stroage.addStack(10);//짐10개추가
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
} //AddStackThread

class PopStackThread extends Thread{
	private Storage storage;
	public PopStackThread(Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println("짐 5개 나르기");
				this.storage.popStack(5);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}


public class ThreadWaitExample {
	public static void main(String[] args) {
		Storage s = new Storage();
		AddStackThread add = new AddStackThread(s);
		PopStackThread pop = new PopStackThread(s);
		
		add.start();
		pop.start();
	}
	
	
}