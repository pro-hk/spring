package com.prohk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	@GetMapping("/List.do")
	public String List() {
		return "/member/list";
	}
	
	@GetMapping("/Write.do")
	public String Write() {
		return "/member/write";
	}
	
	@GetMapping("/Update.do")
	public String update() {
		return "/member/update";
	}
	
	@GetMapping("/Delete.do")
	public String delete() {
		return "/member/delete";
	}
}
