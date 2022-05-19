package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {

	public static void main(String[] args) {
		//복사본(OutputStream객체)<==[프로그램]<==(InputStream객체사용)원본
		String str="";
		BufferedReader reader=null;
		BufferedWriter writer=null;
		
		String file1 = "c:\\test\\abc.txt"; //원본파일
		String file2 = "c:\\test\\abcCopy.txt"; //복사본파일
		
		try {//원본파일과 복사본파일 생성
			reader = new BufferedReader(new FileReader(new File(file1)));
			writer = new BufferedWriter(new FileWriter(new File(file2)));
			
			while(true) {//복사작업
				str=reader.readLine();//한 라인을 읽음 \r\n 라인의 끝을 인식함
				// \r carriage return : 포인트가 앞줄로 다시 옴
				// \n new line : 줄바꿈
				if(str==null) break;
				writer.write(str+"\r\n");
				
			}
			System.out.println("파일복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {//파일리소스 해제
			try {
				if(reader != null) reader.close(); //리소스를 개별적으로 닫아주는게 좋음
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(writer != null) writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
