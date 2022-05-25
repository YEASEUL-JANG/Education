package jdbc.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbc.DB;
//DAO (Data Access Object)
public class MemberDAO {
	public static int memberDelete(String userid) {
		Connection conn = null; //접속할 객체
		PreparedStatement pstmt = null;
		int rows = 0; //리턴해줄 값
		try {
		conn = DB.oraConn();
		String sql = "delete from member where userid=?";
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, userid);//1번 문장의 ?에 userid가 들어감.
		rows = pstmt.executeUpdate();//delete문도 executeupdate문을 씀.
		} catch (Exception e) {
		e.printStackTrace();
		} finally {
		try {
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
		} catch (Exception e2) {
		e2.printStackTrace();
		}
		}
		return rows;
		}
}
