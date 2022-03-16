package com.prohk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.prohk.model.BoardDto;
import com.prohk.model.DataDto02;

@Configuration
public class RootAppContext {
	// 직접 등록(@Component 안적어도 됨)
	@Bean
	public DataDto02 dataDto02() {
		return new DataDto02();
	}
	
	@Bean
	public BoardDto boardDto() {
		return new BoardDto();
	}
}
