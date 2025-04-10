package ex02_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex02_CopyTest {
	public static void main(String[] args) {
		//read()와 write()를 이용하여 복사
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis =new FileInputStream("D:\\full_stack_lgh\\wall.jpg");
			fos =new FileOutputStream("D:\\full_stack_lgh\\wall_copy.jpg");
			
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
			//read()를 통해 읽는다
			while((read = fis.read()) != -1) {
				//읽어온 내용을 write()로 쓴다
				fos.write(read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			//종료시간 - 시작시간 = 총 소요시간
			long time = (end - start)/1000;
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				//역순으로 닫아야한다.
				if(fos != null) {
					fos.close();
				}
				
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
