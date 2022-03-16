package com.prohk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardController {
	// board 폴더 하위 list   write   delete   update
//	@GetMapping("/List.do")
	@RequestMapping(value="/List.do", method= {RequestMethod.GET, RequestMethod.POST})
//	@RequestMapping(value="/List.do", method=RequestMethod.GET)
	public String list() {
		return "board/list";
	}
	
	@RequestMapping(value="/Write.do", method=RequestMethod.GET)
	public String write() {
		return "board/write";
	}
	
	@RequestMapping(value="/Update.do", method = RequestMethod.GET)
	public String update() {
		return "board/update";
	}
	
	@RequestMapping(value="/Delete.do", method = RequestMethod.GET)
	public String delete() {
		return "board/delete";
	}
}
