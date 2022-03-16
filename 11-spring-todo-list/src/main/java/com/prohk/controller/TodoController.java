package com.prohk.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prohk.model.TodoDao;
import com.prohk.model.TodoDto;

@Controller
public class TodoController {
	@Autowired
	TodoDao todoDao;
	
	@Autowired
	TodoDto todoDto;
	
	//json
	@RequestMapping("/Insert.do")
	@ResponseBody
	public Map<String, Object> insertTodo(@RequestBody TodoDto todoDto){ // map: key 필요(객체)
											// String 형태로 넘어옴
		System.out.println("todoDto=="+todoDto);
		Map<String, Object> hashMap = new HashMap<>();
		List<TodoDto> todoList = null;
		String pickedDate = todoDto.getPickedDate();
		
		int result = todoDao.insertTodo(todoDto);
		if(result > 0) {
			todoList = todoDao.getAllList(pickedDate);
			hashMap.put("todoList", todoList);
		}
		
		return hashMap;
	}
	
	@RequestMapping("/InsertList.do")
	@ResponseBody
	public List<TodoDto> insertTodoList(@RequestBody TodoDto todoDto){ // list : res가 바로 배열(ajax에서..)
											// String 형태로 넘어옴
		System.out.println("todoDto=="+todoDto);
		List<TodoDto> todoList = null;
		String pickedDate = todoDto.getPickedDate();
		
		int result = todoDao.insertTodo(todoDto);
		if(result > 0) {
			todoList = todoDao.getAllList(pickedDate);
		}
		
		return todoList;
	}
	
	@RequestMapping("/List.do")
	@ResponseBody
	public Map<String, Object> getTodoList(@RequestBody TodoDto todoDto){
		Map<String, Object> hashMap = new HashMap<>();
		
		String pickedDate = todoDto.getPickedDate();
		List<TodoDto> todoList = todoDao.getAllList(pickedDate);
		hashMap.put("todoList", todoList);
		
		return hashMap;
	}
	
	@RequestMapping("/Delete.do")
	@ResponseBody
	public Map<String, Object> deleteTodoList(@RequestBody TodoDto todoDto) {
		Map<String, Object> hashMap = new HashMap<>();

		int no = todoDto.getNo();
		int result = todoDao.deleteTodo(no);
		hashMap.put("result", result);  // {result: 0 or 1}
		
		return hashMap;
	}
	
	@RequestMapping("/Update.do")
	@ResponseBody
	public Map<String, Object> updateTodoList(@RequestBody TodoDto todoDto){
		Map<String, Object> hashMap = new HashMap<>();
		
		int result = todoDao.updateTodo(todoDto);
		hashMap.put("result", result);
		
		return hashMap;
	}
}
