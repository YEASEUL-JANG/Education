package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import board.dto.BoardCommentDTO;
import board.dto.BoardDTO;
import sqlmap.MybatisManager;

public class BoardDAO {
	
	//게시물목록 리턴
	public List<BoardDTO> list(){
		List<BoardDTO> list = null;
		SqlSession session = null;
		//혹시 있을지 모를 예외발생 처리를 위해 try문을 쓰는게 좋음
		try {
			session=MybatisManager.getInstance().openSession();
			list=session.selectList("board.list");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		return list;
	}
	//게시물 저장
	public void insert(BoardDTO dto) {
		SqlSession session = null;
		try {
			session=MybatisManager.getInstance().openSession();
			session.insert("board.insert",dto);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		
	}
	//첨부파일 이름찾기
	public String getFileName(int num) {
		String filename = "";
		SqlSession session = null;
		try {
			session=MybatisManager.getInstance().openSession();
			filename = session.selectOne("board.getFileName",num);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		return filename;
	}
	//다운로드 횟수 증가
	public void plusDown(int num) {
		SqlSession session = null;
		try {
			session=MybatisManager.getInstance().openSession();
			session.update("board.plusDown",num);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		
	}
	//상세정보 뷰
	public BoardDTO view(int num) {
		BoardDTO dto = null;
		SqlSession session = null;
		try {
			session=MybatisManager.getInstance().openSession();
			dto = session.selectOne("board.view",num);
			//줄바꿈 처리
			String content = dto.getContent();
			content = content.replace("\n", "<br>");
			dto.setContent(content);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		return dto;
	}
	//조회수 증가처리
	public void plusReadCount(int num, HttpSession count_session) {
		SqlSession session = null;
		try {
			session=MybatisManager.getInstance().openSession();
			long read_time=0;
			if(count_session.getAttribute("read_time_"+num)!= null) {
				read_time=(long)count_session.getAttribute("read_time_"+num);
				
			}long current_time = System.currentTimeMillis();//현재시간
			if(current_time-read_time>5*1000) {//만약 하루 한번이면 24*60*60*1000
				session.update("board.plusReadCount",num);
				session.commit();
				//최근 열람시각 업데이트
				count_session.setAttribute("read_time_"+num, current_time);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
	}
	//댓글목록 구하기
	public List<BoardCommentDTO> commentList(int num) {
		List<BoardCommentDTO> list = null;
		SqlSession session = null;
		try {
			session=MybatisManager.getInstance().openSession();
			list = session.selectList("board.commentList",num);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		return list;
	}
	//댓글추가
	public void commentAdd(BoardCommentDTO dto) {
		SqlSession session = null;
		try {
			session=MybatisManager.getInstance().openSession();
			session.insert("board.commentAdd",dto);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
	}
	//답글 순서조정
	public void updateStep(int ref, int re_step) {
		SqlSession session = null;
		try {
			session=MybatisManager.getInstance().openSession();
			//두개 값을 하나로 묶어 보내려고 들어온 정보값을 dto에 저장한다.
			BoardDTO dto = new BoardDTO();
			dto.setRef(ref);
			dto.setRe_step(re_step);
			
			session.update("board.updateStep",dto);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		
	}
	//답글쓰기
	public void reply(BoardDTO dto) {
		SqlSession session = null;
		try {
			session=MybatisManager.getInstance().openSession();
			session.insert("board.reply",dto);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
	}
	//글수정 비번체크
	public String passwdCheck(int num, String passwd) {
		String result = null;
		SqlSession session = null;
		try {
			session=MybatisManager.getInstance().openSession();
			Map<String, Object> map = new HashMap<>();
			map.put("num", num);
			map.put("passwd", passwd);
			result = session.selectOne("board.pass_check",map);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		return result;
	}
	public void update(BoardDTO dto) {
		SqlSession session = null;
		try {
			session=MybatisManager.getInstance().openSession();
			session.selectOne("board.update",dto);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		
	}
	
}
