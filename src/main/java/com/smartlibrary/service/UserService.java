package com.smartlibrary.service;


import com.alibaba.fastjson.JSONObject;
import com.smartlibrary.dao.RegisterDao;
import com.smartlibrary.dao.UserDao;
import com.smartlibrary.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public Map<String,Object> editNickname(User user){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		int status = userDao.editNickname(user);
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
	public Map<String,Object> editHobbyid(User user){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		int status = userDao.editHobbyid(user);
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
	public Map<String,Object> editPhotourl(User user){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		int status = userDao.editPhotourl(user);
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
			}
			else{
				result.put("result", "0");
				result.put("err_msg", "密码错误");
			}
		}
		return result;
	}
}
