package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Recommend_book_recommendDao;
import com.smartlibrary.domain.Recommend_book_recommend;


@Service
public class Recommend_book_recommendService {

	@Autowired
	private Recommend_book_recommendDao recommend_book_recommendDao;
	public List<Recommend_book_recommend> getRecommend_book_recommendList(){
		Recommend_book_recommend temp =new Recommend_book_recommend();
		return recommend_book_recommendDao.getRecommend_book_recommendList(temp);
	}
	public Recommend_book_recommend getOneRecommend_book_recommend(Recommend_book_recommend recommend_book_recommend){
		return recommend_book_recommendDao.getOneRecommend_book_recommend(recommend_book_recommend);
	}
	public void addRecommend_book_recommend(Recommend_book_recommend recommend_book_recommend){
		recommend_book_recommendDao.addRecommend_book_recommend(recommend_book_recommend);
	}
	public void editRecommend_book_recommend(Recommend_book_recommend recommend_book_recommend){
		recommend_book_recommendDao.editRecommend_book_recommend(recommend_book_recommend);
	}
}
