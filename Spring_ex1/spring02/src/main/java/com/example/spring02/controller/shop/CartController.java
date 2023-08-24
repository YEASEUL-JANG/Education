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
				return mav;
		}else {
			return new ModelAndView("member/login", "", null);
		}
	}
	
	@RequestMapping("insert.do")
	public String insert(HttpSession session, @ModelAttribute CartDTO dto) {
		//세션에 userid가 존재하는지 확인
		String userid=(String)session.getAttribute("userid");
		/*
		 * if(userid==null) {//아이디가 없다면 return "redirect:/member/login.do";//로그인 페이지로 이동
		 * }
		 */
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
	
	@RequestMapping("deleteAll.do")
	public String deleteAll(HttpSession session) {
		//세션변수 조회(로그인 여부 검사)
		String userid = (String)session.getAttribute("userid");
		if(userid != null) {
			cartService.deleteAll(userid);
		}
		return "redirect:/shop/cart/list.do";
	}
	@RequestMapping("update.do")
	//수량정보 여러개가 한꺼번에 들어온다.-> 배열을 사용
	public String update(@RequestParam int[] amount,@RequestParam int[] cart_id, HttpSession session) {
		String userid = (String)session.getAttribute("userid");
		if(userid != null) {
			//hidden으로 넘어오는 cart_id는 배열처리
			for(int i=0;i<cart_id.length;i++) {
				if(amount[i]==0) {//수량이 0이면 레코드 삭제
					cartService.delete(cart_id[i]);//상품 삭제
				}else {//0이아니면 수정
					 CartDTO dto = new CartDTO();
					 dto.setUserid(userid);
					 dto.setCart_id(cart_id[i]);
					 dto.setAmount(amount[i]);
					 cartService.modifyCart(dto);
				}
			}
		}
		return "redirect:/shop/cart/list.do";
	}
	
	
}
