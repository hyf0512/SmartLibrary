package com.smartlibrary.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.Comment_ratingDao;
import com.smartlibrary.domain.Comment_rating;


@Service
public class Comment_ratingService {

	@Autowired
	private Comment_ratingDao comment_ratingDao;
	public List<Comment_rating> getComment_ratingList(){
		Comment_rating temp =new Comment_rating();
		return comment_ratingDao.getComment_ratingList(temp);
	}
	public Comment_rating getOneComment_rating(Comment_rating comment_rating){
		return comment_ratingDao.getOneComment_rating(comment_rating);
	}
	public int addComment_rating(Comment_rating comment_rating){
		return comment_ratingDao.addComment_rating(comment_rating);
	}
	public int editComment_rating(Comment_rating comment_rating){
		return comment_ratingDao.editComment_rating(comment_rating);
	}
}
