package com.dao;


import java.util.List;
import com.model.Product;

public interface Productdao {
	public boolean save(Product product);
	public boolean update(Product product);
	public boolean delete(String id);
	
	public boolean get(String id);
	public List<Product> list();
}
