package com.smartlibrary.controller;

import com.alibaba.fastjson.JSONObject;
import com.smartlibrary.domain.User;
import com.smartlibrary.service.UserService;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
	 * 修改头像路径接口
	 */
	@RequestMapping({"/editPhotourl"})
	@ResponseBody
	public Map<String,Object> editPhotourl(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		
		User user = new User();
		user.setAccount(request.getParameter("account"));
		user.setPhotourl(request.getParameter("photourl"));
		
		request.setCharacterEncoding("utf-8");  
        response.setCharacterEncoding("utf-8");  
        //1、创建一个DiskFileItemFactory工厂  
        DiskFileItemFactory factory = new DiskFileItemFactory();  
        //2、创建一个文件上传解析器  
        ServletFileUpload upload = new ServletFileUpload(factory);  
        //解决上传文件名的中文乱码  
        upload.setHeaderEncoding("UTF-8");   
        factory.setSizeThreshold(1024 * 500);//设置内存的临界值为500K  
        File linshi = new File("E:\\linshi");//当超过500K的时候，存到一个临时文件夹中  
        factory.setRepository(linshi);  
        upload.setSizeMax(1024 * 1024 * 5);//设置上传的文件总的大小不能超过5M  
        try {  
            // 1. 得到 FileItem 的集合 items  
            List<FileItem> /* FileItem */items = upload.parseRequest(request);  
  
            // 2. 遍历 items:  
            for (FileItem item : items) {  
                // 若是一个一般的表单域, 打印信息  
                if (item.isFormField()) {  
                    String name = item.getFieldName();  
                    String value = item.getString("utf-8");  
  
                    System.out.println(name + ": " + value);  
                      
                      
                }  
                // 若是文件域则把文件保存到 e:\\files 目录下.  
                else {  
                    String fileName = item.getName();  
                    long sizeInBytes = item.getSize();  
                    System.out.println(fileName);  
                    System.out.println(sizeInBytes);  
  
                    InputStream in = item.getInputStream();  
                    byte[] buffer = new byte[1024];  
                    int len = 0;  
  
                    fileName = "e:\\files\\" + fileName;//文件最终上传的位置  
                    System.out.println(fileName);  
                    OutputStream out = new FileOutputStream(fileName);  
  
                    while ((len = in.read(buffer)) != -1) {  
                        out.write(buffer, 0, len);  
                    }  
  
                    out.close();  
                    in.close();  
                }  
            }  
  
        } catch (FileUploadException e) {  
            e.printStackTrace();  
        }  
		
		return userService.editPhotourl(user);
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
