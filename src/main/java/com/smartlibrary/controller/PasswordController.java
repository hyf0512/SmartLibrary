package com.smartlibrary.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.User;
import com.smartlibrary.service.PasswordService;
/*
 * 修改密码
 */
@Controller
@RequestMapping({"/password"})
public class PasswordController {
	@Autowired
	private PasswordService passwordservice;
	/*
	 * 发送验证码
	 */
	@RequestMapping({"/sendmsg"})
	@ResponseBody
	public Map<String,String> SendMsg(String phone){
		Map<String,String> sendresult = new HashMap<String, String>();
		try {
			sendresult=passwordservice.SendMsg(phone);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			sendresult.put("result", "0");
			sendresult.put("err_msg", "发送失败");
		}
		return sendresult;
	}
	/*
	 * 找回密码
	 * url:http://localhost:8080/SmartLibrary/password/editpassword?account=15757115265&password=111
	 */
	@RequestMapping({"/editpassword"})
	@ResponseBody
	public Map<String,String> EditPassword(User user){
		return passwordservice.editpassword(user);
	}
	/*
	 * 修改密码
	 * url:http://localhost:8080/SmartLibrary/password/updatepassword?account=17816877999&password=12345&oldpassword=111
	 */
	@RequestMapping({"/updatepassword"})
	@ResponseBody
	public Map<String,String> UpdatePassword(User user){
		return passwordservice.updatepassword(user);
	}
}
