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
	public List<Ident> getIdentList(Ident ident){
		return identDao.getIdentList(ident);
	}
	public Ident getOneVaildIdent(Ident ident){
		return identDao.getOneVaildIdent(ident);
	}
	public int addIdent(Ident ident){
		if (identDao.getOneLogonName(ident) == null) {
			return identDao.addIdent(ident);
		} else {
			if (identDao.getOneIdent(ident) == null) {
				return 2;
			} else {
				identDao.editMultiIdent(ident);
				return identDao.editIdent(ident);
			}
		}
	}
	public int editIdent(Ident ident){
		identDao.editMultiIdent(ident);
		return identDao.editIdent(ident);
	}
	
}
