package com.example.spring02.controller.shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring02.model.shop.dto.CartDTO;
import com.example.spring02.service.shop.CartService;

@Controller
@RequestMapping("shop/cart/*")
public class CartController {
	
	@Inject
	CartService cartService;
	
	@RequestMapping("list.do")
	public ModelAndView list(HttpSession session, ModelAndView mav) {
		Map<String, Object> map= new HashMap<>();
		//세션변수 확인
		String userid=(String)session.getAttribute("userid");
		if(userid != null) {//로그인을 한 경우
			List<CartDTO> list = cartService.listCart(userid);
				//장바구니 합계 계산
				int sumMoney = cartService.sumMoney(userid);
				//배송료계산
				int fee = sumMoney >= 30000 ? 0:2500; //합계가 3만원 이상이면 배송비 0, 아니면 2500원
				
				map.put("list",list);
				map.put("fee",fee);
				map.put("sum",fee+sumMoney);
				map.put("sumMoney",sumMoney);
				map.put("count",list.size());
				mav.setViewName("shop/cart_list");
				mav.addObject("map",map);
		}else {
			return new ModelAndView("member/login", "", null);
		}
		return mav;
	}
	
	@RequestMapping("insert.do")
	public String insert(HttpSession session, @ModelAttribute CartDTO dto) {
		//세션에 userid가 존재하는지 확인
		String userid=(String)session.getAttribute("userid");
		if(userid==null) {//아이디가 없다면
			return "redirect:/member/login.do";//로그인 페이지로 이동
		}
		dto.setUserid(userid);
		cartService.insert(dto);
		//장바구니에 insert 처리 후 장바구니 목록으로 이동
		return "redirect:/shop/cart/list.do";
	}
	
	//장바구니 개별상품 삭제
	@RequestMapping("delete.do")
	public String delete(@RequestParam int cart_id, HttpSession session) {
		if(session.getAttribute("userid")!= null)
			cartService.delete(cart_id);
		return "redirect:/shop/cart/list.do";
	}
	
	
	
}
