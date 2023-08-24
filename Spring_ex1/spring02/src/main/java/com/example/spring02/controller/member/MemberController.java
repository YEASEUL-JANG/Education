package com.example.spring02.controller.member;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring02.model.member.dto.MemberDTO;
import com.example.spring02.service.member.MemberService;

@Controller
@RequestMapping("member/*")
public class MemberController {
	//로깅
	private static final Logger logger=
			LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService memberService;
	
	@RequestMapping("address.do")
	public String address() {
		return "member/join";
	}
	
	@RequestMapping("login.do")
	public String login() {
		return"member/login";
	}
	@RequestMapping("login_check.do")
	public ModelAndView login_check(MemberDTO dto, HttpSession session) {
		//로그인 성공시 true, 실패시 false
		boolean result= memberService.loginCheck(dto, session);
		ModelAndView mav=new ModelAndView();
		if(result) {
			mav.setViewName("home");
		}else {
			mav.setViewName("member/login");
			mav.addObject("message", "error");
		}
		return mav;
	}
	@RequestMapping("logout.do")
	public ModelAndView logout(HttpSession session, ModelAndView mav) {
		//세션초기화
		memberService.logout(session);
		//login.jsp로 이동
		mav.setViewName("member/login");
		mav.addObject("message","logout");
		return mav;
		
	}
	@RequestMapping("list.do")
	public String memberList(Model model) {
		List<MemberDTO> list = memberService.list();
		model.addAttribute("list", list);
		return "member/member_list";
	}
	
}
