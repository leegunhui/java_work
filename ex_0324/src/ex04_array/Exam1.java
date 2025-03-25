package ex04_array;

import java.util.Random;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----------1번----------");
		int [] iArr = new int[10];
		int sum = 0;
		for(int i = 0; i <=9; i++) {
			iArr[i] = i+1;
			sum += iArr[i];
		}
		
		System.out.printf("%d \n" , sum);
		
		Random r = new Random();
		System.out.println("-----------2번----------");
		//r.nextInt(30)+1
		//iArr에 각 index에 난수를 넣고 배열의 짝수요소들의 총합구하기
		int sum2 = 0;
		for(int i = 0; i<iArr.length; i++) {
			iArr[i] = r.nextInt(30)+1;
			if(iArr[i]%2==0) {
				sum2 += iArr[i];
			}
		}
		System.out.printf("%d \n" , sum2);
		
		System.out.println("-----------3번----------");
		
		int[] nums = {5,7,2,9,4,10,3};
		//배열에서 최대 최소값 구하기
	
        int max = nums[0];
        int min = nums[0];
         
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        
       System.out.printf("최대값 : %d, 최소값 : %d \n" , max,min);
       System.out.println("-----------4번----------");
       
       int[] nums2 = {1,2,1,3,2,1,4};
       // 위 배열에서 각 숫자가 몇번 나왔는지 출력
       int[] count = new int[5];

       for (int i = 0; i < nums2.length; i++) {
           count[nums2[i]]++;
       }

       for (int i = 1; i < count.length; i++) {
           System.out.println(i + " : " + count[i] + "번");
       }
       System.out.println("-----------5번----------");
       
       int[] nums3 = {5,3,8,4,2};
       
       for (int i = 0; i < nums3.length - 1; i++) {  
           for (int j = 0; j < nums3.length - 1 - i; j++) {  
               if (nums3[j] > nums3[j + 1]) {
                   int temp = nums3[j];
                   nums3[j] = nums3[j + 1];
                   nums3[j + 1] = temp;
               }
           }
       }

       System.out.print("오름차순 정렬 결과: ");
       for (int i = 0; i < nums3.length; i++) {
    	    System.out.print(nums3[i] + " ");
       }
       System.out.println(" ");
       System.out.println("-----------6번----------");
       //배열에서 영문자만 추출하여 이어붙혀 출력
       char[] cards = {'1','L','O','2','V','3','E'};
		String myWord = "";
		
		for(int i = 0; i < cards.length; i++) {
			int word = cards[i];
			if((word >= 65 && word <= 90) || (word >= 97 && word <= 122)) {
				myWord += (char)word;
			}
		}
		
		System.out.println("단어 : \n" + myWord);
		
		System.out.println("-----------7번----------");
		//키보드에서 배열의 길이를 입력받는다.
		//입력받은 배열의 길이만큼 알파벳을 넣고 출력한다
		//배열의 길이 : 5 ABCDE
		
		System.out.printf("배열의 길이는? :");
		int arrayLength = scan.nextInt();
		
		char alphabet[] = new char[arrayLength];
		char start = 'A';
		
		for(int i = 0; i < alphabet.length; i++){
			System.out.print(alphabet[i] = start++);
		}
		System.out.println(" ");
		System.out.println("-----------8번----------");
		//동전의 개수 구하기
		//10~5000사이의 난수를 변수에 담는다
		//1의자리는 반드시 0이 되도록한다
		//발생된 난수를 각 동전으로 바꿀때 몇개씩 필요한지 판단하여 작성하기
		//가능한 적은수의 동전을 사용
		//ex) 4170원 500원:8개 100원 :1개 50원:1개 10원:2개
		int[] coin = {500,100,50,10};
		int money = (new Random().nextInt(500)+1)*10;
		
		System.out.println("금액 : " + money);

		for(int i = 0; i < coin.length; i++) {
		     int requiredCoin = money / coin[i];
		     System.out.println( coin[i] + "원 : " + requiredCoin);
		     money = money % coin[i];
		}
		System.out.println("-----------9번----------");
		
		int[] lotto = new int[6];
		outer : for(int i = 0; i < lotto.length;){//나중을 위해 i++을 생략
					lotto[i] = new Random().nextInt(45) + 1;
					for(int j = 0; j < i; j++){
						if(lotto[i] == lotto[j]){
							continue outer;
						}					
					}
					System.out.print(lotto[i] + " ");
					i++;						
				}
	}
}
