package com.eqarus.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRequest {
	@NotNull(message = "Provide the first name")
	private String firstName;
	
	@NotNull(message = "last name is not good")
	private String lastName;
	
	@NotNull(message = "email is improper")
	@Email
	private String email;
	
	@NotNull(message = "password is not proper")
	@Size(min = 8, max = 16, message = "password must be equal or greater than 8")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
