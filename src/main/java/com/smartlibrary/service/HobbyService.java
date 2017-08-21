package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.HobbyDao;
import com.smartlibrary.domain.Hobby;


@Service
public class HobbyService {

	@Autowired
	private HobbyDao hobbyDao;
	public List<Hobby> getHobbyList(){
		Hobby temp =new Hobby();
		return hobbyDao.getHobbyList(temp);
	}
	public Hobby getOneHobby(Hobby hobby){
		return hobbyDao.getOneHobby(hobby);
	}
	public void addHobby(Hobby hobby){
		hobbyDao.addHobby(hobby);
	}
	public void editHobby(Hobby hobby){
		hobbyDao.editHobby(hobby);
	}
}
