package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Book_comment;
import com.smartlibrary.service.Book_commentService;

@Controller
@RequestMapping(value="/book_comment")
public class Book_commentController {

	@Autowired
	private Book_commentService book_commentService;
	@RequestMapping(value="/getBook_commentList")
	@ResponseBody
	public List<Book_comment> getBook_commentList(HttpServletRequest request) {
		return book_commentService.getBook_commentList();
	}
	@RequestMapping(value="/getOneBook_comment")
	@ResponseBody
	public Book_comment getOneBook_comment(Book_comment book_comment) {
		return book_commentService.getOneBook_comment(book_comment);
	}
	@RequestMapping(value="/addBook_comment")
	@ResponseBody
	public void addBook_comment(Book_comment book_comment) {
		book_commentService.addBook_comment(book_comment);
	}
	@RequestMapping(value="/editBook_comment")
	@ResponseBody
	public void editBook_comment(Book_comment book_comment) {
		book_commentService.editBook_comment(book_comment);
	}
}
