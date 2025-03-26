package ex04_exam;

import java.util.Random;

public class Graph {

	public static void main(String[] args) {
	    int[] numbers = new int[100];  
        Random random = new Random();
        
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        System.out.println(); 

        
        int[] frequency = new int[10];
        for (int num : numbers) {
            frequency[num]++;
        }

        
        PrintGraph.print(frequency);

	}

}
