package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Arrears;
import com.smartlibrary.service.ArrearsService;

@Controller
@RequestMapping(value="/arrears")
public class ArrearsController {

	@Autowired
	private ArrearsService arrearsService;
	@RequestMapping(value="/getArrearsList")
	@ResponseBody
	public List<Arrears> getArrearsList(HttpServletRequest request) {
		return arrearsService.getArrearsList();
	}
	@RequestMapping(value="/getOneArrears")
	@ResponseBody
	public Arrears getOneArrears(Arrears arrears) {
		return arrearsService.getOneArrears(arrears);
	}
	@RequestMapping(value="/addArrears")
	@ResponseBody
	public void addArrears(Arrears arrears) {
		arrearsService.addArrears(arrears);
	}
	@RequestMapping(value="/editArrears")
	@ResponseBody
	public void editArrears(Arrears arrears) {
		arrearsService.editArrears(arrears);
	}
}
