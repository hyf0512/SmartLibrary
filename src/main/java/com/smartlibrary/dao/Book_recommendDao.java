package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Book_recommend;

public interface Book_recommendDao {
	public abstract List<Book_recommend> getBook_recommendList(Book_recommend book_recommend);
	public abstract Book_recommend getOneBook_recommend(Book_recommend book_recommend);
	public abstract void addBook_recommend(Book_recommend book_recommend);
	public abstract void editBook_recommend(Book_recommend book_recommend);
}
