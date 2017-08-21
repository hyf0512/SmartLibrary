package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Hobby;

public interface HobbyDao {
	public abstract List<Hobby> getHobbyList(Hobby hobby);
	public abstract Hobby getOneHobby(Hobby hobby);
	public abstract void addHobby(Hobby hobby);
	public abstract void editHobby(Hobby hobby);
}
