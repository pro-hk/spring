package com.prohk.util;

public class PageWriter {
	public static String pageWrite(int total, int listPerPage, int pageBlock, int clickPage, String requestURL) {
		String pageString = "";
		String url = requestURL;
		if(requestURL.contains("search_word") || requestURL.contains("id")) {
			url = requestURL+"&clickPage=";
		} else {
			url = requestURL+"?clickPage=";
		}
		int totalPages = (int)Math.ceil( (double) total / listPerPage );
		
		int tempPage = ((clickPage - 1) / pageBlock) * pageBlock + 1;
		if(tempPage != 1) {
			pageString += "<li>"
							+ "<a href='"+url+"1'>"
								+ "<span class='material-icons'> keyboard_double_arrow_left </span>"
							+ "</a>"
							+ "</li>";
			pageString += "<li>"
							+ "<a href='"+url+(tempPage - 1)+"'>"
								+ "<span class='material-icons'> chevron_left </span>"
							+ "</a>"
							+ "</li>";
		}
		
		int pageBlockCount = 1;
		while(pageBlockCount <= pageBlock && tempPage <= totalPages) {
			if(tempPage == clickPage) {
				pageString += "<li class='active'><a href=''>"+tempPage+"</a></li>";
			} else {
				pageString += "<li><a href='"+url+tempPage+"'>"+tempPage+"</a></li>";
			}
			tempPage++;
			pageBlockCount++;
		}
		
		if(tempPage <= totalPages) {
			pageString += "<li>"
							+ "<a href='"+url+ tempPage +"'>"
								+ "<span class='material-icons'> chevron_right </span>"
							+ "</a>"
							+ "</li>";
			pageString += "<li>"
							+ "<a href='"+url+totalPages+"'>"
								+ "<span class='material-icons'> keyboard_double_arrow_right </span>"
							+ "</a>"
							+ "</li>";
		}
		
		return pageString;
	}
}
