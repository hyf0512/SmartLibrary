package com.smartlibrary.service;


import com.smartlibrary.dao.Recommend_book_listDao;
import com.smartlibrary.domain.Recommend_book_list;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Recommend_book_listService {

	@Autowired
	private Recommend_book_listDao recommend_book_listDao;
	public List<Recommend_book_list> getRecommend_book_listList(){
		Recommend_book_list temp =new Recommend_book_list();
		return recommend_book_listDao.getRecommend_book_listList(temp);
	}
	public Recommend_book_list getOneRecommend_book_list(Recommend_book_list recommend_book_list){
		return recommend_book_listDao.getOneRecommend_book_list(recommend_book_list);
	}
	public int addRecommend_book_list(Recommend_book_list recommend_book_list){
		return recommend_book_listDao.addRecommend_book_list(recommend_book_list);
	}
	public int editRecommend_book_list(Recommend_book_list recommend_book_list){
		return recommend_book_listDao.editRecommend_book_list(recommend_book_list);
	}
}
