package com.en3873.memo.common;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component // 해당 어노테이션을 이용해 springbean에 등록, 언제든 autowired로 가져올 수 잇음
public class PermissionInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(
			HttpServletRequest request
			, HttpServletResponse response
			, Object handler) throws IOException {
		
		HttpSession session = request.getSession();
		Integer userId = (Integer)session.getAttribute("userId");
		
		// /user/signin/view
		String uri = request.getRequestURI();
		
		if(userId != null) {
			// 로그인이 되어 있는 경우
			// 회원가입 페이지, 로그인 페이지를 접근할 경우
			// /user/signin/view   /user/signup/view
			// /user로 시작하는 페이지 접근하는 경우
			if(uri.startsWith("/user")) {
				// 메모 리스트로 페이지 이동
				response.sendRedirect("/post/list/view");
				return false;
			}
			
			
		} else {
			// 로그인이 되어 있지 않은 경우
			// 메모리스트, 입력화면, 디테일화면으로 접근할 경우
			// 로그인 페이지로 이동
			if(uri.startsWith("/post")) {
				// 로그인 페이지로 이동
				response.sendRedirect("/user/signin/view");
				return false;
			}
			
		}
		return true;
		
		
	}
	
	@Override
	public void postHandle(
			HttpServletRequest request
			, HttpServletResponse response
			, Object handler
			, ModelAndView modelAndView) {
		
		
		
	}
	
	@Override
	public void afterCompletion(
			HttpServletRequest request
			, HttpServletResponse response
			, Object handler
			, Exception ex) {
		
	}

}
