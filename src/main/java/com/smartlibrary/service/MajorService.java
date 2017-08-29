package com.smartlibrary.service;


import com.smartlibrary.dao.MajorDao;
import com.smartlibrary.domain.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
	public int addMajor(Major major){
		return majorDao.addMajor(major);
	}
	public int editMajor(Major major){
		return majorDao.editMajor(major);
	}
}
