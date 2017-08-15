package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Book_recommend;

public interface Book_recommendDao {
	public abstract List<Book_recommend> getBook_recommend(Book_recommend book_recommend);
}
