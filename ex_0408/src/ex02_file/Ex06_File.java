package ex02_file;

import java.io.File;

public class Ex06_File {
	public static void main(String[] args) {
		File f = new File("test.txt");
		
		try {
			if(f.createNewFile()) {
				System.out.println(f.getName());
			}
			else {
				System.out.println("파일 이미 존재");
			}
		} catch (Exception e) {
			System.out.println("파일생성중 오류발생");
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
