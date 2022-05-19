package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamEx2 {
	public static void main(String[] args) {
	InputStream is = System.in;//1바이트 처리시스템
	InputStreamReader isr = new InputStreamReader(is);// 2바이트 처리스트림
	//new InputStreamReader를 쓰면 안에 InputStream이 들어가야함.
	try {
		System.out.println("한글자를 입력하세요");
		int code = isr.read();
		System.out.println("code : "+code);
		char ch = (char)code;
		System.out.println("char : "+ch);
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
}
