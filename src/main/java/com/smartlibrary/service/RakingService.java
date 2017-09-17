package com.smartlibrary.service;


import com.smartlibrary.dao.RakingDao;
import com.smartlibrary.domain.Raking;
import com.smartlibrary.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class RakingService {

	@Autowired
	private RakingDao rakingDao;
	public Map<String,Object> getRakingList(Raking raking){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		List<Raking> tempRakingList = rakingDao.getRakingList(raking);
		int status;
		String message = null;
		if (null != tempRakingList) {
			status = 1;
			message = "查询列表成功";
		} else {
			status = 0;
			message = "查询列表失败";
		}
		resultMap.put("status", status);		//添加成功标记
		resultMap.put("message", message);		//添加返回信息
		resultMap.put("data", tempRakingList);	//添加返回数据
		return resultMap;
	}
	public List<Raking> getRakingList(){
		Raking temp =new Raking();
		return rakingDao.getRakingList(temp);
	}
	public Raking getOneRaking(Raking raking){
		return rakingDao.getOneRaking(raking);
	}
	public int addRaking(Raking raking){
		return rakingDao.addRaking(raking);
	}
	public int editRaking(Raking raking){
		return rakingDao.editRaking(raking);
	}
}
