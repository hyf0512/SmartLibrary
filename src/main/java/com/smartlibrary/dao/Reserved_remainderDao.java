package com.smartlibrary.dao;

import com.smartlibrary.domain.Reserved_remainder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Reserved_remainderDao {
	public abstract List<Reserved_remainder> getReserved_remainderList(Reserved_remainder reserved_remainder);
	public abstract Reserved_remainder getOneReserved_remainder(Reserved_remainder reserved_remainder);
	public abstract int addReserved_remainder(Reserved_remainder reserved_remainder);
	public abstract int editReserved_remainder(Reserved_remainder reserved_remainder);
}
