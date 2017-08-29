package com.smartlibrary.dao;

import com.smartlibrary.domain.Recommend_book_commend_vote;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Recommend_book_commend_voteDao {
	public abstract List<Recommend_book_commend_vote> getRecommend_book_commend_voteList(Recommend_book_commend_vote recommend_book_commend_vote);
	public abstract Recommend_book_commend_vote getOneRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote);
	public abstract int addRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote);
	public abstract int editRecommend_book_commend_vote(Recommend_book_commend_vote recommend_book_commend_vote);
}
