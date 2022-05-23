package ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//udp방식은 비연결성(단방향 전송)
//tcp방식 - 연결성(서버와 클라이언트(들)가 서로 연결된 상태에서 데이터 송수신
public class UDPEchoServer {
public UDPEchoServer(int port) {
	try {
		DatagramSocket ds = new DatagramSocket(port);
		while(true) {
			//udp방식은 데이터를 바이트 배열로 전송함. String을 바로 보낼 수 없음
			//(참고 : 바이트 배열의 태대크기는 65508)
			byte buffer[] =  new byte[512];
			//udp방식의 통신은 데이터를 패킷(데이터 조각)으로 만들어 전송
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
			System.out.println("ready");
			//클라이언트가 보낸 메시지를 수신. 
			//소켓을 통해 수신된 클라이언트의 메시지를 DatagramPacket에 저장
			ds.receive(dp);
			//클라이언트에서 보낸 메시지(바이트배열)를 스트링으로 변환
			String str = new String(dp.getData());
			System.out.println("클라이언트에서 보낸 메시지 : "+str);
			
			InetAddress ia = dp.getAddress();
			port = dp.getPort();
			System.out.println("client ip : "+ia+", client port : "+port);
			//클라이언트에게 전송할 패킷객체 생성
			//바이트배열, 바이트배열크기, ip주소, 포트번호
			dp = new DatagramPacket(dp.getData(), dp.getData().length, ia,port);
			ds.send(dp);//클라이언트에게 자료전송
			ds.close(); //소텟 닫기
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void main(String[] args) throws Exception{
	new UDPEchoServer(3000);//서버측 포트번호
}
}
