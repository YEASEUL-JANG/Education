package member;

import java.awt.geom.Ellipse2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.DB;

public class MemberDAO {
	public List<MemberDTO> memberList() {
		List<MemberDTO> items = new ArrayList<>();
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn = DB.getConn();
			String sql = "select * from member order by name";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setUserid(rs.getString("userid"));
				dto.setPasswd(rs.getString("passwd"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setHp(rs.getString("hp"));
				dto.setJoin_date(rs.getDate("join_date"));
				dto.setZipcode(rs.getString("zipcode"));
				dto.setAddress1(rs.getString("address1"));
				dto.setAddress2(rs.getString("address2"));
				items.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}try {
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}try {
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return items;
	}//memberList()
	
	public void insert(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		//ResultSet rs=null; select문 할때만 필요하므로 insert할땐 필요없음
		
		try {
			conn = DB.getConn();
			StringBuilder sql = new StringBuilder();
			sql.append("insert into member ");
			sql.append(" (userid,passwd,name,email,hp,zipcode,address1,address2) values ");
			sql.append(" (?,?,?,?,?,?,?,?)");
			pstmt = conn.prepareStatement(sql.toString()); //스트링빌더는 toString으로 보내야함
			pstmt.setString(1, dto.getUserid());
			pstmt.setString(2, dto.getPasswd());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getHp());
			pstmt.setString(6, dto.getZipcode());
			pstmt.setString(7, dto.getAddress1());
			pstmt.setString(8, dto.getAddress2());
			pstmt.executeUpdate(); //executeQuery는 셀렉트문 전용 나머지 dml문은 업데이트
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}try {
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}//insert()
	public MemberDTO memberDetail(String userid){
		MemberDTO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DB.getConn();
			String sql = "select * from member where userid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new MemberDTO();
				dto.setUserid(userid);
				dto.setPasswd(rs.getString("passwd"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setHp(rs.getString("hp"));
				dto.setJoin_date(rs.getDate("join_date"));
				dto.setZipcode(rs.getString("zipcode"));
				dto.setAddress1(rs.getString("address1"));
				dto.setAddress2(rs.getString("address2"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}try {
				if(pstmt != null) pstmt.close();
			} catch(Exception e2) {
				e2.printStackTrace();
		}try {
			if(conn != null) conn.close();
		} catch(Exception e2) {
			e2.printStackTrace();
		}
		return dto;
		}
	}//memberDetail()

	public void update(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn = DB.getConn();
			StringBuilder sql = new StringBuilder();
			sql.append("update member set ");
			sql.append(" passwd=?, name=?, email=?, hp=?, zipcode=?, address1=?, address2=?");
			sql.append(" where userid=?");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getPasswd() );
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getHp());
			pstmt.setString(5, dto.getZipcode());
			pstmt.setString(6, dto.getAddress1());
			pstmt.setString(7, dto.getAddress2());
			pstmt.setString(8, dto.getUserid());
			pstmt.executeUpdate(); //db 저장~
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}try {
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}//update()

	public void delete(String userid) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn = DB.getConn();
			String sql = "delete from member where userid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}try {
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}//delete()
}
