package com.example.demo;

import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	public String id;

	private String firstName;
	private String lastName;

	public Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%s, firstName='%s', lastName='%s']", id, getFirstName(), getLastName());
	}

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

}
