package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Recommend_book_commentDao;
import com.smartlibrary.domain.Recommend_book_comment;


@Service
public class Recommend_book_commentService {

	@Autowired
	private Recommend_book_commentDao recommend_book_commentDao;
	public List<Recommend_book_comment> getRecommend_book_commentList(){
		Recommend_book_comment temp =new Recommend_book_comment();
		return recommend_book_commentDao.getRecommend_book_commentList(temp);
	}
	public Recommend_book_comment getOneRecommend_book_comment(Recommend_book_comment recommend_book_comment){
		return recommend_book_commentDao.getOneRecommend_book_comment(recommend_book_comment);
	}
	public void addRecommend_book_comment(Recommend_book_comment recommend_book_comment){
		recommend_book_commentDao.addRecommend_book_comment(recommend_book_comment);
	}
	public void editRecommend_book_comment(Recommend_book_comment recommend_book_comment){
		recommend_book_commentDao.editRecommend_book_comment(recommend_book_comment);
	}
}
