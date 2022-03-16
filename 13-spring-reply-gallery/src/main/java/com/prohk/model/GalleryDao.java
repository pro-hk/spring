package com.prohk.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GalleryDao {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public int insert(GalleryDto galleryDto) {
		int result = 0;
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		result = sqlSession.insert("insertGallery", galleryDto);
		sqlSession.commit();
		sqlSession.close();
		
		return result;
	}
	
	public List<GalleryDto> getAllList(){
		List<GalleryDto> GalleryList = null;
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		GalleryList = sqlSession.selectList("getAllList");
		sqlSession.close();
		
		return GalleryList;
	}

	public int delete(int no) {
		int result = 0;
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		result = sqlSession.delete("deleteGallery", no);
		sqlSession.commit();
		sqlSession.close();
		
		return result;
	}
}
