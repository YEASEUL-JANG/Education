package board;

import java.io.IOException;
import java.net.InetAddress;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

//@WebServlet("/BoardController") web에서 맵핑해서 필요없음
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//클라이언트에서 요청한 주소처리
		String url = request.getRequestURL().toString();
		System.out.println(url);
		//컨택스트패스
		String contextPath= request.getContextPath();
		BoardDAO dao = new BoardDAO();
		if(url.indexOf("list.do") != -1) {
			List<BoardDTO> list = dao.list();
			request.setAttribute("list", list);
			String page = "/board/list.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
		}else if(url.indexOf("insert.do") != -1) {
			String writer = request.getParameter("writer");
			String subject = request.getParameter("subject");
			String content = request.getParameter("content");
			String passwd = request.getParameter("passwd");
			String ip = request.getRemoteAddr();
			if(ip.equalsIgnoreCase("0:0:0:0:0:0:0:1")) {
				InetAddress inetAddress = InetAddress.getLocalHost();
				ip=inetAddress.getHostAddress();
			}
			System.out.println("클라이언트 ip주소 : "+ip);
			String filename=" ";//공백 1개
			int filesize=0;
			BoardDTO dto = new BoardDTO();
			dto.setWriter(writer);
			dto.setSubject(subject);
			dto.setContent(content);
			dto.setPasswd(passwd);
			dto.setIp(ip);
			dto.setFilename(filename);
			dto.setFilesize(filesize);
			
			dao.insert(dto);
			String page = "/board_servlet/list.do";
			response.sendRedirect(contextPath+page);
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
