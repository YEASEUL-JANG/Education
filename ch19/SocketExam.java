package ch19;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketExam {

	public static void main(String[] args) {
		//서버쪽 소켓 : 서버에서 서비스를 위한 목적으로 만든 소켓
		ServerSocket socket = null;//서버용소켓
		//Socket cSocket = null; 클라이언트용 소켓
		//포트번호 : 0~65535 내에 배정이 가능하고 중복되면 안됨.
		// 한 포트당 한개의 서비스가 원칙.
		//well Known port number : 자주사용되는 포트번호
		// -> 80: 웹서비스, 21 : ftp서비스, 445 : 파일공유, 3389 : 원격접속...
		
		for(int i=0;i<65535;i++) {
			try {
				socket = new ServerSocket(i);
				socket.close();//소켓서비스 종료
			} catch (Exception e) {
				System.out.println(i+"번 포트는 사용중입니다.");
			}
		}
		
		

	}

}
