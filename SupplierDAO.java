package com.niit.shopcart.dao;

import java.util.List;

import com.niit.shopcart.model.Supplier;

public interface SupplierDAO {

   public void saveOrUpdate(Supplier supplier);
	
	public List<Supplier> list();

	public Supplier get(String id);

	public Supplier getByName(String name);

	public boolean delete(String id);
}
