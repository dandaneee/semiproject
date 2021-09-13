package edu.spring.boardproject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BDMemberController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	BDMemberService service;
	 
	//login 화면
	@RequestMapping("/login.do")
	public String login() {
		logger.info("LOGIN PAGE");
		return "login";
	}
	//login 메서드
	@RequestMapping(value="/userlogin.do", method=RequestMethod.POST)
	public String userLogin(BDMemberVO vo, HttpServletRequest request) {
		logger.info("LOGIN");
		//세션 생성
		HttpSession session= request.getSession(); 
		System.out.println("session아이디=" +session.getId());
		
		//세션 유효 시간 생성
		session.setMaxInactiveInterval(3600);
		System.out.println("세션 유효 시간=" + session.getMaxInactiveInterval());
		
		BDMemberVO log = service.login(vo);
		
		if(log!=null) {
			
			//세션에 저장
			session.setAttribute("log", log);
			return "redirect:list.do"; // 로그인 성공시 리스트로
		} else {
			return "redirect:login.do"; // 로그인 실패시 다시 로그인 화면으로 
		}
		
	}
	
	//회원 가입 화면
	@RequestMapping(value="/register.do")
	public String insert() {
		logger.info("REGISTER PAGE");
		return "register";
	}
	//회원 가입 메서드
	@RequestMapping(value="/userregister.do" , method=RequestMethod.POST)
	public String insertUser(BDMemberVO vo ) {
		logger.info("REGISTER");
		int regi = service.insertUser(vo);
		
		if(regi>0) {
			return "redirect:login.do";
		} else {
			return "redirect:register.do";
		}
	}
	
	
}
