package com.example.ticketbooking.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PassangerDto {

	@NotEmpty
	private String source;

	@NotEmpty
	private String destination;

	@NotEmpty
	private String date;

	@NotEmpty
	@Size(min = 2, max = 15)
	private String passangername;

	@NotEmpty
	private int age;

	@NotEmpty
	private String gender;

	@Email
	private String email;

	@NotEmpty
	private String phone;

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the passangername
	 */
	public String getPassangername() {
		return passangername;
	}

	/**
	 * @param passangername the passangername to set
	 */
	public void setPassangername(String passangername) {
		this.passangername = passangername;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PassangerDto [source=" + source + ", destination=" + destination + ", date=" + date + ", passangername="
				+ passangername + ", age=" + age + ", gender=" + gender + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
}
