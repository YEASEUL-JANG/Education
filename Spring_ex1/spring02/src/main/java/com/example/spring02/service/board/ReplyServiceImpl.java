package com.example.spring02.service.board;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring02.model.board.dao.ReplyDAO;
import com.example.spring02.model.board.dto.ReplyDTO;
@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	ReplyDAO replydao;
	
	@Override
	public List<ReplyDTO> list(int bno) {
		return replydao.list(bno);
	}

	@Override
	public int count(int bno) {
		return 0;
	}

	@Override
	public void create(ReplyDTO dto) {
		replydao.create(dto);
	}

}
