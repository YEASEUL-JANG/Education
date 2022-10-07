package com.example.spring02.controller.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring02.model.board.dto.BoardDTO;
import com.example.spring02.service.board.BoardService;

@Controller
@RequestMapping("board/*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Inject
	BoardService boardService;
	
	@RequestMapping("list.do")
	public ModelAndView list() throws Exception {
		List<BoardDTO> list = boardService.listAll();
		logger.info(list.toString());
		ModelAndView mav = new ModelAndView();
		Map<String, Object> map=new HashMap<>();
		map.put("list",list);
		map.put("count",list.size());
		mav.setViewName("board/list");
		mav.addObject("map",map);
		return mav;
	}
	@RequestMapping("write.do")
	public String write() {
		//글쓰기 페이지 이동
		return "board/write";
	}
	@RequestMapping("insert.do")
	public String insert(@ModelAttribute BoardDTO dto, HttpSession session) throws Exception{
		//세션에서 사용자아이디를 가져옴
		String writer=(String)session.getAttribute("userid");
		dto.setWriter(writer);
		//레코드 저장
		boardService.create(dto);
		//게시물 목록으로 이동
		return "redirect:/board/list.do";
	}
}
