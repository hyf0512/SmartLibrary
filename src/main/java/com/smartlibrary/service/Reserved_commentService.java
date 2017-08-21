package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Reserved_commentDao;
import com.smartlibrary.domain.Reserved_comment;


@Service
public class Reserved_commentService {

	@Autowired
	private Reserved_commentDao reserved_commentDao;
	public List<Reserved_comment> getReserved_commentList(){
		Reserved_comment temp =new Reserved_comment();
		return reserved_commentDao.getReserved_commentList(temp);
	}
	public Reserved_comment getOneReserved_comment(Reserved_comment reserved_comment){
		return reserved_commentDao.getOneReserved_comment(reserved_comment);
	}
	public void addReserved_comment(Reserved_comment reserved_comment){
		reserved_commentDao.addReserved_comment(reserved_comment);
	}
	public void editReserved_comment(Reserved_comment reserved_comment){
		reserved_commentDao.editReserved_comment(reserved_comment);
	}
}
