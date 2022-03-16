package com.prohk.config;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//web.xml
public class SpringConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {RootAppContext.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {ServletAppContext.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
	// 한글 깨짐 방지
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[] {encodingFilter};
	}
	
	// 파일 업로드 세팅
	protected void customizeRegistration(Dynamic registration) {
		//절대경로, maxFileSize(파일 하나당 업로드 용량), maxRequestSize(여러개 전달시 처리할 수 있는 최대 용량), 임시파일로 저장할 수 있는 사이즈
		MultipartConfigElement confing = new MultipartConfigElement(null, 1024*1024*100, 1024*1024*1000, 0);
		registration.setMultipartConfig(confing);
	}
}
