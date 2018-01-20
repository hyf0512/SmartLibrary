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
	public Ident getOneLogonName(Ident ident){
		return identDao.getOneLogonName(ident);
	}
	public int addIdent(Ident ident){
		if (identDao.getOneIdent(ident) == null) {
			if (identDao.getOneLogonName(ident) == null) {
				return identDao.addIdent(ident);
			} else {
				return 2;
			}
		} else {
			if (identDao.getOneLogonName(ident) == null) {
				return identDao.editIdent(ident);
			} else {
				if(identDao.getOneIdent(ident).getSzLogonName().equals(ident.getSzLogonName())) {
					return identDao.editIdent(ident);
				} else {
					return 2;
				}
			}
		}
	}
	public int editIdent(Ident ident){
		return identDao.editIdent(ident);
	}
}
