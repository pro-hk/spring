package com.prohk.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.prohk.model.KeyValueDto;
import com.prohk.model.SelectDto;

@Controller
public class TestController02 {
	@GetMapping("/Test06.do")
	public String test06(SelectDto selectDto, Model model) {
		// option의 value와 같으면 selected 됨
		selectDto.setData01("data01");
		selectDto.setData02("banana");
		selectDto.setData03("lion");
		selectDto.setData04("hippo");
		selectDto.setData05("giants");
		
		String fruitsList[] = {"apple", "banana", "kiwi"};
		selectDto.setDataList(fruitsList);
		
		ArrayList<String> animalList = new ArrayList<>();
		animalList.add("hippo");
		animalList.add("tiger");
		animalList.add("lion");
		animalList.add("rabbit");
		model.addAttribute("animalList", animalList);
		
		KeyValueDto keyValueDto01 = new KeyValueDto();
		KeyValueDto keyValueDto02 = new KeyValueDto();
		KeyValueDto keyValueDto03 = new KeyValueDto();

		keyValueDto01.setKey("사자");
		keyValueDto01.setValue("lion");
		keyValueDto02.setKey("호랑이");
		keyValueDto02.setValue("tiger");
		keyValueDto03.setKey("하마");
		keyValueDto03.setValue("hippo");
		
		ArrayList<KeyValueDto> animalList02 = new ArrayList<>();
		animalList02.add(keyValueDto01);
		animalList02.add(keyValueDto02);
		animalList02.add(keyValueDto03);
		model.addAttribute("animalList02", animalList02);
		
		return "test06";
	}
}
