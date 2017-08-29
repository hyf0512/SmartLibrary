package com.smartlibrary.dao;

import com.smartlibrary.domain.Recommend_book_comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Recommend_book_commentDao {
	public abstract List<Recommend_book_comment> getRecommend_book_commentList(Recommend_book_comment recommend_book_comment);
	public abstract Recommend_book_comment getOneRecommend_book_comment(Recommend_book_comment recommend_book_comment);
	public abstract int addRecommend_book_comment(Recommend_book_comment recommend_book_comment);
	public abstract int editRecommend_book_comment(Recommend_book_comment recommend_book_comment);
}
