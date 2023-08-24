package ch18;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {

	public static void main(String[] args){
		//콘솔창에 별도의 스트림값을 출력하기 위해 System클래스의 out이라는 static멤버에
		//PrintStream 객체참조값이 들어있는점을 활용.
		PrintStream ps=System.out;
		OutputStream os=ps;//PrintStream객체는 부모타임인 아웃풋스트림으로 받아 처리해야함.
		//아웃풋스트림도 1바이트처리 - 한글지원안됨
		try {
			os.write(97);//a
			os.write(98);//b
			os.write(99);//c
			os.flush(); //플러쉬메소드를 써야 출력까지 완료.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
