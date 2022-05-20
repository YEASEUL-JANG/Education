package ch18;

import java.io.IOException;

//스트림 : 데이터의 논리적인 통로
//1바이트 단위로 처리(8비트)
//프로그램 기준
//InputStream(입력스트림)
//OutputStream(출력스트림)
public class InputStreamExam {
	public static void main(String[] args) {
		int var=0;
		//파일 입출력 프로그램은 try-catch문 안에서 필수 작성(네트워크, db등도 마찬가지)
		try {
			System.out.println("내용을 입력하세요 : ");
			var = System.in.read(); //키보드에서 1바이트를 읽음(따라서 한글처리안됨(한글 =2byte))
			while(var != 13) {//13인 엔터키를 입력할때까지 반복
				System.out.println((char)var);
				//모든 문자에는 고유한 숫자코드가 있음. int형 var를 문자형var로 형변환해서 출력
				var = System.in.read();
				
			}
			
		} catch (IOException e) {//입출력관련 예외처리
			e.printStackTrace();
		}
	}
}
