package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.College;

public interface CollegeDao {
	public abstract List<College> getCollegeList(College college);
	public abstract College getOneCollege(College college);
	public abstract void addCollege(College college);
	public abstract void editCollege(College college);
}
