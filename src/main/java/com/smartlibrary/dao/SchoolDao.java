package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.School;

public interface SchoolDao {
	public abstract List<School> getSchoolList(School school);
	public abstract School getOneSchool(School school);
	public abstract void addSchool(School school);
	public abstract void editSchool(School school);
}
