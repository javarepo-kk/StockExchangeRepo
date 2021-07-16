package com.example.stockmarketing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDet {
	
	@Id
	@Column(length = 20)
	private String username;
	
	@Column(length = 25)
	private String password;
	
	@Column(length = 30)
	private String name;
	
	@Column(length = 5)
	private String role;
	
	@Column(length = 60)
	private String email;
	
	@Column(length = 10)
	private String phone;

	private boolean confirmed;


	public UserDet(String username, String password, String name, String role, String email, String phone, boolean confirmed) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.role = role;
		this.email = email;
		this.phone = phone;
		this.confirmed = confirmed;
	}


	public UserDet() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

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

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}


	
	

}
