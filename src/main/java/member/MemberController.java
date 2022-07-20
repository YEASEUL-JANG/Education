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
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
