package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Hobby;
import com.smartlibrary.service.HobbyService;

@Controller
@RequestMapping(value="/hobby")
public class HobbyController {

	@Autowired
	private HobbyService hobbyService;
	@RequestMapping(value="/getHobbyList")
	@ResponseBody
	public List<Hobby> getHobbyList(HttpServletRequest request) {
		return hobbyService.getHobbyList();
	}
	@RequestMapping(value="/getOneHobby")
	@ResponseBody
	public Hobby getOneHobby(Hobby hobby) {
		return hobbyService.getOneHobby(hobby);
	}
	@RequestMapping(value="/addHobby")
	@ResponseBody
	public void addHobby(Hobby hobby) {
		hobbyService.addHobby(hobby);
	}
	@RequestMapping(value="/editHobby")
	@ResponseBody
	public void editHobby(Hobby hobby) {
		hobbyService.editHobby(hobby);
	}
}
