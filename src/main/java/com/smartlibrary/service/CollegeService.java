package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.CollegeDao;
import com.smartlibrary.domain.College;


@Service
public class CollegeService {

	@Autowired
	private CollegeDao collegeDao;
	public List<College> getCollegeList(){
		College temp =new College();
		return collegeDao.getCollegeList(temp);
	}
	public College getOneCollege(College college){
		return collegeDao.getOneCollege(college);
	}
	public void addCollege(College college){
		collegeDao.addCollege(college);
	}
	public void editCollege(College college){
		collegeDao.editCollege(college);
	}
}
