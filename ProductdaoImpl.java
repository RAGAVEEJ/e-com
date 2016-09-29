package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Productdao;

import com.model.Product;

@Repository
@Transactional
public class ProductdaoImpl implements Productdao {

	@Autowired
	private Product product;
	@Autowired
	private SessionFactory sessionFactory;

	public ProductdaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
@Transactional
	public boolean save(Product product) {
		try {
			sessionFactory.getCurrentSession().save(product);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}
@Transactional
	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}
@Transactional
	public boolean delete(String id) {
		try {
			sessionFactory.getCurrentSession().delete(get(id));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}
@Transactional
	public Product get(String id) {
		String hql = "from  where id = ' " + id + "'";
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> list = (List<Product>) query;
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	public List<Product> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
