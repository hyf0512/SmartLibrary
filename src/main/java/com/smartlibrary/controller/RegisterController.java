package com.smartlibrary.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.User;
import com.smartlibrary.service.RegisterService;

@Controller
@RequestMapping({"/register"})
public class RegisterController {
	@Autowired
	private RegisterService registerservice;
	/*
	 * 注册短信接口
	 */
	@RequestMapping({"/sendmsg"})
	@ResponseBody
	private Map<String,String> SendMessage(String phone){
		Map<String,String> sendresult = new HashMap<String, String>();
		try {
			sendresult=registerservice.SendMsg(phone);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			sendresult.put("result", "1");
			sendresult.put("err_msg", "发送失败");
		}
		return sendresult;
	}
	/*
	 * 注册接口
	 */
	@RequestMapping({"/registuser"})
	@ResponseBody
	private Map<String,String> RegisterUser(User user){
		return registerservice.registeruser(user);
	}
}
