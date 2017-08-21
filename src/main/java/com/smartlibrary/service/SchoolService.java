package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.SchoolDao;
import com.smartlibrary.domain.School;


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
	public void addSchool(School school){
		schoolDao.addSchool(school);
	}
	public void editSchool(School school){
		schoolDao.editSchool(school);
	}
}
