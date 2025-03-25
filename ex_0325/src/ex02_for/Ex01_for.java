package ex02_for;

public class Ex01_for {

	public static void main(String[] args) {
		//향상된 for문
		//향상된 for문은 JDK 1.5부터 새롭게 추가된 기능으로 
		//배열과 컬렉션의 모든 요소를 참조하기 위한 반복문이다.
//		for(자료형 변수 : 배열){
//		    실행코드
//		}
		int[] ar = {1,2,3,4,5};
		for(int i =0; i <ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		for(int i : ar) {
			System.out.println(i);
		}
//		for문을 실행할 반복 대상이 있으면 변수는 반복대상이 지닌 자료형과 같은 타입으로 지정해야 한다.
//		반복 대상의 요소를 하나씩 꺼내서 변수에 대입하면서 진행하고, 반복 대상의 길이만큼 꺼내어 반복한다.
	}

}
