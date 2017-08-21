package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Comment_rating;

public interface Comment_ratingDao {
	public abstract List<Comment_rating> getComment_ratingList(Comment_rating comment_rating);
	public abstract Comment_rating getOneComment_rating(Comment_rating comment_rating);
	public abstract void addComment_rating(Comment_rating comment_rating);
	public abstract void editComment_rating(Comment_rating comment_rating);
}
