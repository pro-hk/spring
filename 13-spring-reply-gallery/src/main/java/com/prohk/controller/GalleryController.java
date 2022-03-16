package com.prohk.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.prohk.model.GalleryDao;
import com.prohk.model.GalleryDto;
import com.prohk.model.ReplyDao;
import com.prohk.model.ReplyDto;
import com.prohk.util.ScriptWriter;

@Controller
public class GalleryController {
	@Autowired
	GalleryDao galleryDao;
	
	@Autowired
	GalleryDto galleryDto;

	@Autowired
	ReplyDao replyDao;
	
	@Autowired
	ReplyDto replyDto;
	
	@RequestMapping("/Insert.do")
	public String insertGallery() {
		return "insert";
	}
	
	@RequestMapping("/InsertProcess.do")
	public void insertProcessGallery(MultipartFile multipartFile, HttpServletRequest request, HttpServletResponse response,
									   GalleryDto galleryDto) throws IOException {
		String context = request.getContextPath(); // 현재 실행중인 context(13-spring-reply-gallery) 구해오기
		String imgFolder = "D:\\IT\\spring\\galleryImage\\";
		//String imgFolder = "C:\\galleryImage\\";
		String originalFileName = multipartFile.getOriginalFilename();  // 중복 파일 방지
		//System.out.println("originalFileName===" + originalFileName);
		String extention = FilenameUtils.getExtension(originalFileName); // 확장자
		String savedFileName = UUID.randomUUID()+"."+extention;  // 16자리 랜덤 문자
		File targetFile = new File(imgFolder+savedFileName);
		String dbFileName = context+"/galleryImage/"+savedFileName;
		
		try {
			InputStream fileStream = multipartFile.getInputStream();
			FileUtils.copyInputStreamToFile(fileStream, targetFile); // 폴더 저장하기
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		galleryDto.setRealImg(originalFileName);
		galleryDto.setImg(dbFileName);
		
		int result = galleryDao.insert(galleryDto);
		if(result > 0) {
			ScriptWriter.alertAndNext(response, "글이 등록되었습니다", "List02.do");
		} else {
			ScriptWriter.alertAndBack(response, "시스템 오류입니다.");
		}
	}
	
	@RequestMapping("/List.do")
	public String List() {
		return "list";
	}
	
	@RequestMapping("/JsonList.do")
	@ResponseBody
	public Map<String, List<GalleryDto>> jsonList() {
		Map<String, List<GalleryDto>> hashMap = new HashMap<>();
		List<GalleryDto> galleryList = galleryDao.getAllList();
		hashMap.put("galleryList", galleryList);
		return hashMap;
	}
	
	@RequestMapping("/List02.do")
	public String List02() {
		return "list02";
	}
	
	@RequestMapping("/JsonList02.do")
	@ResponseBody
	public Map<String, List<GalleryDto>> jsonList02() {
		Map<String, List<GalleryDto>> hashMap = new HashMap<>();
		List<GalleryDto> galleryList = galleryDao.getAllList();
		hashMap.put("galleryList", galleryList);
		return hashMap;
	}
	
	// 입력하자마자 댓글 추가
	@RequestMapping("/InsertReply.do")
	@ResponseBody
	public Map<String, Object> insertReply(ReplyDto replyDto) {
		int result = replyDao.insertReply(replyDto);
		Map<String, Object> hashMap = new HashMap<>();
		List<ReplyDto> replyList = replyDao.getAllReply(replyDto.getBoardId());
		hashMap.put("replyList", replyList);
		hashMap.put("result", result);
		
		return hashMap;
	}
	
	// 클릭하고 들어갔을 때, 댓글 출력
	@RequestMapping("/ReplyList.do")
	@ResponseBody
	public Map<String, Object> getAllReply(ReplyDto replyDto){
		Map<String, Object> hashMap = new HashMap<>();
		List<ReplyDto> replyList = replyDao.getAllReply(replyDto.getBoardId());
		hashMap.put("replyList", replyList);
		
		return hashMap;
	}
	
	@RequestMapping("/DeleteReply.do")
	@ResponseBody
	public Map<String, Object> deleteReply(ReplyDto replyDto){
		Map<String, Object> hashMap = new HashMap<>();
		int result = replyDao.deleteReply(replyDto.getNo());
		List<ReplyDto> replyList = replyDao.getAllReply(replyDto.getBoardId());
		hashMap.put("replyList", replyList);
		hashMap.put("result", result);
		return hashMap;
	}
	
	@RequestMapping("/DeleteAllReply.do")
	@ResponseBody
	public Map<String, Object> deleteAllReply(ReplyDto replyDto){
		Map<String, Object> hashMap = new HashMap<>();
		int result = replyDao.deleteAllReply(replyDto.getBoardId());
		List<ReplyDto> replyList = replyDao.getAllReply(replyDto.getBoardId());
		hashMap.put("replyList", replyList);
		hashMap.put("result", result);
		
		return hashMap;
	}
	
	@RequestMapping("/Delete.do")
	@ResponseBody
	public Map<String, Object> delete(GalleryDto galleryDto) {
		Map<String, Object> hashMap = new HashMap<>();
		int result = galleryDao.delete(galleryDto.getNo());
		List<GalleryDto> galleryList = galleryDao.getAllList();
		hashMap.put("galleryList", galleryList);
		hashMap.put("result", result);
		return hashMap;
	}
}
