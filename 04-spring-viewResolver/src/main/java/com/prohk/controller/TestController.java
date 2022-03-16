package com.prohk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@GetMapping("/Test01.do")
	public String test01() {
		return "test01";
	}
	
	@GetMapping("/Test02.do")
	public String test02(HttpServletRequest request) {
		request.setAttribute("msg", "hello Spring");
		
		return "test02";
	}
	
	// 요즘 많이 씀
	@GetMapping("/Test03.do")
	public String test03(Model model) {
		// request에 데이터가 담긴다
		// data를 jsp에 넘겨야 한다. model / HttpServletRequest 를 쓰면 된다
		model.addAttribute("msg", "hello Spring");
		model.addAttribute("data", 100);
		
		return "test03";
	}
	
	@GetMapping("/Test04.do")
	public ModelAndView test04(ModelAndView mav) {
		// request에 데이터가 담긴다
		mav.addObject("msg", "hello Spring");
		mav.addObject("data", 100);
		mav.setViewName("test04");
		
		return mav;
	}
}
