package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Recommend_book_recommend;

public interface Recommend_book_recommendDao {
	public abstract List<Recommend_book_recommend> getRecommend_book_recommendList(Recommend_book_recommend recommend_book_recommend);
	public abstract Recommend_book_recommend getOneRecommend_book_recommend(Recommend_book_recommend recommend_book_recommend);
	public abstract void addRecommend_book_recommend(Recommend_book_recommend recommend_book_recommend);
	public abstract void editRecommend_book_recommend(Recommend_book_recommend recommend_book_recommend);
}
