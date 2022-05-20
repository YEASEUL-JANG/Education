package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy2 {

	public static void main(String[] args) {
		FileOutputStream fo = null;
		String str="";
		BufferedReader reader=null;
		BufferedWriter writer=null;
		try {
			fo= new FileOutputStream("c:\\test\\abc.txt");
			System.out.println("입력하세요 : ");
			while(true) {
			int in = System.in.read();
			if(in==13) break;
			fo.write(in);
			}
			System.out.println("저장이 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			reader = new BufferedReader(new FileReader(new File("c:\\test\\abc.txt")));
			writer = new BufferedWriter(new FileWriter(new File("c:\\test\\abcCopy.txt")));
			
			while(true) {
				str =reader.readLine();
				if(str==null) break;
				writer.write(str+"\r\n");
			}
			System.out.println("파일복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {//리소스처리
		try {
			if(reader != null) reader.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}try {
			if(writer !=null) writer.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		}//end finally
	}//end main
}
