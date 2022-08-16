package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

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
}
