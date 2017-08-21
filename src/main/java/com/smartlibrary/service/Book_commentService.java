package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Book_commentDao;
import com.smartlibrary.domain.Book_comment;
import com.smartlibrary.domain.Book_comment;


@Service
public class Book_commentService {

	@Autowired
	private Book_commentDao book_commentDao;
	public List<Book_comment> getBook_commentList(){
		Book_comment temp =new Book_comment();
		return book_commentDao.getBook_commentList(temp);
	}
	public Book_comment getOneBook_comment(Book_comment book_comment){
		return book_commentDao.getOneBook_comment(book_comment);
	}
	public void addBook_comment(Book_comment book_comment){
		book_commentDao.addBook_comment(book_comment);
	}
	public void editBook_comment(Book_comment book_comment){
		book_commentDao.editBook_comment(book_comment);
	}
}
