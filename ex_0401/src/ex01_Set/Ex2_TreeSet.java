package ex01_Set;

import java.util.Arrays;
import java.util.TreeSet;

public class Ex2_TreeSet {
	public static void main(String[] args) {
		//자바 컬렉션에서 제공하는 정렬된 set
		//중복을 허용하지 않지만
		//Tree기반이기 때문에 자동정렬이 된다
		//Red-Black Tree라는 자료구조를 기반으로 하고있다
		
		TreeSet<Integer> set1 = new TreeSet<Integer>();//TreeSet생성
	
		//TreeSet에 값 추가하기
		set1.add(7); // 루트노드
		set1.add(4);
		set1.add(9);
		set1.add(1);
		set1.add(5);
		
		 System.out.println(set1);
		 System.out.println(set1.first()); //최소값
		 System.out.println(set1.last());
		 System.out.println(set1.higher(3));
		 System.out.println(set1.lower(3));
		 
	}
}
