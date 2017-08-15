package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Major;

public interface MajorDao {
	public abstract List<Major> getMajor(Major major);
}
