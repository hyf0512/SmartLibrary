package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Hobby;

public interface HobbyDao {
	public abstract List<Hobby> getHobby(Hobby hobby);
}
