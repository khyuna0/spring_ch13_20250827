package com.khyuna0.formTest;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedirectController {
	
	@RequestMapping(value = "/studentInput")
	public String studentInput () {
		return "studentInput";
	}
	
	@RequestMapping(value = "/studentCheck")
	public String studentCheck (@RequestParam("sid") String sid, Model model, HttpServletResponse response) {
		
		if(sid.equals("tiger")) { // tiger 아이디이면 학생으로 간주
			// redirect : 로 요청 주기
			return "redirect:studentGood";
		} else {
			return "redirect:studentNg";
			// redirect:다음에 나오는 문자열은 요청이지 jsp 파일의 이름이 아님!
		}
		
	}
	
	@RequestMapping(value = "/studentGood")
	public String studentGood(Model model) {
		model.addAttribute("sid", "tiger");
		return "studentGood";
	}
	
	@RequestMapping(value = "/studentNg")
	public String studentNg(Model model) {
		model.addAttribute("sid", "tiger");
		return "studentNg";
	}
	
}
