package com.niit.shopcart.dao;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.niit.shopcart.model.Product;

public interface ProductDAO {
	
	public List<Product> list();

	public Product get(String id);

	public void saveOrUpdate(Product product);

	public boolean delete(String id);

	/*public MultipartFile getImage();*/
}
