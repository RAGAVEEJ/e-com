package com.dao;

import java.util.List;
import com.model.Product;

public interface Productdao {

	public boolean save(Product product);

	public boolean update(Product product);

	public void delete(String id);

	public Product get(String id);

	public List<Product> list();
}
