package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Ident;
import com.smartlibrary.service.IdentService;

@Controller
@RequestMapping(value="/ident")
public class IdentController {

	@Autowired
	private IdentService identService;
	@RequestMapping(value="/getIdentList")
	@ResponseBody
	public List<Ident> getIdentList(HttpServletRequest request) {
		return identService.getIdentList();
	}
	@RequestMapping(value="/getOneIdent")
	@ResponseBody
	public Ident getOneIdent(Ident ident) {
		return identService.getOneIdent(ident);
	}
	@RequestMapping(value="/addIdent")
	@ResponseBody
	public void addIdent(Ident ident) {
		identService.addIdent(ident);
	}
	@RequestMapping(value="/editIdent")
	@ResponseBody
	public void editIdent(Ident ident) {
		identService.editIdent(ident);
	}
}
