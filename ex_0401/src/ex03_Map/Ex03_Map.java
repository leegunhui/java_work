package ex03_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03_Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문장을 입력하세요:");
        String sentence = sc.nextLine();
        sc.close();

        checkDuplicateWords(sentence);
    }

    private static void checkDuplicateWords(String sentence) {
        
    	HashMap<String, Integer> wordCount = new HashMap<>();
        String[] wordArray = sentence.split(" "); 
        
        for (int i = 0; i < wordArray.length; i++) { 
            if (wordCount.containsKey(wordArray[i])) { 
                wordCount.put(wordArray[i], wordCount.get(wordArray[i]) + 1);
            } else {
                wordCount.put(wordArray[i], 1); 
            }
        }
        
        boolean hasDuplicate = false;
        for (String word : wordCount.keySet()) {
            System.out.println(word + " : " + wordCount.get(word) + "번");
            if (wordCount.get(word) > 1) {
                hasDuplicate = true;
            }
        }
        
        if (hasDuplicate) {
            System.out.println("중복 단어 있음");
        } else {
            System.out.println("중복 단어 없음");
        }
    }
}
