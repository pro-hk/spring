package com.prohk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		System.out.println("index");
		return "index";
	}
	
	@GetMapping("/Sub.do")
	public String sub() {
		System.out.println("sub");
		return "sub";
	}
}
