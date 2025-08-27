package com.khyuna0.formTest;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@RequestMapping(value = "/login")
	public String login (HttpServletRequest request, Model model) {
		
		return "login";
	}
	
	@RequestMapping(value = "/login2")
	public String login2 (HttpServletRequest request, Model model) {
		
		return "login2";
	}
	
	@RequestMapping(value = "/loginOk")
	public String loginOk (HttpServletRequest request ,HttpServletResponse response , Model model, HttpSession session) {
		
		String mid = request.getParameter("mid"); // 클라이언트가 입력한 아이디 값 불러오기
		String mpw = request.getParameter("mpw"); // 클라이언트가 입력한 비밀번호 값 가져오기
		
		model.addAttribute("mid", mid);
		
		if(mid.equals("tiger") && mpw.equals("12345")) {
			session.setAttribute("sessionId", mid);
			return "loginOk";	
		} else {
			return "loginFail";
		}
		
	}
	
	// 방법 2 @RequestParam 사용
	@RequestMapping(value = "/loginOk2")
	public String loginOk2 ( @RequestParam("mid") String mid, @RequestParam("mpw") String mpw , HttpServletResponse response , Model model, HttpSession session) {
		
//		String mid = request.getParameter("mid"); // 클라이언트가 입력한 아이디 값 불러오기
//		String mpw = request.getParameter("mpw"); // 클라이언트가 입력한 비밀번호 값 가져오기
		
		model.addAttribute("mid", mid);
		
		if(mid.equals("tiger") && mpw.equals("12345")) {
			session.setAttribute("sessionId", mid);
			return "loginOk";	
		} else {
			return "loginFail";
		}
		
	}
	
	@RequestMapping(value = "/join")
	public String join (HttpServletRequest request ,HttpServletResponse response , Model model, HttpSession session) {
		
		return "join";
	}
	
	@RequestMapping(value = "/joinOk", method = RequestMethod.POST) 
	// method를 생략하면 둘 다 받음 / 명시하면 form 과 방식이 일치해야 작동함
	
	//public String joinOk (HttpServletRequest request, Model model) {
	public String joinOk (MemberDto memberDto, Model model) {
// 		MemberDto 의 멤버변수와 form의 파라미터 이름이 반드시 일치해야 함				
		
//		String mid = request.getParameter("mid");
//		String mpw = request.getParameter("mpw");
//		String mname = request.getParameter("mname");
//		String mage = request.getParameter("mage");
		
//		MemberDto memberDto = new MemberDto(mid, mpw, mname, mage);
		model.addAttribute("memberDto",memberDto);
		return "joinOk";
	}
	
	// method 를 다르게 명시하면 value 값이 일치해도 두 방식을 모두 처리 가능
	@RequestMapping(value = "/joinOk", method = RequestMethod.GET) 
	public String joinOk2 (MemberDto memberDto, Model model) {

		model.addAttribute("memberDto",memberDto);
		return "joinOk";
	}
	
	@RequestMapping( value = "/boardlist/{bnum}")
	public String boardlist (@PathVariable String bnum, Model model) { // 파라미터 이름 없이 전달된 값 받아오기
		model.addAttribute("bnum", bnum);
		return "boardlist";
	}
	
	// 이름 변경
	@RequestMapping(value = "/student")
	public String studentInfo ( @ModelAttribute("sInfo") StudentInformationDto studentInformationDto, Model model) {
		//model.addAttribute("studentInformationDto", studentInformationDto);
		return "student";
	}
	
}
