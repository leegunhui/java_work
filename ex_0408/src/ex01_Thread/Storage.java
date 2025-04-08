package ex01_Thread;

public class Storage {
	
	//재고
	private int stackCount = 10;
	
	//물건을 쌓는 메서드
	public synchronized void addStack(int stackCount) {
		this.stackCount += stackCount;
		if(this.stackCount >= 10) {
			System.out.println("== 스레드 깨우기 ===");
			notify();//스레드를 깨워서 물건을 날라라
			//wait()을 만나 대기상태에 빠진 스레드는 notify()를 만나 재 구동된다.
		}
	}
	
	public synchronized void popStack(int leaveCount) {
		try {
			//나르려는 양이 재고보다 많으면
			if(leaveCount > this.stackCount) {
				this.stackCount = 0;
			} else {
				this.stackCount -= leaveCount;
			}

			if(this.stackCount == 0) {
				System.out.println("== 짐 없음 대기 ===");
				wait();
				//스레드가 진행중에 wait()을 만나면 일시적으로 정지된다.
				//스레드가 구동되고 있을 때 일시적으로 대기상태에 보내고, 다른 스레드에게 제어권을 넘긴다.
				System.out.println("==짐 없음 대기완료===");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//재고 개수 확인 getter
	public int getStackCount() {
		return this.stackCount;
	}
}

