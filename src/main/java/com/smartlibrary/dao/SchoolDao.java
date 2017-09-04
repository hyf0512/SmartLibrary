package com.smartlibrary.dao;

import com.smartlibrary.domain.School;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolDao {
	public abstract List<School> getSchoolList(School school);
	public abstract School getOneSchool(School school);
	public abstract int addSchool(School school);
	public abstract int editSchool(School school);
	public abstract String getAd_url(School school);
}
