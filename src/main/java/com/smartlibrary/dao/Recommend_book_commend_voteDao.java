package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Recommend_book_commend_vote;

public interface Recommend_book_commend_voteDao {
	public abstract List<Recommend_book_commend_vote> getRecommend_book_commend_voteList(Recommend_book_commend_vote recommend_book_commend_vote);
	public abstract Recommend_book_commend_vote getOneRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote);
	public abstract void addRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote);
	public abstract void editRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote);
}
