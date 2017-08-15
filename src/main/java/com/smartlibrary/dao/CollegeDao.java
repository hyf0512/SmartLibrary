package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.College;

public interface CollegeDao {
	public abstract List<College> getCollege(College college);
}
