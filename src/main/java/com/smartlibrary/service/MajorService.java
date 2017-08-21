package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.MajorDao;
import com.smartlibrary.domain.Major;


@Service
public class MajorService {

	@Autowired
	private MajorDao majorDao;
	public List<Major> getMajorList(){
		Major temp =new Major();
		return majorDao.getMajorList(temp);
	}
	public Major getOneMajor(Major major){
		return majorDao.getOneMajor(major);
	}
	public void addMajor(Major major){
		majorDao.addMajor(major);
	}
	public void editMajor(Major major){
		majorDao.editMajor(major);
	}
}
