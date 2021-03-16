package com.example.ticketbooking.dto;

import javax.validation.constraints.NotEmpty;

public class TrainsDto {


	@NotEmpty(message="This field cannot be empty")
    private String source;
	
	@NotEmpty(message ="This field is mandatory")
	private String destination;
	
	@NotEmpty(message="Please enter your Travel Date")
	private String date;

	
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

}
