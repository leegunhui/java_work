package ex03_FileReader;

import java.io.FileReader;

public class Exam1 {
	public static void main(String[] args) {
		int upperchar = 0;
		int lowerchar = 0;
		FileReader fr = null;
		
		try {
			fr = new FileReader("D:\\full_stack_lgh\\test.txt");
			int code = 0;
				while((code=fr.read()) != -1) {
					if(code >= 'A' && code <= 'Z') {
						upperchar++;
					}
					
					else{
						lowerchar++;
					}
				}
				
				System.out.println("대문자 : " + upperchar);
				System.out.println("소문자 : " + lowerchar);
				fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
