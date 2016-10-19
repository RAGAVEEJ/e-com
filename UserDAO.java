package com.niit.shopcart.dao;

import java.util.List;

import com.niit.shopcart.model.UserDetails;

public interface UserDAO {
public boolean save(UserDetails userDetails);
	
	public boolean update(UserDetails userDetails);
		
		public boolean delete(UserDetails userDetails);
		
		
		public List<UserDetails> list();
				
		public UserDetails isValidUser(String username, String password);

		public UserDetails get(String username);

	
}
