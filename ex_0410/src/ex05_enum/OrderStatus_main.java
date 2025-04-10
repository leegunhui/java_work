package ex05_enum;

public class OrderStatus_main {
	public static void main(String[] args) {
		OrderStatus status = OrderStatus.ORDERED;
		
		try {
			System.out.println("현재상태 : " + status);
			status = status.next();
			System.out.println("현재상태 : " + status);
			status = status.next();
			System.out.println("현재상태 : " + status);
			status = status.next();//예외 발생
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}
}
