package ch18;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class BufferedWriterEx {

	public static void main(String[] args) {
//	PrintStream ps = System.out;
//	OutputStream os = ps;
//	OutputStreamWriter osw = new OutputStreamWriter(os);
//	BufferedWriter bw = new BufferedWriter(osw);
	//위의 네줄을 아래 한줄로 사용가능
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	try {
		bw.write("환영합니다.\n");
		bw.write("Java");
		bw.newLine();//줄바꿈처리
		bw.write("World");
		bw.flush();
	} catch (Exception e) {
		e.printStackTrace();
	}

	}

}
