package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Ident;

public interface IdentDao {
	public abstract List<Ident> getIdent(Ident ident);
}
