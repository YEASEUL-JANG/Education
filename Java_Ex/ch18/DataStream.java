package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStream {

	public static void main(String[] args) {
		//텍스트파일이 아닌 binaryfile(이진파일)로 저장
		//윈도우 : \, 리눅스 : /(드라이브개념이 아닌 디렉토리)
		try {
			DataOutputStream dataout = new DataOutputStream
					(new FileOutputStream("c:\\test\\test.dat"));
			dataout.writeInt(123);//숫자형식의 자료를 파일에 저장
			dataout.writeChar('A');//문자형식의 자료를 파일에 저장
			dataout.writeDouble(3.5);//실수형식
			dataout.close();//스트림 닫기(파일 완성)
			System.out.println("저장되었습니다.");
			
			//이진파일을 읽기위한 객체
			DataInputStream datain = new DataInputStream(new FileInputStream("c:\\test\\test.dat"));
			//이진파일로 저장된 데이터를 콘솔화면에 처리
			System.out.println(datain.readInt());//숫자값을 읽음
			System.out.println(datain.readChar());//숫자값을 읽음
			System.out.println(datain.readDouble());//숫자값을 읽음
			datain.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
