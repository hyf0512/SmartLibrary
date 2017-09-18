package com.smartlibrary.dao;

import com.smartlibrary.domain.Arrears;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArrearsDao {
	public abstract List<Arrears> getArrearsList(Arrears arrears);
	public abstract List<Arrears> getBooksList(Arrears arrears);
	public abstract Arrears getOneArrears(Arrears arrears);
	public abstract int addArrears(Arrears arrears);
	public abstract int editArrears(Arrears arrears);
}
