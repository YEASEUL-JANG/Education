package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
	public static void main(String[] args) {
	//프로그램 => 파일(출력스트림을 씀)
	//파일 => 불러올땐 인풋스트림
		OutputStream os = null;
		try {
			os= new FileOutputStream("c:\\test\\abc.txt");// ""안에서 c:\test\aa.txt 이면 \\로 써줘야 함.
			System.out.println("입력하세요 : ");
			while (true) {
				int ch=System.in.read();//1바이트로 읽음
				if(ch==13) break; //엔터키를 만나면 종료
				os.write(ch);//파일에 입력된 값이 저장됨.
			}
			System.out.println("파일이 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
