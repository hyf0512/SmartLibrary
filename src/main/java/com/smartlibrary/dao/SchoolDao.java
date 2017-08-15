package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.School;

public interface SchoolDao {
	public abstract List<School> getSchool(School school);
}
