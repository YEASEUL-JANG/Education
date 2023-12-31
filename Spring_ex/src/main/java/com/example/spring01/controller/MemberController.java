package com.example.spring01.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.spring01.model.dto.MemberDTO;
import com.example.spring01.service.MemberService;

@Controller
public class MemberController {
	//MemberService 인스턴스를 주입
	@Inject
	MemberService memberService;
	
	@RequestMapping("member/list.do")
	public String memberList(Model model) {
		List<MemberDTO> list = memberService.memberList();
		model.addAttribute("list",list);
		return "member/member_list"; //views/member/member_list.jsp로 포워딩하겠다.
	}
	
	@RequestMapping("member/write.do")
	public String write() {
		return "member/write";
	}
	@RequestMapping("member/insert.do")
	public String insert(@ModelAttribute MemberDTO dto) {//@ModelAttribute : 폼에서 전달된 값을 저장하는 객체(생략가능)
		System.out.println(dto);
		memberService.insertMember(dto);
		return "redirect:/member/list.do";
	}
	@RequestMapping("member/view.do")
	public String view(@RequestParam String userid, Model model) {
		//모델에 자료를 저장한다.
		model.addAttribute("dto",memberService.viewMember(userid));
		return "member/view";
	}
	
	@RequestMapping("member/update.do")
	public String update(MemberDTO dto, Model model) {
		//비밀번호 체크
			boolean result = memberService.checkPw(dto.getUserid(), dto.getPasswd());
			if(result) {//비번이 맞으면
				//회원수정
				memberService.updateMember(dto);
				return "redirect:/member/list.do";
			}else {
				model.addAttribute("message","비밀번호를 확인하세요.");
				//수정버튼을 누른 후에는 입력필드에 나타난 정보가 모두 지워지기 때문에 지워지는 현상을 막기위해 
				model.addAttribute("dto",dto);
				//날짜는 dto가 아닌 시스템에서 자동처리했기 때문에 날짜도 입력필드에서 지워지는 현상 방지
				model.addAttribute("join_date",memberService.viewMember(dto.getUserid()).getJoin_date());
				return "member/view";
			}
	}
	
	@RequestMapping("member/delete.do")
	public String delete(String userid,String passwd, Model model) {
		boolean result=memberService.checkPw(userid, passwd);
		if(result) {
			memberService.deleteMember(userid);
			return "redirect:/member/list.do";
		}else {
			model.addAttribute("message","비밀번호를 확인하세요");
			//일단 삭제버튼을 누른 후엔 입력필드에 나타난 정보가 지워지기 때문에 이를 방지하기 위해
			model.addAttribute("dto",memberService.viewMember(userid));
			return "member/view";
		}
	}
	
	
}
