package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DateClient {

	public static void main(String[] args) throws Exception {
		//Socket("ip주소",포트번호)
		//localhost : 내 ip주소
		Socket s = new Socket("localhost",8010);
		//서버에서 accept()하면 통신 가능상태로 들어감.
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//서버에서 보낸 메시지를 받음
		String res = input.readLine();//한줄 씩 읽음
		System.out.println(res);
		s.close();
		System.exit(0);//프로그램 종료
	}

}
