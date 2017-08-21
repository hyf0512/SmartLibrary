package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.RakingDao;
import com.smartlibrary.domain.Raking;


@Service
public class RakingService {

	@Autowired
	private RakingDao rakingDao;
	public List<Raking> getRakingList(){
		Raking temp =new Raking();
		return rakingDao.getRakingList(temp);
	}
	public Raking getOneRaking(Raking raking){
		return rakingDao.getOneRaking(raking);
	}
	public void addRaking(Raking raking){
		rakingDao.addRaking(raking);
	}
	public void editRaking(Raking raking){
		rakingDao.editRaking(raking);
	}
}
