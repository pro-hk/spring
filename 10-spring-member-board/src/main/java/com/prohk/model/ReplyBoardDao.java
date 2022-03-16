package com.prohk.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReplyBoardDao implements ReplyBoardService {
	@Autowired
	public SqlSessionFactory sqlSessionFactory;
	
	@Override
	public int insertBoard(ReplyBoardDto replyBoardDto) {
		int result = 0;
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		result = sqlSession.insert("insertBoard", replyBoardDto);
		sqlSession.commit();
		sqlSession.close();
		
		return result;
	}
	
	@Override
	public int updateReLevel(ReplyBoardDto replyBoardDto) {
		int result = 0;
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		result = sqlSession.update("updateReLevel", replyBoardDto);
		sqlSession.commit();
		sqlSession.close();
		
		return result;
	}

	@Override
	public int getMaxRegroup() {
		int result = 0;
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		result = sqlSession.selectOne("getMaxReGroup");
		sqlSession.close();
		
		return result;
	}

	@Override
	public List<ReplyBoardDto> getAllList(int start, int end, String search_select, String search_word, String id) {
		List<ReplyBoardDto> boardList = null;
		
		HashMap<String, Object> boardMap = new HashMap<>();
		boardMap.put("start", start);
		boardMap.put("end", end);
		boardMap.put("search_select", search_select);
		boardMap.put("search_word", search_word);
		boardMap.put("id", id);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		boardList = sqlSession.selectList("getAllList", boardMap);
		sqlSession.close();
		
		return boardList;
	}

	@Override
	public List<ReplyBoardDto> getSearchAllList(String search_select, String search_word) {
		return null;
	}

	@Override
	public ReplyBoardDto getSelectOne(int no) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		ReplyBoardDto replyBoardDto = sqlSession.selectOne("getSelectOne", no);
		sqlSession.close();
		
		return replyBoardDto;
	}

	@Override
	public ReplyBoardDto getPrevSelect(int num) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		ReplyBoardDto replyBoardDto = sqlSession.selectOne("getPrevSelect", num);
		sqlSession.close();
		
		return replyBoardDto;
	}

	@Override
	public ReplyBoardDto getNextSelect(int num) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		ReplyBoardDto replyBoardDto = sqlSession.selectOne("getNextSelect", num);
		sqlSession.close();
		
		return replyBoardDto;
	}

	@Override
	public int updateHit(int no) {
		int result = 0;
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		result = sqlSession.update("updateHit", no);
		sqlSession.commit();
		sqlSession.close();
		
		return result;
	}

	@Override
	public int deleteBoard(ReplyBoardDto replyBoardDto) {
		int result = 0;
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		result = sqlSession.delete("deleteBoard", replyBoardDto);
		sqlSession.commit();
		sqlSession.close();
		
		return result;
	}

	@Override
	public int getTotal(String search_select, String search_word, String id) {
		int total = 0;
		
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("search_select", search_select);
		hashMap.put("search_word", search_word);
		hashMap.put("id", id);
		
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		total = sqlSession.selectOne("getTotal", hashMap);
		sqlSession.close();
		
		return total;
	}

	@Override
	public int updateBoard(ReplyBoardDto replyBoardDto) {
		int result = 0;
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		result = sqlSession.update("updateBoard", replyBoardDto);
		sqlSession.commit();
		sqlSession.close();
		
		return result;
	}
	
}
