package com.smartlibrary.dao;

import com.smartlibrary.domain.Reserved_comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Reserved_commentDao {
	public abstract List<Reserved_comment> getReserved_commentList(Reserved_comment reserved_comment);
	public abstract Reserved_comment getOneReserved_comment(Reserved_comment reserved_comment);
	public abstract int addReserved_comment(Reserved_comment reserved_comment);
	public abstract int editReserved_comment(Reserved_comment reserved_comment);
}
