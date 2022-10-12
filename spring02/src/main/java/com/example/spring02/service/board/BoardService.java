package com.example.spring02.service.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.example.spring02.model.board.dto.BoardDTO;

public interface BoardService {
	public void deleteFile(String fullName);//첨부파일 삭제
	public List<String> getAttach(int bno);//첨부파일 정보
	public void addAttach(String fullName);//첨부파일을 저장하는 용도
	public void updateAttach(String fullName, int bno);//첨부파일 수정
	public void create(BoardDTO dto) throws Exception;//글쓰기용
	public void update(BoardDTO dto) throws Exception;//글수정
	public void delete(int bno) throws Exception;//글삭제
	public List<BoardDTO> listAll(int start, int end, String search_option, String keyword) throws Exception;//글목록
	public void increaseViewcnt(int bno, HttpSession session) throws Exception;//조회수 증가처리
	public int countArticle() throws Exception;//레코드갯수계산
	public BoardDTO read(int bno) throws Exception;//레코드 조회
}
