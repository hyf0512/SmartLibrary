package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Book_comment;

public interface Book_commentDao {
	public abstract List<Book_comment> getBook_comment(Book_comment book_comment);
}
