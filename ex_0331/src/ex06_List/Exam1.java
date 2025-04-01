package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		
		out :while(true) {
			System.out.println("아이디 생성 : ");
			String id = sc.next();
			
			for(int i = 0; i<list.size(); i++) {
				if(id.equals(list.get(i))) {
					System.out.println("중복된 아이디입니다.");
					continue out;
				}
			}
			list.add(id);
			
			System.out.println(list);
			System.out.println();
			
			if(list.size()==5) {
				break;
			}
		}
		
		
	}	
}
	
