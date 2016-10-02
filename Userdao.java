package com.dao;

import java.util.*;

import com.model.Category;
import com.model.Register;

public interface Userdao {
	public boolean save(Register register);
   public boolean update(Register register);
    public boolean delete(String id);
	
    
    public Register get(String id);

	public List<Register> list();
	public Register isValidUser(String id, String password);
}
