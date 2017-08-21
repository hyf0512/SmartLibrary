package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Recommend_book_comment;

public interface Recommend_book_commentDao {
	public abstract List<Recommend_book_comment> getRecommend_book_commentList(Recommend_book_comment recommend_book_comment);
	public abstract Recommend_book_comment getOneRecommend_book_comment(Recommend_book_comment recommend_book_comment);
	public abstract void addRecommend_book_comment(Recommend_book_comment recommend_book_comment);
	public abstract void editRecommend_book_comment(Recommend_book_comment recommend_book_comment);
}
