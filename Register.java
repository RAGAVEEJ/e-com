package com.model;
import org.hibernate.validator.constraints.*;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="UserDetails")
@Component
public class Register 
{
	@Id
	private String userid;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String email;
	private String phone;
	private String address;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	@NotEmpty(message="Please enter first name")
	@Length(max=20)
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	@NotEmpty(message="Please enter last name")
	@Length(max=10)
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	@NotEmpty(message="Please enter username")
	@Length(max=10)
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	@NotEmpty(message="Please enter password")
	@Length(max=7)
	public void setPassword(String password) {
		this.password = password;
	}
	@Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
 	
}
