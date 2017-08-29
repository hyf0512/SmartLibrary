package com.smartlibrary.service;


import com.smartlibrary.dao.ArrearsDao;
import com.smartlibrary.domain.Arrears;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArrearsService {

	@Autowired
	private ArrearsDao arrearsDao;
	public List<Arrears> getArrearsList(){
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
