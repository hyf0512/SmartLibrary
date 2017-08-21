package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Raking;
import com.smartlibrary.service.RakingService;

@Controller
@RequestMapping(value="/raking")
public class RakingController {

	@Autowired
	private RakingService rakingService;
	@RequestMapping(value="/getRakingList")
	@ResponseBody
	public List<Raking> getRakingList(HttpServletRequest request) {
		return rakingService.getRakingList();
	}
	@RequestMapping(value="/getOneRaking")
	@ResponseBody
	public Raking getOneRaking(Raking raking) {
		return rakingService.getOneRaking(raking);
	}
	@RequestMapping(value="/addRaking")
	@ResponseBody
	public void addRaking(Raking raking) {
		rakingService.addRaking(raking);
	}
	@RequestMapping(value="/editRaking")
	@ResponseBody
	public void editRaking(Raking raking) {
		rakingService.editRaking(raking);
	}
}
