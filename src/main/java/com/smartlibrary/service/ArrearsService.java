package com.smartlibrary.service;


import com.smartlibrary.dao.ArrearsDao;
import com.smartlibrary.domain.Arrears;
import com.smartlibrary.domain.Raking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ArrearsService {

	@Autowired
	private ArrearsDao arrearsDao;
	public Map<String,Object> getArrearsList(Arrears arrears){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		List<Arrears> tempArrearsList = arrearsDao.getArrearsList(arrears);
		double totalCost = 0;
		int status;
		String message = null;
		if (null != tempArrearsList) {
			status = 1;
			message = "查询列表成功";
		} else {
			status = 0;
			message = "查询列表失败";
		}
		for (Arrears temp : tempArrearsList) {
			totalCost += Double.parseDouble(temp.getFee());
		}
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		resultMap.put("totalCost", totalCost);	//添加欠款总数
		resultMap.put("data", tempArrearsList);	//添加返回数据
		return resultMap;
	}
	public Map<String,Object> getBooksList(Arrears arrears){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		List<Arrears> tempBooksList = arrearsDao.getBooksList(arrears);
		int status;
		String message = null;
		if (null != tempBooksList) {
			status = 1;
			message = "查询列表成功";
		} else {
			status = 0;
			message = "查询列表失败";
		}
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		resultMap.put("totalNumber", tempBooksList.size());	//添加未还书籍总数
		resultMap.put("data", tempBooksList);	//添加返回数据
		return resultMap;
	}
	public List<Arrears> getArrears2List(){
		Arrears temp =new Arrears();
		return arrearsDao.getArrearsList(temp);
	}
	public Arrears getOneArrears(Arrears arrears){
		return arrearsDao.getOneArrears(arrears);
	}
	public int addArrears(Arrears arrears){
		return arrearsDao.addArrears(arrears);
	}
	public int editArrears(Arrears arrears){
		return arrearsDao.editArrears(arrears);
	}
}
