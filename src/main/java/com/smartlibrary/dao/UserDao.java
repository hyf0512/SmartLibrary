package com.smartlibrary.dao;

import com.smartlibrary.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
	public abstract List<User> getUserList(User user);
	public abstract User getOneUser(User user);
	public abstract int addUser(User user);
	public abstract int editUser(User user);
	public abstract int editNickname(User user);
	//public abstract int editSex(User user);
	public abstract int editHobbyId(User user);
	public abstract int editPhotoUrl(User user);
}