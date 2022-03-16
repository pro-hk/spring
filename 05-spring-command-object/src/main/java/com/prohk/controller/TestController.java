package com.prohk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prohk.model.BoardDto;
import com.prohk.model.DataDto;
import com.prohk.model.MemberDto;

@Controller
public class TestController {
	@PostMapping("/Test01.do")
//	public String Test01(@ModelAttribute DataDto data) {
	public String test01(DataDto data) {
		System.out.println("data01=="+data.getData01());
		System.out.println("data02=="+data.getData02());
		return "test01";
	}
	
	@PostMapping("/MemberTest.do")
//	public String MemberTest(@ModelAttribute MemberDto MemberDto) {
	public String memberTest(MemberDto MemberDto) {
		System.out.println("no=="+MemberDto.getNo());
		System.out.println("id=="+MemberDto.getId());
		System.out.println("name=="+MemberDto.getName());
		System.out.println("password=="+MemberDto.getPassword());
		return "member";
	}

	@PostMapping("/MemberTest02.do")
	public String test01(@ModelAttribute("testDto") MemberDto MemberDto) {
		System.out.println("no=="+MemberDto.getNo());
		System.out.println("id=="+MemberDto.getId());
		System.out.println("name=="+MemberDto.getName());
		System.out.println("password=="+MemberDto.getPassword());
		return "member02";
	}
	
	@PostMapping("/Board.do")
	public String boardTest(BoardDto boardDto) {
		System.out.println("no=="+boardDto.getNo());
		System.out.println("subject=="+boardDto.getSubject());
		System.out.println("name=="+boardDto.getName());
		System.out.println("password=="+boardDto.getPassword());
		System.out.println("regDate=="+boardDto.getRegDate());
		return "board";
	}
}
