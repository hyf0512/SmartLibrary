package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Reserved_remainder;
import com.smartlibrary.service.Reserved_remainderService;

@Controller
@RequestMapping(value="/reserved_remainder")
public class Reserved_remainderController {

	@Autowired
	private Reserved_remainderService reserved_remainderService;
	@RequestMapping(value="/getReserved_remainderList")
	@ResponseBody
	public List<Reserved_remainder> getReserved_remainderList(HttpServletRequest request) {
		return reserved_remainderService.getReserved_remainderList();
	}
	@RequestMapping(value="/getOneReserved_remainder")
	@ResponseBody
	public Reserved_remainder getOneReserved_remainder(Reserved_remainder reserved_remainder) {
		return reserved_remainderService.getOneReserved_remainder(reserved_remainder);
	}
	@RequestMapping(value="/addReserved_remainder")
	@ResponseBody
	public void addReserved_remainder(Reserved_remainder reserved_remainder) {
		reserved_remainderService.addReserved_remainder(reserved_remainder);
	}
	@RequestMapping(value="/editReserved_remainder")
	@ResponseBody
	public void editReserved_remainder(Reserved_remainder reserved_remainder) {
		reserved_remainderService.editReserved_remainder(reserved_remainder);
	}
}
