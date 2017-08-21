package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Recommend_book_list;
import com.smartlibrary.service.Recommend_book_listService;

@Controller
@RequestMapping(value="/recommend_book_list")
public class Recommend_book_listController {

	@Autowired
	private Recommend_book_listService recommend_book_listService;
	@RequestMapping(value="/getRecommend_book_listList")
	@ResponseBody
	public List<Recommend_book_list> getRecommend_book_listList(HttpServletRequest request) {
		return recommend_book_listService.getRecommend_book_listList();
	}
	@RequestMapping(value="/getOneRecommend_book_list")
	@ResponseBody
	public Recommend_book_list getOneRecommend_book_list(Recommend_book_list recommend_book_list) {
		return recommend_book_listService.getOneRecommend_book_list(recommend_book_list);
	}
	@RequestMapping(value="/addRecommend_book_list")
	@ResponseBody
	public void addRecommend_book_list(Recommend_book_list recommend_book_list) {
		recommend_book_listService.addRecommend_book_list(recommend_book_list);
	}
	@RequestMapping(value="/editRecommend_book_list")
	@ResponseBody
	public void editRecommend_book_list(Recommend_book_list recommend_book_list) {
		recommend_book_listService.editRecommend_book_list(recommend_book_list);
	}
}
