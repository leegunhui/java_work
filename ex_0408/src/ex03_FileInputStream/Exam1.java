package ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;

public class Exam1 {
	public static void main(String[] args) {
		//file.txt를 만들고
		//문장을 입력하고 저장한다
		//FileInputStream으로 읽어온뒤 회문인지 아닌지 검증하세요
		String path = "D:\\full_stack_lgh\\file.txt";

		File f = new File(path);
		byte[] read = new byte[(int)f.length()];

		FileInputStream fis = null;
		if(f.exists()){
			try {

				fis = new FileInputStream(f);
				fis.read(read);
				
				String res = new String(read);
				String res2 = null;
				
				for(int i = res.length()-1; i>=0; i--) {
					res2 += res.charAt(i);
				}
				if(res.equals(res2)) {
					System.out.println(res +"회문입니다");
				}
				else {
					System.out.println(res + "회문이 아닙니다");
				}
				fis.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
