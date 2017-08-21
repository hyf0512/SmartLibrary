package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Raking;

public interface RakingDao {
	public abstract List<Raking> getRakingList(Raking raking);
	public abstract Raking getOneRaking(Raking raking);
	public abstract void addRaking(Raking raking);
	public abstract void editRaking(Raking raking);
}
