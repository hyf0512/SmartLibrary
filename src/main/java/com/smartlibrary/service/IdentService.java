package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.IdentDao;
import com.smartlibrary.domain.Ident;


@Service
public class IdentService {

	@Autowired
	private IdentDao identDao;
	public List<Ident> getIdentList(){
		Ident temp =new Ident();
		return identDao.getIdentList(temp);
	}
	public Ident getOneIdent(Ident ident){
		return identDao.getOneIdent(ident);
	}
	public void addIdent(Ident ident){
		identDao.addIdent(ident);
	}
	public void editIdent(Ident ident){
		identDao.editIdent(ident);
	}
}
