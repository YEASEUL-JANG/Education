package jdbc.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.DB;

public class MemberInsert {
	public static void main(String[] args) throws Exception {
		Connection conn=null;
		PreparedStatement pstmt=null;
		Statement stmt=null;
		try {
		//Class.forName(driver);//생략가능
		conn=DB.oraConn();//DB클래스에 만들어놓은 oraConn()으로도 접속가능
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디:");
		String userid=scan.next();
		System.out.print("비밀번호:");
		String passwd=scan.next();
		System.out.print("이름:");
		String name=scan.next();
		scan.close();
		String sql="insert into member (userid,passwd,name) values "+"(?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userid);
		pstmt.setString(2, passwd);
		pstmt.setString(3, name);
		pstmt.executeUpdate(); //insert, delete, update문에서 사용
		System.out.println("저장되었습니다.");
		} catch (Exception e) {
		e.printStackTrace();
		} finally {
		try {
		if(stmt!=null) stmt.close();
		} catch (Exception e2) {
		e2.printStackTrace();
		}
		try {
		if(conn!=null) conn.close();
		} catch (Exception e2) {
		e2.printStackTrace();
		}
	}
	}
	}


