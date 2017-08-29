package com.smartlibrary.controller;

import com.alibaba.fastjson.JSONObject;
import com.smartlibrary.domain.Reserved_remainder;
import com.smartlibrary.service.Reserved_remainderService;
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
@RequestMapping(value="/reserved_remainder")
public class Reserved_remainderController {

	@Autowired
	private Reserved_remainderService reserved_remainderService;
	@RequestMapping(value="/getReserved_remainderList")
	@ResponseBody
	public void getReserved_remainderList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int status;
		String message;
		List<Reserved_remainder> tempReserved_remainderList= reserved_remainderService.getReserved_remainderList();
		if (null != tempReserved_remainderList) {
			status = 1;
			message = "查询列表成功";
		} else {
			status = 0;
			message = "查询列表失败";
		}
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		resultMap.put("data", tempReserved_remainderList);	//添加返回数据
		String resultStr = JSONObject.toJSONString(resultMap).toString();//HashMap转JSON
		response.setContentType("text/json");	//设置格式为text/json
		response.setCharacterEncoding("UTF-8"); //设置字符集为'UTF-8'
		response.getWriter().print(resultStr);	//接口输出
	}
	@RequestMapping(value="/getOneReserved_remainder")
	@ResponseBody
	public void getOneReserved_remainder(Reserved_remainder reserved_remainder, HttpServletResponse response) throws IOException{
		int status;
		String message=null;
		Reserved_remainder tempReserved_remainder = reserved_remainderService.getOneReserved_remainder(reserved_remainder);
		if (null != tempReserved_remainder) {
			status = 1;
			message = "查询单个成功";
		} else {
			status = 0;
			message = "查询单个失败";
		}
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		resultMap.put("data", tempReserved_remainder);		//添加返回数据
		String resultStr = JSONObject.toJSONString(resultMap).toString();//HashMap转JSON
		response.setContentType("text/json");	//设置格式为text/json
		response.setCharacterEncoding("UTF-8"); //设置字符集为'UTF-8'
		response.getWriter().print(resultStr);	//接口输出
	}

	@RequestMapping(value="/addReserved_remainder")
	@ResponseBody
	public void addReserved_remainder(Reserved_remainder reserved_remainder, HttpServletResponse response) throws IOException{
		int status = reserved_remainderService.addReserved_remainder(reserved_remainder);
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
	@RequestMapping(value="/editReserved_remainder")
	@ResponseBody
	public void editReserved_remainder(Reserved_remainder reserved_remainder, HttpServletResponse response) throws IOException{
		int status = reserved_remainderService.editReserved_remainder(reserved_remainder);
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
