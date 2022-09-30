package com.example.spring02.model.message.dao;

import com.example.spring02.model.message.dto.MessageDTO;

public interface MessageDAO {
	//메세지 쓰기
	public void create(MessageDTO dto);
	//메세지 읽기
	public MessageDTO readMessage(int mid);//메세지 아이디를 읽음
	//상태변경
	public void updateState(int mid);
}
