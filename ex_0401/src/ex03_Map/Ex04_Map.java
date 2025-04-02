package ex03_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex04_Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Map<String, List<Integer>> studentMap = new HashMap<>();
        
        for (int i = 0; i < 3; i++) {
            System.out.print("학생 이름: ");
            String name = sc.next();
            
            System.out.print("국어 점수: ");
            int kor = sc.nextInt();
            
            System.out.print("영어 점수: ");
            int eng = sc.nextInt();
            
            System.out.print("수학 점수: ");
            int math = sc.nextInt();

            List<Integer> scores = Arrays.asList(kor,eng,math);
            studentMap.put(name, scores);
        }
        
        //학생별 평균
        //keySet()-> HashMap에 들어있는 모든 key를 set으로 만들어서 반환
        System.out.println("학생별 평균 점수 : ");
        for (String name : studentMap.keySet()) {
            List<Integer> scores = studentMap.get(name);
            
            double average = (scores.get(0) + scores.get(1) + scores.get(2)) / 3.0;
            
            System.out.printf("%s 평균 점수: %f\n", name, average);
        }

        
        
    }
}
