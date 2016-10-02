package com.dao;

import java.util.List;
import com.model.Category;

public interface Categorydao {

	public boolean save(Category category);

	public boolean update(Category category);

	public void delete(String id);

	public Category get(String id);

	public List<Category> list();
}
