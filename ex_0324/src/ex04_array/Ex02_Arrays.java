package ex04_array;
import java.util.Arrays;
import java.util.Comparator;
public class Ex02_Arrays {

	public static void main(String[] args) {
//		Arrays 클래스는 배열의 복사, 항목 정렬, 항목 검색 등 배열을 다루기 위한 다양한 메서드를 제공한다.
//		지금 당장은 배열의 도우미 기능을 지닌것으로만 생각하자.
//		Arrays클래스를 이용하면 배열의 기능을 더욱 쉽게 사용할 수 있다.
//		Arrays에 속해있는 기능을 사용할 때는 'Arrays.함수명()'로 작성하여 기능을 호출한다.
		
		//1. 배열의 출력
//		toString()은 반복문의 도움 없이 배열을 출력할 수 있도록 도와준다.
//		배열에 정의된 값을 문자열(String)형태로 변환하여 출력해준다.
		
		int[] arr = {1,6,2,3,10,7,4,5,8,9};
		System.out.println(Arrays.toString(arr));
		
//		sort()는 배열을 정렬해주는 기능이 있다.
//		기본적으로 오름차순으로 정렬이 된다.
				
		int[] arr2 = {1,6,2,3,10,7,4,5,8,9};
				
		//정렬전
		System.out.println(Arrays.toString(arr2));
				
		//정렬후
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
//		Comparator.reverseOrder()를 통해서 내림차순으로 정렬이 가능하다.
//		하지만 기본자료형 배열로는 불가능하다.
//		기본자료형의 클래스타입이 필요한데 이를 Wrapper클래스 라고 한다.
		
				
		Integer[] arr3 = {1,6,2,3,10,7,4,5,8,9};
				
		//정렬후
		Arrays.sort(arr3, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr3));
		
//		배열의 복사
//		자바에서 배열은 한 번 생성하면 그 길이를 변경할 수 없다.
//		따라서 더 많은 데이터를 저장하거나 기존의 배열과 똑같은 배열을 새로 만드려면 배열을 복사해야 한다.
//		배열을 복사하는 방법에는 얕은 복사와 깊은 복사 두가지가 있다.
//		얕은 복사(Shallow Copy) : 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 함께 변경된다.
//		깊은 복사(Deep Copy) : 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값은 바뀌지 않는다.
		int[] arr01 = {1,2,3};
		
		//배열의 얕은 복사
		int[] arr02 = arr01;
		
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		
		//배열 arr02의 값 변경
		arr02[1] = 10;
		
		//arr01변경 후 배열 출력
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		System.out.println("arr02 배열 : " + Arrays.toString(arr02));
		//깊은 복사
		//배열의 깊은 복사는 반복문을 이용해 새로운 배열에 값을 직접 넣어주거나
		//Arrays클래스 또는 System 클래스가 가진 기능을 이용한다.
		int [] cards = {1,6,4,5,3,2};
		int [] newCards = new int[cards.length];
		
		//Arrays클래스를 이용한 깊은 복사
		int [] newCards2 = Arrays.copyOf(cards, cards.length);
		
		//반복문을 이용한 깊은 복사
		for(int i =0; i < cards.length; i++) {
			newCards[i] = cards[i];
		}


		//System클래스를 이용한 깊은 복사
		int[] newCards3 = new int[5];

		System.arraycopy (cards, 0, newCards3, 0, cards.length);
		
		newCards[1] = 100;
		
		System.out.println("cards 배열 : " + Arrays.toString(cards));
		System.out.println("newCards 배열 : " + Arrays.toString(newCards));
		System.out.println("newCards2 배열 : " + Arrays.toString(newCards2));
		System.out.println("newCards3 배열 : " + Arrays.toString(newCards3));
		
//		다차원배열
//		다차원 배열이란 2차원 이상의 배열을 의미하며, 배열의 요소로 또 다른 배열을 가지는것을 의미합니다.
//		2차원 배열은 배열의 요소로 1차원 배열을 가지고,
//		3차원 배열은 배열의 요소로 2차원 배열을 가지게 됩니다.
//		int [][] arr = new int [크기][크기];
		
		int[][]arr31 = new int[2][3];
		
		arr31[0][0] = 1;
		arr31[0][1] = 2;
		arr31[0][2] = 3;
		
		arr31[1][0] = 11;
		arr31[1][1] = 12;
		arr31[1][2] = 13;
		
		//행의 주소 출력
		System.out.println("2차원 배열 : " + arr31);
		
		//1행이 가진 열에 대한 주소 출력
		System.out.println("2차원 배열 1행 : " + arr31[0]);
		
		//행의 크기 출력
		System.out.println("행의 크기 : " + arr31.length);
		
		//각 행의 열 크기 출력
		System.out.println("1 행의 열 크기 : " + arr31[0].length);
		System.out.println("2 행의 열 크기 : " + arr31[1].length);
		
		//1행 1열의 값 출력
		System.out.println("arr3[0][0] : " + arr31[0][0]);
	}

}
