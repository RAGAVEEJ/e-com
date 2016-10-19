package com.niit.shopcart.dao;

import java.util.List;

import com.niit.shopcart.model.Category;

public interface CategoryDAO {

	public boolean delete(String id);

	public void saveOrUpdate(Category category);

	public Category get(String id);

	public Category getByName(String name);

	public List<Category> list();
}
