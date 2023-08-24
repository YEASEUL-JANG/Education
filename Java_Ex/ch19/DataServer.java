package ch19;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataServer {
//서버용 프로그램
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8010);
		System.out.println("서비스가 시작되었습니다.");
		while (true) {
			//클라이언트용 소켓
			Socket socket = ss.accept();//클라이언트가 접속할때까지 대기상태로 계속 감지중.
			//접속하면 소켓연결을 해줌(논리적연결)
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
			String srt = sdf.format(new Date());
			out.print(srt);//클라이언트에게 데이터를 전송함.
			socket.close();
		}
	}
}
