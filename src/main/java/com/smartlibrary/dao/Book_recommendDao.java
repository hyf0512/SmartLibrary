package com.smartlibrary.dao;

import com.smartlibrary.domain.Book_recommend;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Book_recommendDao {
	public abstract List<Book_recommend> getBook_recommendList(Book_recommend book_recommend);
	public abstract Book_recommend getOneBook_recommend(Book_recommend book_recommend);
	public abstract int addBook_recommend(Book_recommend book_recommend);
	public abstract int editBook_recommend(Book_recommend book_recommend);
}
