package com.smartlibrary.service;


import com.smartlibrary.dao.CollegeDao;
import com.smartlibrary.domain.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
	public int addCollege(College college){
		return collegeDao.addCollege(college);
	}
	public int editCollege(College college){
		return collegeDao.editCollege(college);
	}
}
