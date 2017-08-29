package com.smartlibrary.dao;

import com.smartlibrary.domain.Book_comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Book_commentDao {
	public abstract List<Book_comment> getBook_commentList(Book_comment book_comment);
	public abstract Book_comment getOneBook_comment(Book_comment book_comment);
	public abstract int addBook_comment(Book_comment book_comment);
	public abstract int editBook_comment(Book_comment book_comment);
}
