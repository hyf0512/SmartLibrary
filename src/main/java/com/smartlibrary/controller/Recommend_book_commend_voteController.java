package com.smartlibrary.controller;

import com.alibaba.fastjson.JSONObject;
import com.smartlibrary.domain.Recommend_book_commend_vote;
import com.smartlibrary.service.Recommend_book_commend_voteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/recommend_book_commend_vote")
public class Recommend_book_commend_voteController {

	@Autowired
	private Recommend_book_commend_voteService recommend_book_commend_voteService;
	@RequestMapping(value="/getRecommend_book_commend_voteList")
	@ResponseBody
	public void getRecommend_book_commend_voteList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int status;
		String message;
		List<Recommend_book_commend_vote> tempRecommend_book_commend_voteList= recommend_book_commend_voteService.getRecommend_book_commend_voteList();
		if (null != tempRecommend_book_commend_voteList) {
			status = 1;
			message = "查询列表成功";
		} else {
			status = 0;
			message = "查询列表失败";
		}
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		resultMap.put("data", tempRecommend_book_commend_voteList);	//添加返回数据
		String resultStr = JSONObject.toJSONString(resultMap).toString();//HashMap转JSON
		response.setContentType("text/json");	//设置格式为text/json
		response.setCharacterEncoding("UTF-8"); //设置字符集为'UTF-8'
		response.getWriter().print(resultStr);	//接口输出
	}
	@RequestMapping(value="/getOneRecommend_book_commend_vote")
	@ResponseBody
	public void getOneRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote, HttpServletResponse response) throws IOException{
		int status;
		String message=null;
		Recommend_book_commend_vote tempRecommend_book_commend_vote = recommend_book_commend_voteService.getOneRecommend_book_commend_vote(recommend_book_commend_vote);
		if (null != tempRecommend_book_commend_vote) {
			status = 1;
			message = "查询单个成功";
		} else {
			status = 0;
			message = "查询单个失败";
		}
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		resultMap.put("data", tempRecommend_book_commend_vote);		//添加返回数据
		String resultStr = JSONObject.toJSONString(resultMap).toString();//HashMap转JSON
		response.setContentType("text/json");	//设置格式为text/json
		response.setCharacterEncoding("UTF-8"); //设置字符集为'UTF-8'
		response.getWriter().print(resultStr);	//接口输出
	}
	@RequestMapping(value="/addRecommend_book_commend_vote")
	@ResponseBody
	public void addRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote, HttpServletResponse response) throws IOException{
		int status = recommend_book_commend_voteService.addRecommend_book_commend_vote(recommend_book_commend_vote);
		String message = null;
		if (1 == status) {
			message = "添加成功";
		} else if (0 == status) {
			message = "添加失败";
		}
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		String resultStr = JSONObject.toJSONString(resultMap).toString();//HashMap转JSON
		response.setContentType("text/json");	//设置格式为text/json
		response.setCharacterEncoding("UTF-8"); //设置字符集为'UTF-8'
		response.getWriter().print(resultStr);	//接口输出
	}
	@RequestMapping(value="/editRecommend_book_commend_vote")
	@ResponseBody
	public void editRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote, HttpServletResponse response) throws IOException{
		int status = recommend_book_commend_voteService.editRecommend_book_commend_vote(recommend_book_commend_vote);
		String message = null;
		if (1 == status) {
			message = "修改成功";
		} else if (0 == status) {
			message = "修改失败";
		}
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		String resultStr = JSONObject.toJSONString(resultMap).toString();//HashMap转JSON
		response.setContentType("text/json");	//设置格式为text/json
		response.setCharacterEncoding("UTF-8"); //设置字符集为'UTF-8'
		response.getWriter().print(resultStr);	//接口输出
	}
}
