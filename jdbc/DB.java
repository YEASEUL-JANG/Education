package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
		//static : 인스턴스를 만들지 않고 호출 가능, 자주쓰는 메소드는
		//static를 만들어 놓으면 좋다.
		//oracle(java계정) 접속 method
		public static Connection oraConn(){
		Connection conn=null;
		try {
		FileInputStream fis=
		new FileInputStream("c:\\driver\\oracle.prop");
		//key와 value를 세트로 저장
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("url");
		String id=prop.getProperty("id");
		String password=prop.getProperty("password");
		//DB에 접속
		conn=DriverManager.getConnection(url,id,password);
		} catch (Exception e) {
		e.printStackTrace();
		}
		return conn;
		}
		}
	

