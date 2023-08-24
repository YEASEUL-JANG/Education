package ch18;

import java.io.RandomAccessFile;
import java.util.Random;

public class RandomFile {
public static void main(String[] args) {
	String str = null;
	try {//r: 읽기전용, w :쓰기전용, rw: 쓰기&읽기전용
		RandomAccessFile file= new RandomAccessFile("c:\\test\\rand.txt", "rw");// 읽기쓰기모드
		//getFilePointer() : 파일포인터(파일을 어디까지 읽었는지 가리킴)
		System.out.println(file.getFilePointer());//0
		file.seek(8);//8번째 인덱스부터 처리
		System.out.println(file.getFilePointer());//8
		file.write("HTML".getBytes());// 인덱스 8번위치에서 기존 내용을 덮어씀
		//포인터의 위치를 옮기는 메소드
		System.out.println(file.length());// 문자길이값 (한글은 3바이트 길이값)
		System.out.println(file.getFilePointer());
		while(file.getFilePointer()<file.length()) {
			//파일의 내용보다 파일 포인터 위치값이 적으면 반복
			str=file.readLine();
			//iso-8859-1,8859_1 : 서유럽 언어 인코딩 방식
			//ms949(2바이트)
			// utf-8 : 3바이트 , 초성중성종성을 각 1바이트씩( 한글처리 가능 )
			str=new String(str.getBytes("8859_1"),"utf-8");
		}
		System.out.println(file.length());
		System.out.println(file.getFilePointer());
		file.close();//파일저장
		System.out.println("파일이 저장되었습니다.");
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
