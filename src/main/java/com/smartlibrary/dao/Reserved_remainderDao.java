package com.smartlibrary.dao;

import java.util.List;

import com.smartlibrary.domain.Reserved_remainder;

public interface Reserved_remainderDao {
	public abstract List<Reserved_remainder> getReserved_remainderList(Reserved_remainder reserved_remainder);
	public abstract Reserved_remainder getOneReserved_remainder(Reserved_remainder reserved_remainder);
	public abstract void addReserved_remainder(Reserved_remainder reserved_remainder);
	public abstract void editReserved_remainder(Reserved_remainder reserved_remainder);
}
