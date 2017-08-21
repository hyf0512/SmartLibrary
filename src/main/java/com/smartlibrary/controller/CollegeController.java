package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.College;
import com.smartlibrary.service.CollegeService;

@Controller
@RequestMapping(value="/college")
public class CollegeController {

	@Autowired
	private CollegeService collegeService;
	@RequestMapping(value="/getCollegeList")
	@ResponseBody
	public List<College> getCollegeList(HttpServletRequest request) {
		return collegeService.getCollegeList();
	}
	@RequestMapping(value="/getOneCollege")
	@ResponseBody
	public College getOneCollege(College college) {
		return collegeService.getOneCollege(college);
	}
	@RequestMapping(value="/addCollege")
	@ResponseBody
	public void addCollege(College college) {
		collegeService.addCollege(college);
	}
	@RequestMapping(value="/editCollege")
	@ResponseBody
	public void editCollege(College college) {
		collegeService.editCollege(college);
	}
}
