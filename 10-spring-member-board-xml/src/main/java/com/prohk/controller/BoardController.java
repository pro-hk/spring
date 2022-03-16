package com.prohk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	@GetMapping("/List.do")
	public String list() {
		return "board/list";
	}
	@GetMapping("/View.do")
	public String view() {
		return "board/view";
	}
	@GetMapping("/Write.do")
	public String write() {
		return "board/write";
	}
	@GetMapping("/Update.do")
	public String update() {
		return "board/update";
	}
	@GetMapping("/Delete.do")
	public String delete() {
		return "board/delete";
	}
	@GetMapping("/Reply.do")
	public String reply() {
		return "board/reply";
	}
}
