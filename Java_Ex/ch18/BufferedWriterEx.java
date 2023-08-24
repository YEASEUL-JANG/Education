package ch18;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class BufferedWriterEx {

	public static void main(String[] args) {
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
