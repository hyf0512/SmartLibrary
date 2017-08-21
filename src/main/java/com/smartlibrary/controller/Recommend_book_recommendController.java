package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Recommend_book_recommend;
import com.smartlibrary.service.Recommend_book_recommendService;

@Controller
@RequestMapping(value="/recommend_book_recommend")
public class Recommend_book_recommendController {

	@Autowired
	private Recommend_book_recommendService recommend_book_recommendService;
	@RequestMapping(value="/getRecommend_book_recommendList")
	@ResponseBody
	public List<Recommend_book_recommend> getRecommend_book_recommendList(HttpServletRequest request) {
		return recommend_book_recommendService.getRecommend_book_recommendList();
	}
	@RequestMapping(value="/getOneRecommend_book_recommend")
	@ResponseBody
	public Recommend_book_recommend getOneRecommend_book_recommend(Recommend_book_recommend recommend_book_recommend) {
		return recommend_book_recommendService.getOneRecommend_book_recommend(recommend_book_recommend);
	}
	@RequestMapping(value="/addRecommend_book_recommend")
	@ResponseBody
	public void addRecommend_book_recommend(Recommend_book_recommend recommend_book_recommend) {
		recommend_book_recommendService.addRecommend_book_recommend(recommend_book_recommend);
	}
	@RequestMapping(value="/editRecommend_book_recommend")
	@ResponseBody
	public void editRecommend_book_recommend(Recommend_book_recommend recommend_book_recommend) {
		recommend_book_recommendService.editRecommend_book_recommend(recommend_book_recommend);
	}
}
