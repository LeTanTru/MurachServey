package com.dopamine.model;

import java.util.List;

public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String dateOfBirth;
	private String hearOption;
	private String wantsUpdate;
	private String contactOption;

	public User() {
		super();
	}

	public User(String firstName, String lastName, String email, String dateOfBirth, String hearOption,
			String wantsUpdate, String contactOption) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.hearOption = hearOption;
		this.wantsUpdate = wantsUpdate;
		this.contactOption = contactOption;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHearOption() {
		return hearOption;
	}

	public void setHearOption(String hearOption) {
		this.hearOption = hearOption;
	}

	public String getWantsUpdate() {
		return wantsUpdate;
	}

	public void setWantsUpdate(String wantsUpdate) {
		this.wantsUpdate = wantsUpdate;
	}

	public String getContactOption() {
		return contactOption;
	}

	public void setContactOption(String contactOption) {
		this.contactOption = contactOption;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", dateOfBirth="
				+ dateOfBirth + ", hearOption=" + hearOption + ", wantsUpdate=" + wantsUpdate + ", contactOption="
				+ contactOption + "]";
	}

}
