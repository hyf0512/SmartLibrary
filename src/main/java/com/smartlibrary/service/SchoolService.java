package com.smartlibrary.service;


import com.smartlibrary.dao.SchoolDao;
import com.smartlibrary.domain.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SchoolService {

	@Autowired
	private SchoolDao schoolDao;
	public List<School> getSchoolList(){
		School temp =new School();
		return schoolDao.getSchoolList(temp);
	}
	public School getOneSchool(School school){
		return schoolDao.getOneSchool(school);
	}
	public int addSchool(School school){
		return schoolDao.addSchool(school);
	}
	public int editSchool(School school){
		return schoolDao.editSchool(school);
	}
	public String getAd_url(School school){
		return schoolDao.getAd_url(school);
	}
}
