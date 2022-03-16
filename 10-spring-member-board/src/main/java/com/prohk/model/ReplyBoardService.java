package com.prohk.model;

import java.util.List;

public interface ReplyBoardService {
	public int insertBoard(ReplyBoardDto replyBoardDto);
	public int updateReLevel(ReplyBoardDto replyBoardDto);
	public int getMaxRegroup();
	public List<ReplyBoardDto> getAllList(int start, int end,String search_select, String search_word, String id);
	public List<ReplyBoardDto> getSearchAllList(String search_select, String search_word);
	public ReplyBoardDto getSelectOne(int no);
	public ReplyBoardDto getPrevSelect(int num);
	public ReplyBoardDto getNextSelect(int num);
	public int updateHit(int no);
	public int deleteBoard(ReplyBoardDto replyBoardDto);
	public int updateBoard(ReplyBoardDto replyBoardDto);
	public int getTotal(String search_select, String search_word, String id);
}
