package com.prohk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.prohk.model.MemberDto;

@Controller
public class TestController {
	@GetMapping("/Test01.do")
	public String test01(MemberDto memberDto) {
		memberDto.setNo(10);
		memberDto.setId("hyeok");
		memberDto.setName("장혁");
		memberDto.setPassword("1234");
		
		return "test01";
	}

	@GetMapping("/Test02.do")
	public String test02(MemberDto memberDto) {
		memberDto.setNo(20);
		memberDto.setId("hulk");
		memberDto.setName("배너박사");
		memberDto.setPassword("5678");
		
		return "test02";
	}
	
	@GetMapping("/Test03.do")
	public String test03(@ModelAttribute("myMember") MemberDto memberDto) {
		memberDto.setNo(20);
		memberDto.setId("hulk");
		memberDto.setName("배너박사");
		memberDto.setPassword("5678");
		
		return "test03";
	}
	
	// 많이 선호
	@GetMapping("/Test04.do")
	public String test04(Model model) {
		MemberDto memberDto = new MemberDto();
		memberDto.setNo(30);
		memberDto.setId("spiderman");
		memberDto.setName("거미");
		memberDto.setPassword("1111");
		model.addAttribute("memberDto", memberDto);
		
		return "test04";
	}
	
	@GetMapping("/Test05.do")
	public String test05(Model model) {
		MemberDto memberDto = new MemberDto();
		memberDto.setNo(30);
		memberDto.setId("spiderman");
		memberDto.setName("거미");
		memberDto.setPassword("1111");
		model.addAttribute("memberDto", memberDto);
		
		return "test05";
	}
}
