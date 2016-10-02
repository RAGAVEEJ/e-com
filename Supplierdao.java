package com.dao;

import com.model.Supplier;

public interface Supplierdao {

	public boolean save(Supplier supplier);

	public boolean update(Supplier supplier);

	public void delete(String id);

}
