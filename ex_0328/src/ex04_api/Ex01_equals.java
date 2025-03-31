package ex04_api;

public class Ex01_equals {
	public static void main(String[] args) {
		//묵시적(암시적)객체 생성
		//같은 문자열일때 이미 메모리에 올라가 있으면 참조해버린다
		String str1 = "hello";
		String str2 = "hello";
		
		//명시적 객체 생성
		String str3 = new String("hello");
		
		//문자열 변수 비교
		System.out.println("str1 vs str2 : " + (str1 == str2));
		System.out.println("str2 vs str3 : " + (str2 == str3));
		
		//각 문자열 변수가 있는 위치의 값을 출력
		//System.identityHashCode() : 객체의 고유한 hashcode를 리턴하는 메서드
		//hashcode()는 다른 객체이지만 주소가 동일한 경우가 있을 수 있다.
		System.out.println("str1 hashCode : " + System.identityHashCode(str1));
		System.out.println("str2 hashCode : " + System.identityHashCode(str2));
		System.out.println("str3 hashCode : " + System.identityHashCode(str3));
		
		System.out.println("str1 vs str2 : " + (str1.equals(str3)));
		System.out.println("str2 vs str3 : " + (str2.equals(str3)));
		
		//얕은복사(shallow copy)
		//주소를 복사해주기 때문에 원본값이 바뀌면 복사본도 바뀐다
		str1 = "bye";
		System.out.println(str2);;
		
		//문자열의 불변(immutable)
		
	}
}
