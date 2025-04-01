package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList <MenuItem> menuList = new ArrayList<>();
		ArrayList <MenuItem> orderList = new ArrayList<>();
		
		menuList.add(new MenuItem("아메리카노" , 3000));
		menuList.add(new MenuItem("라떼" , 3500));
		menuList.add(new MenuItem("카푸치노" , 4000));
		
		while(true) {
			System.out.println("=== 카페 주문 시스템 ===");
			System.out.println("1.메뉴보기");
			System.out.println("2.주문 추가");
			System.out.println("3.결제하기");
			System.out.println("4.취소하기(선택한 항목 하나를 취소)");
			System.out.println("5.프로그램 종료");
			System.out.println("번호 선택 : ");
			int choice = sc.nextInt();
				if(choice == 1) {
					System.out.println("[메뉴판]");
						for(int i = 0; i<menuList.size(); i++) {
							System.out.println((i+1)+". " + menuList.get(i).name+" - "+ menuList.get(i).price+"원" );
		
						}	
				}
				else if (choice == 2) {
					System.out.println("메뉴번호 입력 : ");
					int menuNumber = sc.nextInt();
					if(menuNumber >= 1 && menuNumber <= menuList.size()) {
						MenuItem selectedItem = menuList.get(menuNumber-1);
						orderList.add(selectedItem);
						System.out.println("'" + selectedItem.name + "'가 주문에 추가되었습니다.");
					}
					else {
						System.out.println("잘못된 번호입니다.");
					}
				}
				else if(choice ==3 ) {
					if(orderList.size()==0) {
						System.out.println("주문목록이 비어있습니다.");
					}
					else {
						System.out.println("\n [결제내역]");
						int totalPrice = 0;
						for(MenuItem item : orderList) {
							System.out.println("- " + item.name);
							totalPrice += item.price;
						}
						System.out.println("총 금액 : " + totalPrice + "원");
						System.out.println("결제가 완료되었습니다. 감사합니다.");
						orderList.clear();
					}
				}
				else if(choice == 4) {
					if(orderList.size()==0) {
						System.out.println("취소할 주문이 없습니다.");
					}
					else {
						System.out.println("\n [현재 주문 내역]");
						for(int i = 0; i<orderList.size(); i++) {
							System.out.println((i+1) + ". "+ orderList.get(i).name + " -"+orderList.get(i).price + "원");
						}
						System.out.println("취소할 주문 번호를 입력하세요: ");
						int cancelNumber = sc.nextInt();
						
						if(cancelNumber >=1 && cancelNumber <= orderList.size()) {
							MenuItem removedItem = orderList.remove(cancelNumber-1);
							System.out.println("'" + removedItem.name + "' 주문이 취소되었습니다.");
			
						}
						else {
							System.out.println("잘못된 번호입니다.");
						}
					}
				}
				else if(choice == 5) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				else {
					System.out.println("올바른 번호를 입력하세요.");
				}
		}
	}
}
