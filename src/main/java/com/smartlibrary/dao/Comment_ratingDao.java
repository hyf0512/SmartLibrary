package com.smartlibrary.dao;

import com.smartlibrary.domain.Comment_rating;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Comment_ratingDao {
	public abstract List<Comment_rating> getComment_ratingList(Comment_rating comment_rating);
	public abstract Comment_rating getOneComment_rating(Comment_rating comment_rating);
	public abstract int addComment_rating(Comment_rating comment_rating);
	public abstract int editComment_rating(Comment_rating comment_rating);
}
