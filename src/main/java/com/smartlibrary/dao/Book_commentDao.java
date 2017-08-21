package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Book_comment;

public interface Book_commentDao {
	public abstract List<Book_comment> getBook_commentList(Book_comment book_comment);
	public abstract Book_comment getOneBook_comment(Book_comment book_comment);
	public abstract void addBook_comment(Book_comment book_comment);
	public abstract void editBook_comment(Book_comment book_comment);
}
