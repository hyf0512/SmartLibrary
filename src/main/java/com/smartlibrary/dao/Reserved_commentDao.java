package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Reserved_comment;

public interface Reserved_commentDao {
	public abstract List<Reserved_comment> getReserved_commentList(Reserved_comment reserved_comment);
	public abstract Reserved_comment getOneReserved_comment(Reserved_comment reserved_comment);
	public abstract void addReserved_comment(Reserved_comment reserved_comment);
	public abstract void editReserved_comment(Reserved_comment reserved_comment);
}
