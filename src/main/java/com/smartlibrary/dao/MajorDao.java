package com.smartlibrary.dao;

import com.smartlibrary.domain.Major;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MajorDao {
	public abstract List<Major> getMajorList(Major major);
	public abstract Major getOneMajor(Major major);
	public abstract int addMajor(Major major);
	public abstract int editMajor(Major major);
}
