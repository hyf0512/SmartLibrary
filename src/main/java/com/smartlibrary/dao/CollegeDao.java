package com.smartlibrary.dao;

import com.smartlibrary.domain.College;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollegeDao {
	public abstract List<College> getCollegeList(College college);
	public abstract College getOneCollege(College college);
	public abstract int addCollege(College college);
	public abstract int editCollege(College college);
}
