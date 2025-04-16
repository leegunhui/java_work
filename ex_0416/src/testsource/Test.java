package testsource;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Map<String, List<Integer>> scores = new HashMap<>();

		scores.put("Alice", Arrays.asList(90, 85, 88));   
		scores.put("Bob", Arrays.asList(70, 75, 78)); 
		scores.put("Charlie", Arrays.asList(95, 92, 91));

		for (Map.Entry<String, List<Integer>> entry : scores.entrySet()) {
			String name = entry.getKey();
			List<Integer> scoreList = entry.getValue();

			double avg = 0;
			for (int score : scoreList) {
				avg += score;
			}
			avg /= scoreList.size();

			if (avg >= 80) {
				System.out.printf("%s: %.1f\n", name, avg);
			}
		}
	}
}

