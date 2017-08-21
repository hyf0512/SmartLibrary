package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Recommend_book_commend_vote;
import com.smartlibrary.service.Recommend_book_commend_voteService;

@Controller
@RequestMapping(value="/recommend_book_commend_vote")
public class Recommend_book_commend_voteController {

	@Autowired
	private Recommend_book_commend_voteService recommend_book_commend_voteService;
	@RequestMapping(value="/getRecommend_book_commend_voteList")
	@ResponseBody
	public List<Recommend_book_commend_vote> getRecommend_book_commend_voteList(HttpServletRequest request) {
		return recommend_book_commend_voteService.getRecommend_book_commend_voteList();
	}
	@RequestMapping(value="/getOneRecommend_book_commend_vote")
	@ResponseBody
	public Recommend_book_commend_vote getOneRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote) {
		return recommend_book_commend_voteService.getOneRecommend_book_commend_vote(recommend_book_commend_vote);
	}
	@RequestMapping(value="/addRecommend_book_commend_vote")
	@ResponseBody
	public void addRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote) {
		recommend_book_commend_voteService.addRecommend_book_commend_vote(recommend_book_commend_vote);
	}
	@RequestMapping(value="/editRecommend_book_commend_vote")
	@ResponseBody
	public void editRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote) {
		recommend_book_commend_voteService.editRecommend_book_commend_vote(recommend_book_commend_vote);
	}
}
