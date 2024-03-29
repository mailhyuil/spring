package com.callor.naver.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.naver.model.NaverBookVO;
import com.callor.naver.service.NaverService;

@RequestMapping(value="/naver")
@Controller
public class NaverController {
	private final NaverService naverService;
	public NaverController(NaverService naverService) {
		this.naverService = naverService;
	}
	
	@RequestMapping(value="/books", method=RequestMethod.GET)
	public String getBooks(String title, Model model){
		
		String queryString = naverService.queryString("BOOK", title);
		List<NaverBookVO> bookList = naverService.getNaverBook(queryString);
		
		model.addAttribute("BOOKS", bookList);
		return "naver/book_search";
	}
	
}
