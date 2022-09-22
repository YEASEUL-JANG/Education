package com.example.spring01.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring01.model.dto.ProductDTO;

//Controller 빈(bean)으로 스프링에 등록
@Controller
public class MainController {
	//로깅 변수
	private static final Logger logger=LoggerFactory.getLogger(MainController.class);
	
	//url 요청 매핑처리, 모든요청
	@RequestMapping("/")
	public String main(Model model) {
		//Model은 자료저장용 객체(서블릿 request객체와 같은 역할)
		model.addAttribute("message", "홈페이지 방문을 환영합니다.~~");
		return "main";// WEB-INF/views/main.jsp로 포워딩(스프링은 기본값이 포워딩임, 리다이렉트는 별도로 지정)
	}
	
	@RequestMapping("gugu.do") //url mapping
	public String gugu(Model model, @RequestParam(defaultValue = "2") int dan) {
		//int dan=7;
		String result="";
		for(int i=1; i<=9; i++) {
			result += dan + "x" + i + "=" + dan*i + "<br>";
		}
		//Model에 자료 저장
		model.addAttribute("result", result);
		return "test/gugu";//views/test/gugu.jsp로 포워딩
	}
	
	@RequestMapping("test.do")
	public void test() {
		//리턴 타입이 void인 경우 메소드 name(test())과 같은 페이지로 포워딩
		//WEB-INF/views/test.jsp로 포워딩함.
		//return "test"; 
	}
	
	@RequestMapping("test/doA")
	public String doA(Model model) {
		//request.setAttribute("message", "홈페이지 방문을 환영합니다.");
		//String page="/test/doA.jsp";
		//RequestDispatcher rd=request.getRequestDispatcher(page);
		//rd.forward(request, response);
		
		//자료 저장
		model.addAttribute("message", "홈페이지 방문을 환영합니다.");
		//포워딩
		return "test/doA";
	}
	
	@RequestMapping("test/doB")
	public void doB() {
		logger.info("doB 호출...");
	}
	
	//Model - 전달할 데이터
	//ModelAndView - 데이터와 포워딩할 페이지 정보 포함
	@RequestMapping("test/doC")
	public ModelAndView doC() {
		Map<String,Object> map=new HashMap<>();
		map.put("product", new ProductDTO("샤프", 1000));
		//new ModelAndView("포워딩할 페이지이름", "키변수", 값)
		return new ModelAndView("test/doC", "map", map);
	}
	
	@RequestMapping("test/doD")
	public String doD() {
		//forward : 주소 그대로, 화면 이동, 데이터전달
		//redirect : 주소 변경, 화면 이동, get방식의 소량의 데이터
		//스프링은 jsp와는 달리 기본값이 forward이다.
		return "redirect:/test/doE"; //다시 Controller를 호출한 후에 test/doE 로 이동
	}
	
	@RequestMapping("test/doE")
	public void doE() {
		//void는 doE.jsp로 포워딩
	}

	//웹페이지에서 json으로 request한 파라미터들을 java에서 받으려면 java object로의
	//변환이 필요하며 마찬가지로 response 시에도 java object에서 json으로 변환이 필요하다.
	//이러한 작업들을 해주는 어노테이션이 바로 @ResponseBody 와 @RestController 이다.
	//@RestController //스프링 4.0이상 부터 사용 가능(호환성 주의)
	/*
	 * @ResponseBody //자바객체인 dto를 json으로 변환(호환성 상관없음)
	 * 
	 * @RequestMapping("test/doF") public ProductDTO doF() { return new
	 * ProductDTO("냉장고", 5000000);
	 * 
	 * }
	 */
	

}
