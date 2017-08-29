package com.smartlibrary.service;


import com.smartlibrary.dao.Recommend_book_commend_voteDao;
import com.smartlibrary.domain.Recommend_book_commend_vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Recommend_book_commend_voteService {

	@Autowired
	private Recommend_book_commend_voteDao recommend_book_commend_voteDao;
	public List<Recommend_book_commend_vote> getRecommend_book_commend_voteList(){
		Recommend_book_commend_vote temp =new Recommend_book_commend_vote();
		return recommend_book_commend_voteDao.getRecommend_book_commend_voteList(temp);
	}
	public Recommend_book_commend_vote getOneRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote){
		return recommend_book_commend_voteDao.getOneRecommend_book_commend_vote(recommend_book_commend_vote);
	}
	public int addRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote){
		return recommend_book_commend_voteDao.addRecommend_book_commend_vote(recommend_book_commend_vote);
	}
	public int editRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote){
		return recommend_book_commend_voteDao.editRecommend_book_commend_vote(recommend_book_commend_vote);
	}
}
