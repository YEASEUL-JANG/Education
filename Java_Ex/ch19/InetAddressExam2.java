package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam2 {

	public static void main(String[] args) {
	try {
		InetAddress[] address = InetAddress.getAllByName("naver.com");
		//getAllByName: 여러 ip주소를 가져옴 -> 배열로 저장
		//서비스하는 서버가 문제가 생길 시 다른 서버가 돌아감.
		for(int i=0;i<address.length;i++) {
		System.out.println(address[i]);
		}
	} catch (UnknownHostException e) {//알려지지 않은 호스트(주소)
		e.printStackTrace();
	}
	

	}

}
