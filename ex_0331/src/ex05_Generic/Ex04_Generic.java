package ex05_Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//<?> : 정확히 타입을 모를때 사용
//<T> : 정의하는 시점에서 사용
public class Ex04_Generic {
	public static void main(String[] args) {
	    List<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3));
	    print(lists); // ! 컴파일 에러 발생
	}
	
	//Number와 그 자식클래스까지만 허용한다
//	public static void print(List<? extends Number> list) {
//	    for (Object e : list) {
//	        System.out.println(e);
//	    }
//	}
	
	//Integer을 포함한 부모타임까지만 허용한다
//	public static void print(List<? super Integer> list) {
//	    for (Object e : list) {
//	        System.out.println(e);
//	    }
//	}
	
//	와일드카드의 경우는 메서드의 매개변수의 타입으로 사용하는것이 일반적이다.
	public static void print(List<?> list) {
	    for (Object e : list) {
	        System.out.println(e);
	    }
	}
}
