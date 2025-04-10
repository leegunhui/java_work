package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//학생의 이름과 점수를 저장하는 프로그램
//이름과 점수를 FileOutputStream을 이용하여 scores.txt파일에
//저장하세요

//요구사항
//1. 사용자로부터 이름과 점수를 입력받는다.(Scanner)
//2. 입력받은 데이터를 "이름 : 점수 \n" 형식으로 문자열로 만들어
//파일에 쓴다. ex) "김철수 : 84"
//3. 이름에 exit를 입력하면 프로그램 종료
//4. 파일은 scores.txt로 저장되며, 기존 내용은 덮어씁니다.
//5. "이름 : 점수" 형식의 문자열의 각 문자의 char값을 +3을 해 암호화한다.
// 입력 : John : 85\n
// 저장 : Mrkq#=;8
// 출력 : John : 85

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("D:\\full_stack_lhj\\3.JAVA\\scores.txt");
			
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
				String result = "";
				for(int i = 0; i < line.length(); i++) {
					result +=(char)(line.charAt(i)+3);
				}
				
				fos.write(result.getBytes());
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
		
		//복호화를 해서 콘솔에 출력하기
		File f = new File("D:\\full_stack_lgh\\scores.txt");
		FileInputStream fis = null;
		byte[] buffer = new byte[(int)f.length()];
		try {
			fis = new FileInputStream(f);
			fis.read(buffer);
			String s = new String(buffer);
			String result = "";
			for(int i = 0; i <s.length(); i++) {
				result +=(char)(s.charAt(i)-3);
			}
			System.out.println("복호화 결과");
			System.out.println(result);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
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