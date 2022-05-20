package ch19;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.util.Enumeration;

public class MyNetProgram {

	public static void main(String[] args) {
		try {
			Enumeration<NetworkInterface> enu = NetworkInterface.getNetworkInterfaces();
			System.out.println("1) 나의 랜카드 정보 : ");
			while (enu.hasMoreElements()) {
				NetworkInterface net =  enu.nextElement();
				System.out.println(net);
				}
				System.out.println("2) 네이버의 서버들 : ");
				InetAddress[] address = InetAddress.getAllByName("naver.com");
				for(int i=0;i<address.length;i++) {
				System.out.println(address[i]);
				}
				
				InetAddress add = InetAddress.getByName("naver.com");
				System.out.println("3) 네이버의 호스트이름 : "+add.getHostName());
				System.out.println("메인 IP번호 : "+add.getHostAddress());
				
				System.out.println("4) 나의 사용 port번호들 : ");
				ServerSocket socket = null;
				for(int i=0;i<65535;i++) {
					try {
						socket = new ServerSocket(i);
						socket.close();
					} catch (Exception e) {
						System.out.println(i+"번 포트는 사용중입니다.");
					}
					}//end for
				}//end try
				catch (Exception e) {
					e.printStackTrace();
				}
		}// end main
}
	


