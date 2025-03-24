package ex04_array;

public class Ex01_Array {

	public static void main(String[] args) {
		//배열의 선언
		int[] arr=null;
		
		System.out.println(arr);
		
		//배열의 생성
		//크기가 4인 정수형 배열의 생성
		int[] iArr = new int[4];
		
		//배열명에는 배열까지 접근할 수 있는 주소값이 들어가있다
		
		String s = "홍길동";
		
		//값을 직접 변수에 저장하는것이 아니라 주소값이 저장되어
		//해당 주소를 통해 실제 주소에 접근하는 것을 참조변수라고한다
		
//		배열의 특징
//		배열 선언 시 크기를 지정한다.
//		배열 선언 후 공간의 크기를 늘리거나 삭제할 수 없다.
//		지정된 자료형의 값만 저장할 수 있다.
		
//		1. 인덱스(index)
//		배열을 만든 후에는 값을 넣거나 꺼내야 한다.
//		배열은 각 공간마다 위치를 알려주는 위치 값이 존재한다.
//		우리는 배열이 지니는 값들의 위치를 인덱스(index)라고 부른다.
//		인덱스(index)는 배열의 공간마다 붙여진 번호로 0부터 시작하여 순차적으로 증가한다.
		
		iArr[0] = 100;
		iArr[1] = 200;
		iArr[2] = 300;
		iArr[3] = 400;
		
		System.out.println(iArr[0]);
		System.out.println(iArr[1]);
		System.out.println(iArr[2]);
		System.out.println(iArr[3]);
		
		//배열의 길이
		//배열은 내부적으로 length라는 변수를 지니는데,
		//해당 변수는 배열의 길이 값을 가지고 있다
		//배열의 길이를 알고싶을때는 배열명.length를 하면된다
		//이 변수의 값은 배열이 생성될 때 지정되며 변경할 수 없다.
		System.out.println("---------------------");
		for(int i = 0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		//배열의 초기값
//		배열은 생성과 동시에 데이터 자료형 별로 기본값이 주어진다.
		// 정수->0, 실수 -> 0.0, 문자형 -> '',객체형 -> null
//		배열을 선언했을 때 저장되는 초기값을 자료형 별로 정리하면 다음과 같다.
		//5개의 공간을 가지는 배열선언
				int [] intArray = new int[5];
				String[] strArray = new String[5];
				
				//5개의 값을 가지는 배열 선언
				int [] varArray = {1,2,3,4,5};
				
				//intArray의 첫번째 값 출력
				System.out.println("intArray[0] : "+intArray[0]);
				//intArray의 두번째 값 출력		
				System.out.println("intArray[1] : "+intArray[1]);
				//strArray의 첫번째 값 출력
				System.out.println("strArray[0] : "+strArray[0]);
				//strArray의 두번째 값 출력		
				System.out.println("strArray[1] : "+strArray[1]);
				//varArray의 첫번째 값 출력
				System.out.println("varArray[0] : "+varArray[0]);
				//varArray의 두번째 값 출력		
				System.out.println("varArray[1] : "+varArray[1]);		
	}

}
