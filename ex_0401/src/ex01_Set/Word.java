package ex01_Set;
import java.util.HashSet;
import java.util.Scanner;
public class Word {
	public static void main(String[] args) {
		//사용자가 입력한 문장에서 단어가 중복되었는지 검사하기
		//중복이 되어있으면 true 중복이 안되어있으면 false
		//예시
		//I love Java and I love coding
		//중복단어 있음
				
		 Scanner sc = new Scanner(System.in);
		 System.out.println("문장을 입력하세요:");
		 String sentence = sc.nextLine();
		 

		 boolean hasDuplicate = checkDuplicateWords(sentence);
		 System.out.println(hasDuplicate ? "중복 단어 있음" : "중복 단어 없음");
		 }

	private static boolean checkDuplicateWords(String sentence) {
	    HashSet<String> words = new HashSet<>();
	    String[] wordArray = sentence.split(" "); 
	    
	    for (int i = 0; i < wordArray.length; i++) {
	        if (words.contains(wordArray[i])) { 
	            return true; 
	        }
	        words.add(wordArray[i]);
	    }
	    
	    return false;
	}

}
