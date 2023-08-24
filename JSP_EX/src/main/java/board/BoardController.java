package board;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import board.dao.BoardDAO;
import board.dto.BoardCommentDTO;
import board.dto.BoardDTO;
import common.Constants;

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
			//파일 업로드 처리
			File uploadDir = new File(Constants.UPLOAD_PATH);
			if(!uploadDir.exists()) {//업로드 디렉토리가 존재하지 않으면
				uploadDir.mkdir();//디렉토리를 만듦
			}
			//request를 확장시킨 multipartRequest를 생성
			MultipartRequest multi = new MultipartRequest(request,Constants.UPLOAD_PATH,
					Constants.MAX_UPLOAD, "utf-8", new DefaultFileRenamePolicy());
			String writer = multi.getParameter("writer");
			String subject = multi.getParameter("subject");
			String content = multi.getParameter("content");
			String passwd = multi.getParameter("passwd");
			//클라이언트 ip주소 가져오기
			String ip = request.getRemoteAddr();
			if(ip.equalsIgnoreCase("0:0:0:0:0:0:0:1")) {
				InetAddress inetAddress = InetAddress.getLocalHost();
				ip=inetAddress.getHostAddress();
			}
			System.out.println("클라이언트 ip주소 : "+ip);
			String filename=" ";//공백 1개
			int filesize=0;
			try {
				//첨부파일처리
				Enumeration files = multi.getFileNames();
				//다음요소가 있으면
				while (files.hasMoreElements()) {
					String file1 = (String) files.nextElement();
					filename = multi.getFilesystemName(file1);
					File f1 = multi.getFile(file1);
					if(f1 != null) {
						filesize=(int)f1.length();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			BoardDTO dto = new BoardDTO();
			dto.setWriter(writer);
			dto.setSubject(subject);
			dto.setContent(content);
			dto.setPasswd(passwd);
			dto.setIp(ip);
			//파일첨부를 하지 않을 경우
			if(filename == null || filename.trim().equals("")) {
				filename = "-";
			}
			dto.setFilename(filename);
			dto.setFilesize(filesize);
			
			dao.insert(dto);
			String page = "/board_servlet/list.do";
			response.sendRedirect(contextPath+page);
		}else if(url.indexOf("download.do") != -1) {
			int num = Integer.parseInt(request.getParameter("num"));
			String filename = dao.getFileName(num);
			System.out.println("첨부파일이름 : "+filename);
			//업로드되었던 파일의 위치정보값을 path에 저장
			String path = Constants.UPLOAD_PATH+filename;
			byte b[] = new byte[4096];//바이트배열 생성
			//업로드 폴더에 저장된 파일을 읽기위한 스트림 생성
			FileInputStream fis = new FileInputStream(path);
			//mimeType : 파일의 종류를 분류(img, mp3, txt,,)
			String mimeType = getServletContext().getMimeType(path);
			//스트림방식의 파일다운로드 시 한글 파일명 관련 브라우저 헤더처리
			//octet-stream : 8비트로 된 일련의 데이터를 뜻하며 모든 종류의 이진데이터 처리가능
			if(mimeType == null) {
				mimeType = "application/octet-stream;charset=utf-8";
			}
			//서유럽언어 8859_1을 한글처리가능한 utf-8로 인코딩처리해야함.
			filename = new String(filename.getBytes("utf-8"),"8859_1");
			
			response.setHeader("Content-Disposition", "attachment;filename="+filename);
			
			//OutputStream 생성(다운은 서버에서 클라이언트에 써야하므로)
			ServletOutputStream out = response.getOutputStream();
			int numRead;
			while (true) {
				numRead = fis.read(b,0,b.length);//데이터읽음
				if(numRead == -1) break;//내용이 없으면 빠져나감
				out.write(b,0,numRead);//데이터 쓰기
			}
			//리소스 정리
			out.flush();
			out.close();
			fis.close();
			
			//다운로드 횟수 증가처리
			dao.plusDown(num);
		}else if(url.indexOf("view.do") != -1) {
			int num = Integer.parseInt(request.getParameter("num"));
			HttpSession session = request.getSession();
			//조회수 증가처리
			dao.plusReadCount(num,session);
			BoardDTO dto = dao.view(num);
			request.setAttribute("dto", dto);
			String page = "/board/view.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
		}else if(url.indexOf("commentList.do") != -1) {
			int num = Integer.parseInt(request.getParameter("num"));
			System.out.println("댓글을 위한 게시물 번호 : "+num);
			//댓글목록 리턴
			List<BoardCommentDTO> list = dao.commentList(num);
			request.setAttribute("list", list);
			String page = "/board/comment_list.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
		}else if(url.indexOf("comment_add.do") != -1) {
			BoardCommentDTO dto = new BoardCommentDTO();
			int board_num = Integer.parseInt(request.getParameter("board_num"));
			String writer = request.getParameter("writer");
			String content = request.getParameter("content");
			dto.setBoard_num(board_num);
			dto.setWriter(writer);
			dto.setContent(content);
			dao.commentAdd(dto);
		}else if(url.indexOf("reply.do") != -1) {
			int num = Integer.parseInt(request.getParameter("num"));
			BoardDTO dto = dao.view(num);
			dto.setContent("===게시물의 내용===\n"+dto.getContent());
			request.setAttribute("dto", dto);
			String page = "/board/reply.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
		}else if(url.indexOf("insertReply.do") != -1) {
			int num = Integer.parseInt(request.getParameter("num"));
			BoardDTO dto = dao.view(num);
			int ref = dto.getRef();//답변 그룹번호 
			int re_step=dto.getRe_step();//출력 순번처리
			int re_level = dto.getRe_level();//답변 단계처리 (댓글이면 2, 대댓글이면 3)
			String writer = request.getParameter("writer");
			String subject = request.getParameter("subject");
			String content = request.getParameter("content");
			String passwd = request.getParameter("passwd");
			dto.setWriter(writer);
			dto.setSubject(subject);
			dto.setContent(content);
			dto.setPasswd(passwd);
			dto.setRef(ref);
			dto.setRe_step(re_step);
			dto.setRe_level(re_level);
			//첨부파일 관련 정보(없지만)
			dto.setFilename("-");
			dto.setFilesize(0);
			dto.setDown(0);
			//답글 순서조정
			dao.updateStep(ref, re_step);
			//답글 쓰기
			dao.reply(dto);
			//목록이동
			String page = "/board_servlet/list.do";
			response.sendRedirect(contextPath+page);
			
		}else if(url.indexOf("pass_check.do") != -1) {
			int num = Integer.parseInt(request.getParameter("num"));
			String passwd = request.getParameter("passwd");
			//비밀번호 대조비교
			String result = dao.passwdCheck(num,passwd);
			String page="";
			if(result != null) {//값이 맞으면
				page="/board/edit.jsp";
				request.setAttribute("dto", dao.view(num));
				RequestDispatcher rd = request.getRequestDispatcher(page);
				rd.forward(request, response);
			}else {//비번이 틀리면
				page = contextPath+"/board_servlet/view.do?num="+num+"&message=error";
				response.sendRedirect(page);
			}
		}else if(url.indexOf("update.do") != -1) {
			//파일 업로드 처리
			File uploadDir = new File(Constants.UPLOAD_PATH);
			if(!uploadDir.exists()) {//업로드 디렉토리가 존재하지 않으면
				uploadDir.mkdir();//디렉토리를 만듦
			}
			//request를 확장시킨 multipartRequest를 생성
			MultipartRequest multi = new MultipartRequest(request,Constants.UPLOAD_PATH,
					Constants.MAX_UPLOAD, "utf-8", new DefaultFileRenamePolicy());
			int num = Integer.parseInt(multi.getParameter("num"));
			String writer = multi.getParameter("writer");
			String subject = multi.getParameter("subject");
			String content = multi.getParameter("content");
			String passwd = multi.getParameter("passwd");
			//클라이언트 ip주소 가져오기
			String ip = request.getRemoteAddr();
			String filename=" ";//공백한개
			int filesize= 0;
			try {
				//첨부파일처리
				Enumeration files = multi.getFileNames();
				//다음요소가 있으면
				while (files.hasMoreElements()) {
					String file1 = (String) files.nextElement();
					filename = multi.getFilesystemName(file1);
					File f1 = multi.getFile(file1);
					if(f1 != null) {
						filesize=(int)f1.length();//파일사이즈 저장
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			BoardDTO dto = new BoardDTO();
			dto.setNum(num);
			dto.setWriter(writer);
			dto.setSubject(subject);
			dto.setContent(content);
			dto.setPasswd(passwd);
			dto.setIp(ip);
			
			if(filename == null || filename.trim().equals("")) {
				//새로운 첨부파일이 없을 때(테이블의 기존 정보를 가져와야함)
				BoardDTO dto2 = dao.view(num);
				String fName=dto2.getFilename();
				int fSize=dto2.getFilesize();
				int fDown = dto2.getDown();
				dto.setFilename(fName);
				dto.setFilesize(fSize);
				dto.setDown(fDown);
			}else {//새로운 첨부파일이 있을 때
				dto.setFilename(filename);
				dto.setFilesize(filesize);
			}
			//첨부파일 삭제처리
			String fileDel = multi.getParameter("fileDel");
			//체크가 되어있으면(삭제), value없이 썼기 때문에 on이 디폴트값
			if(fileDel != null && fileDel.equals("on")) {
				String fileName = dao.getFileName(num);
				File f = new File(Constants.UPLOAD_PATH+fileName);
				f.delete();//파일삭제처리
				//첨부파일정보를 지움
				dto.setFilename("-");
				dto.setFilesize(0);
				dto.setDown(0);
			}
			//레코드 수정
			dao.update(dto);
			//페이지이동
			String page = "/board_servlet/list.do";
			response.sendRedirect(contextPath+page);
			
		}else if(url.indexOf("delete.do") != -1) {
			
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
