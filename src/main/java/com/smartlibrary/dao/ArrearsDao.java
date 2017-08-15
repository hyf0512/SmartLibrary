package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Arrears;

public interface ArrearsDao {
	public abstract List<Arrears> getArrears(Arrears arrears);
}
