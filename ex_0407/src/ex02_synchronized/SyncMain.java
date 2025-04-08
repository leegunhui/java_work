package ex02_synchronized;

public class SyncMain {
	public static void main(String[] args) {
		SynchronizedEx atm = new SynchronizedEx();
		Thread mom = new Thread(atm, "엄마");
		//Thread.currentThread().getName();이 "엄마"가 된다.

		Thread son = new Thread(atm, "아들");
		
		mom.start();
		son.start();
	}
}
