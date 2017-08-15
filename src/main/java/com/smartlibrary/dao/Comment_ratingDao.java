package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Comment_rating;

public interface Comment_ratingDao {
	public abstract List<Comment_rating> getComment_rating(Comment_rating comment_rating);
}
