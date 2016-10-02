package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Userdao;
import com.model.Register;

@Repository
public class Userdaoimpl implements Userdao {

	@Autowired
	private Register register;
	@Autowired
	private SessionFactory sessionFactory;

	public Userdaoimpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean save(Register register) {
		try {
			sessionFactory.getCurrentSession().save(register);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public boolean update(Register register) {

		try {
			sessionFactory.getCurrentSession().update(register);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public boolean delete(String id) {
		Register Registertodelete = new Register();
		Registertodelete.setId(id);
		try {
			sessionFactory.getCurrentSession().delete(Registertodelete);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Register get(String id) {
		String hql = "from RegisterModel where id=" + "'" + id + "'";
		return getRegister(hql);

	}

	@Transactional
	public List<Register> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Register isValidUser(String id, String password) {
		String hql = "from Register where id=" + "'" + id + "'" + "and" + "password = " + "'" + password + "'";
		return getRegister(hql);
	}

	private Register getRegister(String hql) {
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Register> list = (List<Register>) query.list();
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

}
