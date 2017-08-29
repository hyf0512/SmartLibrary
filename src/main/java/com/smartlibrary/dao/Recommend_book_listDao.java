package com.smartlibrary.dao;

import com.smartlibrary.domain.Recommend_book_list;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Recommend_book_listDao {
	public abstract List<Recommend_book_list> getRecommend_book_listList(Recommend_book_list recommend_book_list);
	public abstract Recommend_book_list getOneRecommend_book_list(Recommend_book_list recommend_book_list);
	public abstract int addRecommend_book_list(Recommend_book_list recommend_book_list);
	public abstract int editRecommend_book_list(Recommend_book_list recommend_book_list);
}
