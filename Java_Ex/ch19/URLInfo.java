package ch19;

import java.net.URL;

public class URLInfo {

	public static void main(String[] args) {
		try {//URL : 인터넷주소
			URL url = new URL("https://www.seoulstore.com/categories/1017/recommend/desc");
			System.out.println("프로토콜 : "+url.getProtocol());
			System.out.println("포트 : "+url.getPort());
			System.out.println("호스트 : "+url.getHost());
			System.out.println("파일 : "+url.getFile());
			System.out.println("기타 : "+url.toExternalForm());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
