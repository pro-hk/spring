package com.prohk.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prohk.model.BoardDto;
import com.prohk.model.DataDto;
import com.prohk.model.MemberDto;

@Controller
public class TestController {
	@GetMapping("/ParameterObject01.do")
	public String parameterObject01(@RequestParam Map<String, String> map, @RequestParam List<String> data03) {
		String data01 = map.get("data01");
		String data02 = map.get("data02");
		String Mapdata03 = map.get("data03");
		
		System.out.println("data01=="+data01);
		System.out.println("data02=="+data02);
		System.out.println("Mapdata03=="+Mapdata03);
		
		for(String str:data03) {
			System.out.println(str);
		}
		
		return null;
	}
	
	@GetMapping("/ParameterObject02.do")
//	public String parameterObject02(@ModelAttribute DataDto dataDto) {
		public String parameterObject02(DataDto dataDto) {
		int data01 = dataDto.getData01();
		int data02 = dataDto.getData02();
		
		System.out.println("data01=="+data01);
		System.out.println("data02=="+data02);
		int sum = 0;
		for(int num:dataDto.getData03()) {
			sum += num;
			System.out.println("data03=="+num);
		}
		System.out.println("data03Sum=="+sum);
		return null;
	}
	
	@GetMapping("/ParameterObject03.do")
	public String parameterObject03(MemberDto memberDto) {
		int no = memberDto.getNo();
		String name = memberDto.getName();
		String id = memberDto.getId();
		String password = memberDto.getPassword();
		
		System.out.println("no=="+no);
		System.out.println("name=="+name);
		System.out.println("id=="+id);
		System.out.println("password=="+password);
		System.out.println("no+10=="+(no+10));
		
		return null;
	}
	
	@PostMapping("/ParameterObject04.do")
	public String parameterObject04(@ModelAttribute BoardDto boardDto) {
		int no = boardDto.getNo();
		String subject = boardDto.getSubject();
		String name = boardDto.getName();
		String password = boardDto.getPassword();
		String regDate = boardDto.getRegDate();
		
		System.out.println("no=="+no);
		System.out.println("subject=="+subject);
		System.out.println("name=="+name);
		System.out.println("password=="+password);
		System.out.println("regDate=="+regDate);
		
		return null;
	}
}
