package com.prohk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.prohk.model.BoardDto;
import com.prohk.model.DataDto;
import com.prohk.model.DataDto02;
import com.prohk.model.MemberDto;

@Controller
public class TestController {
	// 자동 주입 --> new DataDto(); 생략
	@Autowired
	DataDto dataDto;

	@Autowired // 적용할 때마다 적어야됨
	MemberDto memberDto;
	
	@Autowired
	DataDto02 dataDto02;
	
	@Autowired
	BoardDto boardDto;
	
	@GetMapping("/Test01.do")
	public String test01() {
		dataDto.setData01("나는 자동 주입된 dataDto의 속성 중 하나인 data01");
		dataDto.setData02("나는 자동 주입된 dataDto의 속성 중 하나인 data02");

		dataDto02.setData0201("나는 직접 생성된 dataDto02의 속성 중 하나인 data0201");
		dataDto02.setData0202("나는 직접 생성된 dataDto02의 속성 중 하나인 data0202");
		return "forward:/Sub01.do";
	}
	
	@GetMapping("/Sub01.do")
	public String sub01(Model model) {
		model.addAttribute("dataDto", dataDto);
		model.addAttribute("dataDto02", dataDto02);
		return "sub01";
	}
	
	@GetMapping("/Test02.do")
	public String test02() {
		memberDto.setNo(1);
		memberDto.setName("홍길동");
		memberDto.setAge(20);
		return "forward:/Sub02.do";
	}
	
	@GetMapping("/Sub02.do")
	public String sub02(Model model) {
		model.addAttribute("memberDto", memberDto);
		return "sub02";
	}
	
	@GetMapping("/Test03.do")
	public String test03() {
		boardDto.setNo(2);
		boardDto.setSubject("hello");
		boardDto.setRegDate("2022.02.23");
		boardDto.setHit(1);
		return "forward:/Sub03.do";
	}
	
	@GetMapping("/Sub03.do")
	public String sub03(HttpServletRequest request) {
		request.setAttribute("boardDto", boardDto);
		return "sub03";
	}
}
