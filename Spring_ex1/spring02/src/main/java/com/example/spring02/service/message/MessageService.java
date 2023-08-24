package com.example.spring02.service.message;

import com.example.spring02.model.message.dto.MessageDTO;

public interface MessageService {
	public MessageDTO readMessage(int mid);
	public void addMessage(MessageDTO dto);
	
}
