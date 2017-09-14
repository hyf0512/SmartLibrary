package com.smartlibrary.controller;

import com.alibaba.fastjson.JSONObject;
import com.smartlibrary.domain.User;
import com.smartlibrary.service.UserService;
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
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping(value="/getUserList")
	@ResponseBody
	public void getUserList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int status;
		String message;
		List<User> tempUserList= userService.getUserList();
		if (null != tempUserList) {
			status = 1;
			message = "查询列表成功";
		} else {
			status = 0;
			message = "查询列表失败";
		}
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		resultMap.put("data", tempUserList);	//添加返回数据
		String resultStr = JSONObject.toJSONString(resultMap).toString();//HashMap转JSON
		response.setContentType("text/json");	//设置格式为text/json
		response.setCharacterEncoding("UTF-8"); //设置字符集为'UTF-8'
		response.getWriter().print(resultStr);	//接口输出
	}
	@RequestMapping(value="/getOneUser")
	@ResponseBody
	public void getOneUser(User user, HttpServletResponse response) throws IOException{
		int status;
		String message=null;
		User tempUser = userService.getOneUser(user);
		if (null != tempUser) {
			status = 1;
			message = "查询单个成功";
		} else {
			status = 0;
			message = "查询单个失败";
		}
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		resultMap.put("data", tempUser);		//添加返回数据
		String resultStr = JSONObject.toJSONString(resultMap).toString();//HashMap转JSON
		response.setContentType("text/json");	//设置格式为text/json
		response.setCharacterEncoding("UTF-8"); //设置字符集为'UTF-8'
		response.getWriter().print(resultStr);	//接口输出
	}
	@RequestMapping(value="/addUser")
	@ResponseBody
	public void addUser(User user, HttpServletResponse response) throws IOException{
		int status = userService.addUser(user);
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
		userService.addUser(user);
	}
	@RequestMapping(value="/editUser")
	@ResponseBody
	public void editUser(User user, HttpServletResponse response) throws IOException{
		int status = userService.editUser(user);
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
	/*
	 * 修改昵称接口
	 */
	@RequestMapping({"/editNickname"})
	@ResponseBody
	public Map<String,Object> editNickname(User user){
		return userService.editNickname(user);
	}
	/*
	 * 修改性别接口
	 */
	@RequestMapping({"/editSex"})
	@ResponseBody
	public Map<String,Object> editSex(User user){
		return userService.editSex(user);
	}
	/*
	 * 修改兴趣接口
	 */
	@RequestMapping({"/editHobbyid"})
	@ResponseBody
	public Map<String,Object> editHobbyid(User user){
		return userService.editHobbyid(user);
	}
	/*
	 * 登录接口
	 */
	@RequestMapping({"/login"})
	@ResponseBody
	public Map<String,String> UserLogin(User user){
		return userService.loginUser(user);
	}
}
