package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.ArrearsDao;
import com.smartlibrary.domain.Arrears;


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
	public void addArrears(Arrears arrears){
		arrearsDao.addArrears(arrears);
	}
	public void editArrears(Arrears arrears){
		arrearsDao.editArrears(arrears);
	}
}
