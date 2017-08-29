package com.smartlibrary.service;


import com.smartlibrary.dao.IdentDao;
import com.smartlibrary.domain.Ident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
	public int addIdent(Ident ident){
		return identDao.addIdent(ident);
	}
	public int editIdent(Ident ident){
		return identDao.editIdent(ident);
	}
}
