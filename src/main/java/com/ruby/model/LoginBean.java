package com.ruby.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginBean {
	@NotEmpty
	@Size(min=5,max=20)
	private String name;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	@Size(min=3,max=7)
private String password;
	@NotEmpty
	@Size(min=3,max=7)
private String confirmPassword;
	
	public LoginBean() {
	}
	public LoginBean(String password, String confirmPassword) {
		super();
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public LoginBean( String password, String confirmPassword, String name, String email) {
		super();
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.name = name;
		this.email = email;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	
	public String getEmail() {
		return email;
	}
public String getName() {
	return name;
}
public String getPassword() {
	return password;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}
public void setEmail(String email) {
	this.email = email;
}
public void setName(String name) {
	this.name = name;
}
public void setPassword(String password) {
	this.password = password;
}
}
