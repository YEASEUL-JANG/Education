package member;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member_servlet/*")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//사용자 요청 주소
		String uri = request.getRequestURI();
		//contextPath
		String context = request.getContextPath();
		MemberDAO dao = new MemberDAO();
		
		if(uri.indexOf("list.do") != -1) {
			Map<String,Object> map = new HashMap<>();
			List<MemberDTO> list = dao.memberList();
			map.put("list",list);//최종적으로 맵에 저장
			map.put("count", list.size());//레코드의 갯수(회원수)
			
			//웹영역에 저장
			request.setAttribute("map", map);
			
			//포워딩
			String page = "/ch06/member_list.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
		}else if(uri.indexOf("join.do") != -1) {
			String userid = request.getParameter("userid");//값 받아오기
			String name = request.getParameter("name");
			String passwd = request.getParameter("passwd");
			String email = request.getParameter("email");
			String hp = request.getParameter("hp");
			String zipcode = request.getParameter("zipcode");
			String address1 = request.getParameter("address1");
			String address2 = request.getParameter("address2");
			
			MemberDTO dto = new MemberDTO();
			dto.setUserid(userid); //dto의 setter를 통한 자료 저장
			dto.setHp(hp);
			dto.setPasswd(passwd);
			dto.setName(name);
			dto.setEmail(email);
			dto.setZipcode(zipcode);
			dto.setAddress1(address1);
			dto.setAddress2(address2);
			dao.insert(dto);
			
		}else if(uri.indexOf("view.do") != -1) {
			String userid = request.getParameter("userid");
			MemberDTO dto = dao.memberDetail(userid);
			//웹영역에 저장(request)
			request.setAttribute("dto", dto);
			
			String page = "/ch06/member_view.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
		}else if(uri.indexOf("update.do") != -1) {
			String userid = request.getParameter("userid");//값 받아오기
			String name = request.getParameter("name");
			String passwd = request.getParameter("passwd");
			String email = request.getParameter("email");
			String hp = request.getParameter("hp");
			String zipcode = request.getParameter("zipcode");
			String address1 = request.getParameter("address1");
			String address2 = request.getParameter("address2");
			MemberDTO dto = new MemberDTO();
			dto.setUserid(userid); //dto의 setter를 통한 자료 저장
			dto.setHp(hp);
			dto.setPasswd(passwd);
			dto.setName(name);
			dto.setEmail(email);
			dto.setZipcode(zipcode);
			dto.setAddress1(address1);
			dto.setAddress2(address2);
			dao.update(dto);
			//페이지 이동
			response.sendRedirect(context+"/ch06/member.jsp");//컨텍스트 값 같이 입력되야함.
		}else if(uri.indexOf("delete.do") != -1) {
			String userid = request.getParameter("userid");//값 받아오기
			//레코드 삭제처리
			dao.delete(userid);
			//페이지 이동
			response.sendRedirect(context+"/ch06/member.jsp");
			
		}else if(uri.indexOf("login.do") != -1) {
			String userid = request.getParameter("userid");
			String passwd = request.getParameter("passwd");
			System.out.println("아이디 : "+userid+", 패스워드 : "+passwd);
			
			MemberDTO dto = new MemberDTO();
			dto.setUserid(userid);
			dto.setPasswd(passwd);
			String result = dao.loginCheck(dto);
			System.out.println(result);
			request.setAttribute("result", result);
			String page = "/ch06/login_result.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
			
			
		}else if(uri.indexOf("join_oracle_secret.do") != -1) {

			String userid = request.getParameter("userid");//값 받아오기
			String name = request.getParameter("name");
			String passwd = request.getParameter("passwd");
			String email = request.getParameter("email");
			String hp = request.getParameter("hp");
			String zipcode = request.getParameter("zipcode");
			String address1 = request.getParameter("address1");
			String address2 = request.getParameter("address2");
			
			MemberDTO dto = new MemberDTO();
			dto.setUserid(userid); //dto의 setter를 통한 자료 저장
			dto.setHp(hp);
			dto.setPasswd(passwd);
			dto.setName(name);
			dto.setEmail(email);
			dto.setZipcode(zipcode);
			dto.setAddress1(address1);
			dto.setAddress2(address2);
			dao.insertCrypt(dto);
			
		}else if(uri.indexOf("login_oracle_secret.do") != -1) {

			String userid = request.getParameter("userid");
			String passwd = request.getParameter("passwd");
			System.out.println("아이디 : "+userid+", 패스워드 : "+passwd);
			
			MemberDTO dto = new MemberDTO();
			dto.setUserid(userid);
			dto.setPasswd(passwd);
			String result = dao.loginCheckOracle(dto);
			System.out.println(result);
			request.setAttribute("result", result);
			String page = "/ch06/login_result.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
		}else if(uri.indexOf("join_sha.do") != -1) {
			String userid = request.getParameter("userid");//값 받아오기
			String name = request.getParameter("name");
			String passwd = request.getParameter("passwd");
			String email = request.getParameter("email");
			String hp = request.getParameter("hp");
			String zipcode = request.getParameter("zipcode");
			String address1 = request.getParameter("address1");
			String address2 = request.getParameter("address2");
			
			MemberDTO dto = new MemberDTO();
			dto.setUserid(userid); //dto의 setter를 통한 자료 저장
			dto.setHp(hp);
			dto.setPasswd(passwd);
			dto.setName(name);
			dto.setEmail(email);
			dto.setZipcode(zipcode);
			dto.setAddress1(address1);
			dto.setAddress2(address2);
			dao.insertSha256(dto);
		}else if(uri.indexOf("login_sha.do") != -1) {

			String userid = request.getParameter("userid");
			String passwd = request.getParameter("passwd");
			System.out.println("아이디 : "+userid+", 패스워드 : "+passwd);
			
			MemberDTO dto = new MemberDTO();
			dto.setUserid(userid);
			dto.setPasswd(passwd);
			String result = dao.loginCheckSha256(dto);
			System.out.println(result);
			request.setAttribute("result", result);
			String page = "/ch06/login_result.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
		}else if(uri.indexOf("join_bcrypt.do") != -1) {
			String userid = request.getParameter("userid");//값 받아오기
			String name = request.getParameter("name");
			String passwd = request.getParameter("passwd");
			String email = request.getParameter("email");
			String hp = request.getParameter("hp");
			String zipcode = request.getParameter("zipcode");
			String address1 = request.getParameter("address1");
			String address2 = request.getParameter("address2");
			
			MemberDTO dto = new MemberDTO();
			dto.setUserid(userid); //dto의 setter를 통한 자료 저장
			dto.setHp(hp);
			dto.setPasswd(passwd);
			dto.setName(name);
			dto.setEmail(email);
			dto.setZipcode(zipcode);
			dto.setAddress1(address1);
			dto.setAddress2(address2);
			dao.insertBcrypt(dto);
		}else if(uri.indexOf("login_bcrypt.do") != -1) {
			String userid = request.getParameter("userid");
			String passwd = request.getParameter("passwd");
			System.out.println("아이디 : "+userid+", 패스워드 : "+passwd);
			
			MemberDTO dto = new MemberDTO();
			dto.setUserid(userid);
			dto.setPasswd(passwd);
			String result = dao.loginCheckBcrypt(dto);
			System.out.println(result);
			request.setAttribute("result", result);
			String page = "/ch06/login_result.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
