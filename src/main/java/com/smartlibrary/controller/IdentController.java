package com.smartlibrary.controller;

import com.alibaba.fastjson.JSONObject;
import com.smartlibrary.domain.Ident;
import com.smartlibrary.service.IdentService;
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
@RequestMapping(value="/ident")
public class IdentController {

	@Autowired
	private IdentService identService;
	@RequestMapping(value="/getIdentList")
	@ResponseBody
	public void getIdentList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int status;
		String message;
		List<Ident> tempIdentList= identService.getIdentList();
		if (null != tempIdentList) {
			status = 1;
			message = "查询列表成功";
		} else {
			status = 0;
			message = "查询列表失败";
		}
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		resultMap.put("data", tempIdentList);	//添加返回数据
		String resultStr = JSONObject.toJSONString(resultMap).toString();//HashMap转JSON
		response.setContentType("text/json");	//设置格式为text/json
		response.setCharacterEncoding("UTF-8"); //设置字符集为'UTF-8'
		response.getWriter().print(resultStr);	//接口输出
	}
	@RequestMapping(value="/getOneIdent")
	@ResponseBody
	public void getOneIdent(Ident ident, HttpServletResponse response) throws IOException{

		int status;
		String message=null;
		Ident tempIdent = identService.getOneIdent(ident);
		if (null != tempIdent) {
			status = 1;
			message = "查询单个成功";
		} else {
			status = 0;
			message = "查询单个失败";
		}
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		resultMap.put("data", tempIdent);		//添加返回数据
		String resultStr = JSONObject.toJSONString(resultMap).toString();//HashMap转JSON
		response.setContentType("text/json");	//设置格式为text/json
		response.setCharacterEncoding("UTF-8"); //设置字符集为'UTF-8'
		response.getWriter().print(resultStr);	//接口输出
	}
	@RequestMapping(value="/addIdent")
	@ResponseBody
	public void addIdent(HttpServletRequest request, HttpServletResponse response) throws IOException{

		request.setCharacterEncoding("UTF-8");
		
		Ident ident = new Ident();
		
		ident.setAccount(new String(request.getParameter("account").getBytes("ISO8859-1"), "UTF-8"));
		ident.setSchoolName(new String(request.getParameter("schoolName").getBytes("ISO8859-1"), "UTF-8"));
		ident.setStudentid(new String(request.getParameter("studentid").getBytes("ISO8859-1"), "UTF-8"));
		ident.setSzLogonName(new String(request.getParameter("szLogonName").getBytes("ISO8859-1"), "UTF-8"));
		ident.setTrueName(new String(request.getParameter("trueName").getBytes("ISO8859-1"), "UTF-8"));
		ident.setCollegeName(new String(request.getParameter("collegeName").getBytes("ISO8859-1"), "UTF-8"));
		ident.setMajorName(new String(request.getParameter("majorName").getBytes("ISO8859-1"), "UTF-8"));
		ident.setSex(new String(request.getParameter("sex").getBytes("ISO8859-1"), "UTF-8"));
		ident.setIdent(new String(request.getParameter("ident").getBytes("ISO8859-1"), "UTF-8"));
		ident.setEnrolYear(new String(request.getParameter("enrolYear").getBytes("ISO8859-1"), "UTF-8"));
		ident.setAccessurl(new String(request.getParameter("accessurl").getBytes("ISO8859-1"), "UTF-8"));
		ident.setCPrintUrl(new String(request.getParameter("CPrintUrl").getBytes("ISO8859-1"), "UTF-8"));
		ident.setSmartLibUrl(new String(request.getParameter("SmartLibUrl").getBytes("ISO8859-1"), "UTF-8"));
		ident.setBookstoreurl(new String(request.getParameter("bookstoreurl").getBytes("ISO8859-1"), "UTF-8"));
		ident.setOrderUrl(new String(request.getParameter("orderUrl").getBytes("ISO8859-1"), "UTF-8"));
		
		int status = identService.addIdent(ident);
		String message = null;
		if (1 == status) {
			message = "添加或修改成功";
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
	@RequestMapping(value="/editIdent")
	@ResponseBody
	public void editIdent(Ident ident, HttpServletResponse response) throws IOException{
		int status = identService.editIdent(ident);
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
