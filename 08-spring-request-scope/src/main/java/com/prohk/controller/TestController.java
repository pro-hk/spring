package com.prohk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.prohk.model.DataDto;

@Controller
public class TestController {
	@GetMapping("/Test01.do")
	public String test01(HttpServletRequest request) {
		request.setAttribute("data01", "나는 data01");
		return "forward:/Sub01.do";
	}
	
	@GetMapping("/Sub01.do")
	public String sub01(HttpServletRequest request) {
		String data01 = (String)request.getAttribute("data01");
		System.out.println(data01);
		return "sub01";
	}
	
	// 요즘 많이 쓰는 형태(Model)
	@GetMapping("/Test02.do")
	public String test02(Model model) {
		model.addAttribute("data02", "나는 data02");
		return "forward:/Sub02.do";
	}
	
	@GetMapping("/Sub02.do")
	public String sub02(HttpServletRequest request) { // model에 싣고 request로 받는다
		String data02 = (String)request.getAttribute("data02");
		System.out.println(data02);
		return "sub02";
	}

	// 예전에 많이 썻던 형태(ModelAndView)
	@GetMapping("/Test03.do")
	public ModelAndView test03(ModelAndView mav) {
		mav.addObject("data03", "나는 data03");
		mav.setViewName("forward:/Sub03.do");
		return mav;
	}
	
	@GetMapping("/Sub03.do")
	public String sub03(HttpServletRequest request) { // 받는건 다 request
		String data03 = (String)request.getAttribute("data03");
		System.out.println(data03);
		return "sub03";
	}

	@GetMapping("/Test04.do")
	public String test04(Model model) {
		DataDto dataDto = new DataDto();
		dataDto.setData01("dataDto data01");
		dataDto.setData02("dataDto data02");
		model.addAttribute("data04", dataDto);
		return "forward:/Sub04.do";
	}

	@GetMapping("/Sub04.do")
	public String sub04(HttpServletRequest request) {
		DataDto data04 = (DataDto)request.getAttribute("data04");
		System.out.println(data04.toString());
		return "sub04";
	}

	@GetMapping("/Test05.do")
//	public String test05(@ModelAttribute("dataDto") DataDto dataDto) {
	public String test05(DataDto dataDto) {
		dataDto.setData01("ModelAttribute dataDto data01");
		dataDto.setData02("ModelAttribute dataDto data02");
		return "forward:/Sub05.do";
	}

	@GetMapping("/Sub05.do")
	public String sub05(HttpServletRequest request) {
//	public String sub05(DataDto dataDto) {
		DataDto dataDto = (DataDto)request.getAttribute("dataDto");
		System.out.println(dataDto.toString());
		return "sub05";
	}
}
