package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Book_recommend;
import com.smartlibrary.service.Book_recommendService;

@Controller
@RequestMapping(value="/book_recommend")
public class Book_recommendController {

	@Autowired
	private Book_recommendService book_recommendService;
	@RequestMapping(value="/getBook_recommendList")
	@ResponseBody
	public List<Book_recommend> getBook_recommendList(HttpServletRequest request) {
		return book_recommendService.getBook_recommendList();
	}
	@RequestMapping(value="/getOneBook_recommend")
	@ResponseBody
	public Book_recommend getOneBook_recommend(Book_recommend book_recommend) {
		return book_recommendService.getOneBook_recommend(book_recommend);
	}
	@RequestMapping(value="/addBook_recommend")
	@ResponseBody
	public void addBook_recommend(Book_recommend book_recommend) {
		book_recommendService.addBook_recommend(book_recommend);
	}
	@RequestMapping(value="/editBook_recommend")
	@ResponseBody
	public void editBook_recommend(Book_recommend book_recommend) {
		book_recommendService.editBook_recommend(book_recommend);
	}
}
