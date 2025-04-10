package ex01_bufferedinput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex02_ReadImage {
	public static void main(String[] args) {
		//byte배열을 사용해서 이미지를 읽어왔을 때
		//속도가 굉장히 빠르다는것을 알 수 있었다
		FileInputStream readFile = null;
		FileInputStream bisReadFile = null;
		BufferedInputStream bis = null;

		try {
			System.out.println("보조스트림으로 읽기");
			readFile = new FileInputStream("D:\\full_stack_lgh\\wall.jpg");
			//버퍼라는 공간을 만들어주고 read()를 통해서 읽어온 데이터를
			//버퍼라는 공간에 저장을 해주고, 버퍼가 다 차게되면 내보낸다.
			bis = new BufferedInputStream(readFile);
			
			//시작시간 측정
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			//이미지 읽는속도를 측정하려는것이기 때문에
			//읽기만할것
			while(bis.read() != -1) {

			}
			//종료시간 측정
			long end = System.currentTimeMillis();
			double result = (double)(end - start) / 1000;

			System.out.println("소요 시간 : " + result + "초");
			System.out.println("보조 스트림으로 읽기 종료");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (bisReadFile != null) {
					bisReadFile.close();
				}
				if(readFile != null) {
					readFile.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
