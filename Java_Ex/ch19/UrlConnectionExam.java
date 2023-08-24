package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlConnectionExam {

	public static void main(String[] args) {
	try {
		URL url = new URL("http://google.com");
		//HttpURLConnection : 접속정보
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		if(conn != null) {//=접속이 되어있으면
			conn.setConnectTimeout(3000);//타임아웃 시간설정
			StringBuilder sb = new StringBuilder();
			//정상적으로 처리된 경우
			//HTTP STATUS CODE(상태코드)
			if(conn.getResponseCode()==HttpURLConnection.HTTP_OK) {
				//스트림 활용해서 HTML SOURCE CODE 를 읽어옴
				//입력버퍼를 생성
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
				while(true) {
					String line= br.readLine();//한라인을 읽음
					if(line ==null) break;
					sb.append(line+"\r\n");//줄바꿈문자 추가
				}
				br.close();
			}
			conn.disconnect();//http연결 종료
			System.out.println(sb);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
