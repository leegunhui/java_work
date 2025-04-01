package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<UserInfo> arr = new ArrayList<>();
		while(true) {
			System.out.println("아이디 생성 : ");
			
			UserInfo u = new UserInfo();
			u.makeId(scan.next());
			
			System.out.println("비밀번호 입력 : ");
			u.makePw(scan.nextInt());
			
			arr.add(u);
			
			for(int i = 0; i<arr.size(); i++) {
				System.out.println(arr.get(i),getId());
				System.out.println(arr.get(i),getPw());
				System.out.println();
			}
		}
	}
}
