package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Major;

public interface MajorDao {
	public abstract List<Major> getMajorList(Major major);
	public abstract Major getOneMajor(Major major);
	public abstract void addMajor(Major major);
	public abstract void editMajor(Major major);
}
