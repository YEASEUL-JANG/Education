package com.example.spring02.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AdminInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		if(session.getAttribute("admin_userid")==null) {
			//관리자 로그인 페이지로 이동
			response.sendRedirect(request.getContextPath()+"/admin/login.do?message=nologin");
			return false; //메인 액션으로 가지 않음
		}else {
			return true;//메인액션으로 이동시킴
			}
		}

	//메인액션이 실행 된 후(추상메소드로써 오버라이딩만 한것이고 인터셉터는 메인액션 전에만 실행된다)
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}
}
