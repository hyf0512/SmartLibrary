package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.School;
import com.smartlibrary.service.SchoolService;

@Controller
@RequestMapping(value="/school")
public class SchoolController {

	@Autowired
	private SchoolService schoolService;
	@RequestMapping(value="/getSchoolList")
	@ResponseBody
	public List<School> getschoolList(HttpServletRequest request) {
		return schoolService.getSchoolList();
	}
	@RequestMapping(value="/getOneSchool")
	@ResponseBody
	public School getOneSchool(School school) {
		return schoolService.getOneSchool(school);
	}
	@RequestMapping(value="/addSchool")
	@ResponseBody
	public void addSchool(School school) {
		schoolService.addSchool(school);
	}
	@RequestMapping(value="/editSchool")
	@ResponseBody
	public void editSchool(School school) {
		schoolService.editSchool(school);
	}
}
