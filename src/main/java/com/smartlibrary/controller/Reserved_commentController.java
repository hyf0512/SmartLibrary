package com.smartlibrary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartlibrary.domain.Reserved_comment;
import com.smartlibrary.service.Reserved_commentService;

@Controller
@RequestMapping(value="/reserved_comment")
public class Reserved_commentController {

	@Autowired
	private Reserved_commentService reserved_commentService;
	@RequestMapping(value="/getReserved_commentList")
	@ResponseBody
	public List<Reserved_comment> getReserved_commentList(HttpServletRequest request) {
		return reserved_commentService.getReserved_commentList();
	}
	@RequestMapping(value="/getOneReserved_comment")
	@ResponseBody
	public Reserved_comment getOneReserved_comment(Reserved_comment reserved_comment) {
		return reserved_commentService.getOneReserved_comment(reserved_comment);
	}
	@RequestMapping(value="/addReserved_comment")
	@ResponseBody
	public void addReserved_comment(Reserved_comment reserved_comment) {
		reserved_commentService.addReserved_comment(reserved_comment);
	}
	@RequestMapping(value="/editReserved_comment")
	@ResponseBody
	public void editReserved_comment(Reserved_comment reserved_comment) {
		reserved_commentService.editReserved_comment(reserved_comment);
	}
}
