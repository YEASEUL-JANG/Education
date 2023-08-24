package com.example.spring02.service.member;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.example.spring02.model.member.dto.MemberDTO;

public interface MemberService {
	//세션을 추가해서 서비스에서 기능하게 하고 로그아웃 기능이 추가된다.
	public boolean loginCheck(MemberDTO dto, HttpSession session);
	public void logout(HttpSession session);
	public MemberDTO viewMember(String userid);
	public List<MemberDTO> list();
}
