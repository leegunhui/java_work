package ex01_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam2 {
	public static void main(String[] args) {
		List<String> scores = Arrays.asList(
			    "Alice:Math:85", "Alice:English:78",
			    "Bob:Math:90", "Bob:English:92", "Bob:Science:88",
			    "Charlie:Math:70", "Charlie:English:60"
			);
		
		Map<String, Student> studentMap = new HashMap<>();
		
		for (String record : scores) {
            String[] parts = record.split(":"); 
            String name = parts[0];
            int score = Integer.parseInt(parts[2]);
            
            studentMap.putIfAbsent(name, new Student(name));
            studentMap.get(name).addScore(score);
        }
		
		Student BestStudent = null;
        
        for (Student student : studentMap.values()) {
            if (BestStudent == null || student.getAverage() > BestStudent.getAverage()) {
            	BestStudent = student;
            }
        }
        
        if (BestStudent != null) {
            System.out.println("가장 높은 평균 점수를 가진 학생: " + BestStudent.getName() + " (평균: " + BestStudent.getAverage() + ")");
        }
    }
}
