package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Recommend_book_comment;
import com.smartlibrary.service.Recommend_book_commentService;

@Controller
@RequestMapping(value="/recommend_book_comment")
public class Recommend_book_commentController {

	@Autowired
	private Recommend_book_commentService recommend_book_commentService;
	@RequestMapping(value="/getRecommend_book_commentList")
	@ResponseBody
	public List<Recommend_book_comment> getRecommend_book_commentList(HttpServletRequest request) {
		return recommend_book_commentService.getRecommend_book_commentList();
	}
	@RequestMapping(value="/getOneRecommend_book_comment")
	@ResponseBody
	public Recommend_book_comment getOneRecommend_book_comment(Recommend_book_comment recommend_book_comment) {
		return recommend_book_commentService.getOneRecommend_book_comment(recommend_book_comment);
	}
	@RequestMapping(value="/addRecommend_book_comment")
	@ResponseBody
	public void addRecommend_book_comment(Recommend_book_comment recommend_book_comment) {
		recommend_book_commentService.addRecommend_book_comment(recommend_book_comment);
	}
	@RequestMapping(value="/editRecommend_book_comment")
	@ResponseBody
	public void editRecommend_book_comment(Recommend_book_comment recommend_book_comment) {
		recommend_book_commentService.editRecommend_book_comment(recommend_book_comment);
	}
}
