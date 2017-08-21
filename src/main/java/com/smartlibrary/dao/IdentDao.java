package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Ident;

public interface IdentDao {
	public abstract List<Ident> getIdentList(Ident ident);
	public abstract Ident getOneIdent(Ident ident);
	public abstract void addIdent(Ident ident);
	public abstract void editIdent(Ident ident);
}
