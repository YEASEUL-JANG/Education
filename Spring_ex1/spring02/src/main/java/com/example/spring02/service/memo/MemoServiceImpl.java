package com.example.spring02.service.memo;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring02.model.memo.dao.MemoDAO;
import com.example.spring02.model.memo.dto.MemoDTO;

@Service //서비스빈으로 등록
public class MemoServiceImpl implements MemoService {
	
	@Inject//
	MemoDAO memoDAO;

	@Override
	public List<MemoDTO> list() {
		return memoDAO.list();
	}

	@Override
	public void insert(MemoDTO dto) {
		memoDAO.insert(dto.getWriter(), dto.getMemo());

	}

	@Override
	public MemoDTO memo_view(int idx) {
		return memoDAO.memo_view(idx);
	}

	@Override
	public void update(MemoDTO dto) {
		memoDAO.update(dto);

	}

	@Override
	public void delete(int idx) {
		memoDAO.delete(idx);
	}

}
