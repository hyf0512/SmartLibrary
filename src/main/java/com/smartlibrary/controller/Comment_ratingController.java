package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Comment_rating;
import com.smartlibrary.service.Comment_ratingService;

@Controller
@RequestMapping(value="/comment_rating")
public class Comment_ratingController {

	@Autowired
	private Comment_ratingService comment_ratingService;
	@RequestMapping(value="/getComment_ratingList")
	@ResponseBody
	public List<Comment_rating> getComment_ratingList(HttpServletRequest request) {
		return comment_ratingService.getComment_ratingList();
	}
	@RequestMapping(value="/getOneComment_rating")
	@ResponseBody
	public Comment_rating getOneComment_rating(Comment_rating comment_rating) {
		return comment_ratingService.getOneComment_rating(comment_rating);
	}
	@RequestMapping(value="/addComment_rating")
	@ResponseBody
	public void addComment_rating(Comment_rating comment_rating) {
		comment_ratingService.addComment_rating(comment_rating);
	}
	@RequestMapping(value="/editComment_rating")
	@ResponseBody
	public void editComment_rating(Comment_rating comment_rating) {
		comment_ratingService.editComment_rating(comment_rating);
	}
}
