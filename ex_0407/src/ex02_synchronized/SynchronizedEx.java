package ex02_synchronized;

public class SynchronizedEx implements Runnable {
	private long money = 10000;//잔액

	@Override
	public void run() {
		//synchronized키워드를 사용하면 
		//해당 키워드가 명시되어있는 영역이 마무리 될 때까지
		//다른 스레드에서 접근하지 못하게 된다.
		//SynchronizedEx.class : SynchronizedEx 클래스 자체
		//Synchronized클래스에 락을 걸겠다
		//하나의 스레드가 이미 점유중이라면 다른 스레드가 사용할 수 없다
		
		//synchronized블록
		//필요한 부분만 선택적으로 동기화 할 수 있어 조금 더 성능을 최적화할 수 있다
		
		synchronized (SynchronizedEx.class) { //this
		
			for(int i = 0; i < 10; i++){
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
					
				if(getMoney() <= 0)
					break;//잔액이 0이면 for문을 탈출
				//Main까지 만들어 결과 찍어서 보여준 후에
				//if문 주석달고 son이 구동되는 것도 확인해보자.
				//그리고 위의 synchronized (SynchronizedEx.class) 영역도 주석처리해서
				//엄마와 아들이 동시에 돈을 찾는 현상도 확인해보자
				
				//outMoney()함수 먼저 정의한 후에 추가
				outMoney(1000);
			}//for
		}//synchronized
	} 
	
	public long getMoney() {
		return money;
	}
	
	public void setMoney(long money) {
		this.money = money;
	}
	
	public void outMoney(long howMuch){//출금
		
		//해당 스레드의 이름을 가져옴.
		//이름은 해당 스레드를 생성하는 클래스에서 기재하게 됨
		String threadName = Thread.currentThread().getName();
		
		if(getMoney() > 0){//잔액이 0이상일때 출금가능
		   money -= howMuch;//잔액에서 출금액을 마이너스		
		   System.out.println(threadName + " - 잔액 : " + getMoney() + "원");
			
		}else{
			System.out.println(threadName + " - 잔액이 없습니다.");
		}
	}
}
