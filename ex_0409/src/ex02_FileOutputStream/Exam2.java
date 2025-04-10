package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//학생의 이름과 점수를 입력받아 scores.txt저장
//이어쓰기를 한다.
//마지막에는 파일 내용을 읽어 콘솔에 출력하는 기능 구현하기
//입력:
//이름: 홍길동
//점수: 90
//이름: 김영희
//점수: 85
//이름: exit
//
//출력:
//현재 저장된 점수 목록:
//홍길동 : 90
//김영희 : 85
public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try {
			fos = new FileOutputStream("D:\\full_stack_lgh\\3.JAVA\\scores.txt",true);
			
			while(true) {
				System.out.print("이름 : ");
				String name = sc.nextLine();
				//대문자 무시하고 값을 검증
				if(name.equalsIgnoreCase("exit")) {
					break;
				}
				
				System.out.print("점수 : ");
				String score = sc.nextLine();
				
				String line = name + " : " + score +"\n";
				//John : 85
//				String result = "";
//				for(int i = 0; i < line.length(); i++) {
//					result +=(char)(line.charAt(i)+3);
//				}
//				
				fos.write(line.getBytes());
				System.out.println("파일 저장 완료");
			}
					
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		//파일 내용 읽어오기
		try {
			File f = new File("D:\\full_stack_lhj\\3.JAVA\\scores.txt");
			fis = new FileInputStream(f);
			
			byte[] buffer = new byte[(int)f.length()];
			fis.read(buffer);
			String content = new String(buffer,"UTF-8");
			System.out.println(content);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
	}
}





