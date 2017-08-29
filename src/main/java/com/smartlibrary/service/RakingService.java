package com.smartlibrary.service;


import com.smartlibrary.dao.RakingDao;
import com.smartlibrary.domain.Raking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
	public int addRaking(Raking raking){
		return rakingDao.addRaking(raking);
	}
	public int editRaking(Raking raking){
		return rakingDao.editRaking(raking);
	}
}
