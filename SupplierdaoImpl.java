package com.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Supplierdao;
import com.model.Category;
import com.model.Supplier;

@Repository
@Transactional
public class SupplierdaoImpl implements Supplierdao {
	@Autowired
	private Supplier supplier;
	@Autowired
	private SessionFactory sessionFactory;

	public SupplierdaoImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}
@Transactional
	public boolean save(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().save(supplier);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
@Transactional
	public boolean update(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
@Transactional
	public void delete(String id) {
	Supplier Suppliertodelete = new Supplier();
	Suppliertodelete.setId(id);
	sessionFactory.getCurrentSession().delete(Suppliertodelete);
}
}
