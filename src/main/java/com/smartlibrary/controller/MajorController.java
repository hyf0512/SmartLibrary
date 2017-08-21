package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Major;
import com.smartlibrary.service.MajorService;

@Controller
@RequestMapping(value="/major")
public class MajorController {

	@Autowired
	private MajorService majorService;
	@RequestMapping(value="/getMajorList")
	@ResponseBody
	public List<Major> getMajorList(HttpServletRequest request) {
		return majorService.getMajorList();
	}
	@RequestMapping(value="/getOneMajor")
	@ResponseBody
	public Major getOneMajor(Major major) {
		return majorService.getOneMajor(major);
	}
	@RequestMapping(value="/addMajor")
	@ResponseBody
	public void addMajor(Major major) {
		majorService.addMajor(major);
	}
	@RequestMapping(value="/editMajor")
	@ResponseBody
	public void editMajor(Major major) {
		majorService.editMajor(major);
	}
}
