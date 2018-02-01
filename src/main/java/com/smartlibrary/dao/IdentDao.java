package com.smartlibrary.dao;

import com.smartlibrary.domain.Ident;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdentDao {
	public abstract List<Ident> getIdentList(Ident ident);
	public abstract Ident getOneIdent(Ident ident);
	public abstract Ident getOneVaildIdent(Ident ident);
	public abstract Ident getOneLogonName(Ident ident);	
	public abstract int addIdent(Ident ident);
	public abstract int editIdent(Ident ident);
	public abstract int editMultiIdent(Ident ident);
}
