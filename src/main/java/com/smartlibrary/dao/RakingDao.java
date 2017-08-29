package com.smartlibrary.dao;

import com.smartlibrary.domain.Raking;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RakingDao {
	public abstract List<Raking> getRakingList(Raking raking);
	public abstract Raking getOneRaking(Raking raking);
	public abstract int addRaking(Raking raking);
	public abstract int editRaking(Raking raking);
}
