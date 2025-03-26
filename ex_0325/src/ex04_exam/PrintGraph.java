package ex04_exam;

public class PrintGraph {
	 public static void print(int[] frequency) {
	       
	        for (int i = 0; i < frequency.length; i++) {
	            System.out.print(i + "의 갯수 : ");
	            for (int j = 0; j < frequency[i]; j++) {
	                System.out.print("#");  
	            }
	            System.out.println(" " + frequency[i]);
	        }
	    }

}
