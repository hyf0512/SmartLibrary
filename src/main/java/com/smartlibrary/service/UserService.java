package com.smartlibrary.service;


import com.alibaba.fastjson.JSONObject;
import com.smartlibrary.dao.RegisterDao;
import com.smartlibrary.dao.UserDao;
import com.smartlibrary.domain.User;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private RegisterDao registerdao;
	public List<User> getUserList(){
		User temp =new User();
		return userDao.getUserList(temp);
	}
	public User getOneUser(User user){
		return userDao.getOneUser(user);
	}
	public int addUser(User user){
		return userDao.addUser(user);
	}
	public int editUser(User user){
		return userDao.editUser(user);
	}
	public Map<String,Object> editNickname(User user) throws UnsupportedEncodingException{
		int status;
		String message = null;
		Map<String,Object> resultMap = new HashMap<String,Object>();
		if (user.getNickname().equals("")) {
			status = 0;
			message = "昵称不能为空";
		} else {
			user.setNickname(new String(user.getNickname().getBytes("ISO8859-1"), "UTF-8"));		
			status = userDao.editNickname(user);
			if (1 == status) {
				message = "修改成功";
			} else if (0 == status) {
				message = "修改失败";
			}
		}	
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		return resultMap;
	}
	/*
	public Map<String,Object> editSex(User user){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		int status = userDao.editSex(user);
		String message = null;
		if (1 == status) {
			message = "修改成功";
		} else if (0 == status) {
			message = "修改失败";
		}
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		return resultMap;
	}
	*/
	public Map<String,Object> editHobbyId(User user){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		int status = userDao.editHobbyId(user);
		String message = null;
		if (1 == status) {
			message = "修改成功";
		} else if (0 == status) {
			message = "修改失败";
		}
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		return resultMap;
	}
	public Map<String,Object> editPhotoUrl(User user){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		int status = userDao.editPhotoUrl(user);
		String message = null;
		if (1 == status) {
			message = "上传头像成功";
		} else if (0 == status) {
			message = "上传头像失败";
		}
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		return resultMap;
	}
	
	public Map<String,String> loginUser(User user){
		Map<String,String> result = new HashMap<String, String>();
		if(registerdao.ifuserexist(user.getAccount())==null){
			result.put("result", "0");
			result.put("err_msg", "该帐号不存在");
		}
		else{
			if(registerdao.getpassword(user.getAccount()).equals(user.getPassword())){
				result.put("result", "1");
				result.put("err_msg", "登录成功");
			}
			else{
				result.put("result", "0");
				result.put("err_msg", "密码错误");
			}
		}
		return result;
	}
	
	public Map<String,String> SendMsg(String phone) throws Exception{
		Map<String,String> sendresult = new HashMap<String, String>();
		if(registerdao.ifuserexist(phone) != null){
			String yzm=String.valueOf((int)((Math.random()*9+1)*100000));
			String SmsParamString="{\"code\":\""+yzm+"\"}";
			String url="http://gw.api.taobao.com/router/rest";//联创信息
			String appkey="24604315";
			String secret="5ec353157b857b0189d80bee79619496";
			TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
			AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
			req.setExtend("123456");
			req.setSmsType("normal");
			req.setSmsFreeSignName("联创信息");
			req.setSmsParamString(SmsParamString);
			req.setRecNum(phone);
			req.setSmsTemplateCode("SMS_90335010");
			AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
			JSONObject result = JSONObject.parseObject(rsp.getBody());
			result = result.getJSONObject("alibaba_aliqin_fc_sms_num_send_response").getJSONObject("result");
			if(result.getString("err_code").equals("0")){
				sendresult.put("result", "1");
				sendresult.put("err_msg", "发送成功");
				sendresult.put("code", yzm);
			}
			else{
				sendresult.put("result", "0");
				sendresult.put("err_msg", result.getString("msg"));
			}
			System.out.println(result);
		}
		else{
			sendresult.put("result", "0");
			sendresult.put("err_msg", "该号码未注册");
		}
		return sendresult;
		
	}
}
