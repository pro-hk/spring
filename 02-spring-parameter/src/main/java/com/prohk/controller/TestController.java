package com.prohk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	@GetMapping("/Parameter01.do")
	public String parameter01(HttpServletRequest request) {
		String data01 = request.getParameter("data01");
		String data02 = request.getParameter("data02");
		String[] data03 = request.getParameterValues("data03");
		System.out.println("data01=="+data01);
		System.out.println("data02=="+data02);
		System.out.println("data03=="+data03);
		System.out.println("data01+data02=="+(data01+data02));
		
		for(String str:data03) {
			System.out.println("data03=="+str);
		}
		
		return "parameter01";
	}
	
	@GetMapping("/Parameter02.do")
	public String parameter02(@RequestParam(value="data01") int data01,
							  @RequestParam(value="data02") int data02,
							  @RequestParam(value="data03") int[] data03			  
							 ) {
		System.out.println("data01=="+data01);
		System.out.println("data02=="+data02);
		System.out.println("data03=="+data03);
		System.out.println("data01+data02=="+(data01+data02));
		
		for(int temp:data03) {
			System.out.println("data03=="+temp);
		}
		
		return null;
	}
	
	@GetMapping("/Parameter03.do")
	public String parameter03(int data01, int data02, int[] data03) {
		System.out.println("data01=="+data01);
		System.out.println("data02=="+data02);
		System.out.println("data03=="+data03);
		System.out.println("data01+data02=="+(data01+data02));
		
		for(int temp:data03) {
			System.out.println("data03=="+temp);
		}
		
		return null;
	}
	
	@GetMapping("/Parameter04.do")
	/*
	 * public String parameter04(@RequestParam(value="data01") int data01,
	 * @RequestParam(value="data02") int data02,
	 * @RequestParam(value="data03") int[] data03 ) {
	 */
		public String parameter04(int data01, int data02, int[] data03) {
		System.out.println("data01=="+data01);
		System.out.println("data02=="+data02);
		System.out.println("data01+data02=="+(data01+data02));
		
		int sum = 0;
		for(int temp:data03) {
			System.out.println("data03=="+temp);
			sum += temp;
		}
		System.out.println("dataSum=="+sum);
		return null;
	}
	
	@GetMapping("/Parameter05.do")
		public String parameter05(@RequestParam int data01,
								  @RequestParam(required = false) String data02, 
								  @RequestParam(defaultValue = "0") int[] data03) {
		System.out.println("data01=="+data01);
		System.out.println("data02=="+data02);
		System.out.println("data01+data02=="+(data01+data02));
		
		int sum = 0;
		for(int temp:data03) {
			System.out.println("data03=="+temp);
			sum += temp;
		}
		System.out.println("dataSum=="+sum);
		return null;
	}
	
	// api-server(서버가 프론트를 관여하지 않고 데이터만 던짐) 만들 때.. 명사 주로 이용
	@GetMapping("/parameter/{data01}/{data02}/{data03}")
	public String parameter06(@PathVariable int data01,
							  @PathVariable int data02,
							  @PathVariable int data03
							 ) {
		System.out.println("data01=="+data01);
		System.out.println("data02=="+data02);
		System.out.println("data03=="+data03);
		return null;
	}
}
