package ch18;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomFile2 {

	public static void main(String[] args) {
		try {
			RandomAccessFile ran = new RandomAccessFile("c:\\test\\rand2.txt", "rw");
			ran.seek(9);
			ran.write("park".getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일이 수정되었습니다.");
	}

}
