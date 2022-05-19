package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {

	public static void main(String[] args) {
		//앞의 세줄을 한줄로 써도 무방하다.
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열 한줄을 입력하세요 : ");
		try {
			String str = reader.readLine();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("[프로그램 종료]");

	}

}
