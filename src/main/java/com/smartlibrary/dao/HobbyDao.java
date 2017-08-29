package com.smartlibrary.dao;

import com.smartlibrary.domain.Hobby;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HobbyDao {
	public abstract List<Hobby> getHobbyList(Hobby hobby);
	public abstract Hobby getOneHobby(Hobby hobby);
	public abstract int addHobby(Hobby hobby);
	public abstract int editHobby(Hobby hobby);
}
