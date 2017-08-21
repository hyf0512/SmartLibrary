package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Recommend_book_list;

public interface Recommend_book_listDao {
	public abstract List<Recommend_book_list> getRecommend_book_listList(Recommend_book_list recommend_book_list);
	public abstract Recommend_book_list getOneRecommend_book_list(Recommend_book_list recommend_book_list);
	public abstract void addRecommend_book_list(Recommend_book_list recommend_book_list);
	public abstract void editRecommend_book_list(Recommend_book_list recommend_book_list);
}
