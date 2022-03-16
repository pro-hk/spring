package com.prohk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	// <a href="link">링크</a>
	/*
	 * <script>
	 *  location.href="link";
	 *  history.go(-1);
	 *  history.back();
	 *  </script>
	 */
	
	@GetMapping("/Test01.do")
	public String test01() {
		return "redirect:/Sub01.do"; // 원하는 주소로 링크(주소 바뀜) -- 노출 2번
	}
	
	@GetMapping("/Sub01.do")
	public String sub01() {
		return "sub01";
	}
	
	@GetMapping("/Test02.do")
	public String test02() {
		return "forward:/Sub02.do";  // 주소가 안바뀜  -- 노출 1번
	}
	
	@GetMapping("/Sub02.do")
	public String sub02() {
		return "sub02";
	}
	
	@GetMapping("/Test03.do")
	public String test03() {
		return "redirect:/Sub03.do";
	}
	
	@GetMapping("/Sub03.do")
	public String sub03() {
		return "sub03";
	}
	
	@GetMapping("/Test04.do")
	public String test04() {
		return "forward:/Sub04.do";
	}
	
	@GetMapping("Sub04.do")
	public String sub04() {
		return "sub04";
	}
}
