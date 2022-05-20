package ch19;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncodeExam {

	public static void main(String[] args) {
		// url에는 한글, 특수문자 포함X 
		// url encoding(인코딩) => 한글, 특수문자를 url형식으로 변환시킴
		// url decoding(디코딩) => 인코딩된 문자열을 다시 처음내용으로 복원
		
		try {
			String str = "김길동";
			//URLEncoder.encode(인코딩할 문자열, "형식")
			System.out.println(URLEncoder.encode(str,"utf-8"));
			System.out.println(URLDecoder.decode("%EA%B9%80%EA%B8%B8%EB%8F%99","utf-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
