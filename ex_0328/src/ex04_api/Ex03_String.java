package ex04_api;

public class Ex03_String {

	public static void main(String[] args) {
		//length()
		//문자열의 길이를 반환하는 메서드
		String str = "Kim Mal Ddong";
		System.out.println("문자열 str의 길이 : " + str.length());
		
		//indexOf(char ch)
		//인자로 전달된 글자의 인덱스 값을 반환한다
		int index = str.indexOf('k');
		System.out.println("맨 처음 문자 k의 위치 : " + index);//대소문자 구별 함
		
		
		index = str.indexOf("Mal");
		System.out.println("문자열 Mal의 위치 : " + index);//띄어쓰기 포함
			
		index = str.lastIndexOf('n');
		System.out.println("마지막 문자 n의 위치 : " + index);
		
		//charAt(int index)
		//인자로 전달된 인덱스에 해당하는 글자를 반환
		char c = str.charAt(4);
		System.out.println("추출한 문자 : " + c);
		
		//substring(int offet,int end)
		//일정 인덱스만큼 글자를 잘라서 반환
		String str2 = str.substring(0, str.indexOf('M'));
		System.out.println("0번째부터 M앞자리까지 글자 잘라내기 : " + str2);
		System.out.println("잘라낸 str2의 길이 : " + str2.length());//길이는 띄어쓰기 포함 1부터 증가
		
		
		//스트링은 아니지만 스트링으로 작성된 숫자형태의 문자열을 실제 정수로 바꿔주는 코드
		String number = "1";
		System.out.println(Integer.parseInt(number) + 10);

		int number1 = 1;
		String s1 = Integer.toString(number1);
		System.out.println(s1);
				
		String arr[] = str.split(" ");//띄어쓰기를 기준으로 분할

		for(int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "] : " + arr[i]);

		//특정문자열을 치환해주는 메서드
		//replace(기존문자열, 바꿀문자열);
		System.out.println(str.replace("Mal", "Gae"));

		//특정문자를 포함하고 있는지 판별
		//contains(String str)
		System.out.println(str.contains("a"));

		//문자열의 길이가 0인경우 true를 반환
		//isEmpty();
		System.out.println(str.isEmpty());
	}

}
