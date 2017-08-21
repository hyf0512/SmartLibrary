package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Book_recommendDao;
import com.smartlibrary.domain.Book_recommend;


@Service
public class Book_recommendService {

	@Autowired
	private Book_recommendDao book_recommendDao;
	public List<Book_recommend> getBook_recommendList(){
		Book_recommend temp =new Book_recommend();
		return book_recommendDao.getBook_recommendList(temp);
	}
	public Book_recommend getOneBook_recommend(Book_recommend book_recommend){
		return book_recommendDao.getOneBook_recommend(book_recommend);
	}
	public void addBook_recommend(Book_recommend book_recommend){
		book_recommendDao.addBook_recommend(book_recommend);
	}
	public void editBook_recommend(Book_recommend book_recommend){
		book_recommendDao.editBook_recommend(book_recommend);
	}
}
