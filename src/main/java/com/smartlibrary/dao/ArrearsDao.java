package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Arrears;

public interface ArrearsDao {
	public abstract List<Arrears> getArrearsList(Arrears arrears);
	public abstract Arrears getOneArrears(Arrears arrears);
	public abstract void addArrears(Arrears arrears);
	public abstract void editArrears(Arrears arrears);
}
