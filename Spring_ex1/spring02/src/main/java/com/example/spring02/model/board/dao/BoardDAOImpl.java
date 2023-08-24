package com.example.spring02.model.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.spring02.model.board.dto.BoardDTO;
@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	SqlSession sqlSession;
	
	@Override
	public void deleteFile(String fullName) {
		sqlSession.delete("board.deleteFile",fullName);
	}

	@Override
	public List<String> getAttach(int bno) {
		return sqlSession.selectList("board.getAttach",bno);
	}

	@Override
	public void addAttach(String fullName) {
		sqlSession.insert("board.addAttach",fullName);
	}

	@Override
	public void updateAttach(String fullName, int bno) {
		Map<String,Object> map=new HashMap<>();
		map.put("fullName", fullName);
		map.put("bno", bno);
		sqlSession.insert("board.updateAttach",map);
	}

	@Override
	public void create(BoardDTO dto) throws Exception {
		sqlSession.insert("board.insert",dto);
	}

	@Override
	public void update(BoardDTO dto) throws Exception {
		sqlSession.update("board.update",dto);
	}

	@Override
	public void delete(int bno) throws Exception {
		sqlSession.delete("board.delete",bno);
	}

	@Override
	public List<BoardDTO> listAll(int start, int end, String search_option, String keyword) throws Exception {
		Map<String,Object> map = new HashMap<>();
		map.put("start", start);
		map.put("end", end);
		map.put("search_option", search_option);
		map.put("keyword", "%"+keyword+"%");
		return sqlSession.selectList("board.listAll",map);
	}

	@Override
	public void increaseViewcnt(int bno) throws Exception {
		sqlSession.update("board.increaseViewcnt",bno);
	}

	@Override
	public int countArticle() throws Exception {
		return sqlSession.selectOne("board.countArticle");
	}

	@Override
	public BoardDTO read(int bno) throws Exception {
		return sqlSession.selectOne("board.read",bno);
	}

}
