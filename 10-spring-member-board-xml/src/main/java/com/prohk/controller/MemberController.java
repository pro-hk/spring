package com.prohk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	@GetMapping("/List.do")
	public String list() {
		return "member/list";
	}
	@GetMapping("/Login.do")
	public String login() {
		return "member/login";
	}
	@GetMapping("/Join.do")
	public String join() {
		return "member/join";
	}
	@GetMapping("/Logout.do")
	public String logout() {
		return "member/logout";
	}
	@GetMapping("/Delete.do")
	public String delete() {
		return "member/delete";
	}
	@GetMapping("/Update.do")
	public String update() {
		return "member/update";
	}
	@GetMapping("/Info.do")
	public String info() {
		return "member/info";
	}
}
