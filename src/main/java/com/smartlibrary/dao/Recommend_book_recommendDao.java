package com.smartlibrary.dao;

import com.smartlibrary.domain.Recommend_book_recommend;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Recommend_book_recommendDao {
	public abstract List<Recommend_book_recommend> getRecommend_book_recommendList(Recommend_book_recommend recommend_book_recommend);
	public abstract Recommend_book_recommend getOneRecommend_book_recommend(Recommend_book_recommend recommend_book_recommend);
	public abstract int addRecommend_book_recommend(Recommend_book_recommend recommend_book_recommend);
	public abstract int editRecommend_book_recommend(Recommend_book_recommend recommend_book_recommend);
}
