package ex04_FileWriter;

import java.io.FileWriter;

public class Ex01_FileWriter {
	public static void main(String[] args) {
		FileWriter fw = null;

		try{
		fw = new FileWriter("D:\\full_stack_lgh\\fileWriter예제.txt");
		
		
		fw.write("첫번째 줄 작성합니다 hehehe");
		fw.write("\n");
		fw.write("두번째 줄도 문제없지 hehehe");

		fw.close();

		} catch ( Exception e) {
			e.printStackTrace();
		}
	}
}

