package com.example.spring02.model.memo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.spring02.model.memo.dto.MemoDTO;

public interface MemoDAO {
	
	//mybatis interface mapper(쿼리문을 바로 적음)
	@Select("select * from memo order by idx desc")
	public List<MemoDTO> list();
}
