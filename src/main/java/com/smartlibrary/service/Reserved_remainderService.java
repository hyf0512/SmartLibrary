package com.smartlibrary.service;


import com.smartlibrary.dao.Reserved_remainderDao;
import com.smartlibrary.domain.Reserved_remainder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Reserved_remainderService {

	@Autowired
	private Reserved_remainderDao reserved_remainderDao;
	public List<Reserved_remainder> getReserved_remainderList(){
		Reserved_remainder temp =new Reserved_remainder();
		return reserved_remainderDao.getReserved_remainderList(temp);
	}
	public Reserved_remainder getOneReserved_remainder(Reserved_remainder reserved_remainder){
		return reserved_remainderDao.getOneReserved_remainder(reserved_remainder);
	}
	public int addReserved_remainder(Reserved_remainder reserved_remainder){
		return reserved_remainderDao.addReserved_remainder(reserved_remainder);
	}
	public int editReserved_remainder(Reserved_remainder reserved_remainder){
		return reserved_remainderDao.editReserved_remainder(reserved_remainder);
	}
}
