package com.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.Supplierdao;

import com.model.Supplier;

@Repository
public class SupplierdaoImpl  implements Supplierdao
{
	@Autowired
	private Supplier supplier;
	@Autowired
	private SessionFactory sessionFactory;
	 
	
	public SupplierdaoImpl(SessionFactory sessionFactory) 
	{
		
		this.sessionFactory = sessionFactory;
	}
	public boolean save(Supplier supplier) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(supplier);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
		
	public boolean update(Supplier supplier) 
	{
		try
		{
			sessionFactory.getCurrentSession().update(supplier);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean delete(String id) {
		try
		{
			sessionFactory.getCurrentSession().delete(supplier);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
