package com.smartlibrary.service;


import com.smartlibrary.dao.Book_recommendDao;
import com.smartlibrary.domain.Book_recommend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
	public int addBook_recommend(Book_recommend book_recommend){
		return book_recommendDao.addBook_recommend(book_recommend);
	}
	public int editBook_recommend(Book_recommend book_recommend){
		return book_recommendDao.editBook_recommend(book_recommend);
	}
}
