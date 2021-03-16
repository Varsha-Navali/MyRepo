package com.example.trainticketbooking.dto;

import java.sql.Timestamp;

import javax.validation.constraints.NotEmpty;

public class TrainsDtoResponse {

	@NotEmpty(message="This field cannot be empty")
    private String source;
	
	@NotEmpty(message ="This field is mandatory")
	private String destination;
	
	@NotEmpty(message="Please enter your Travel Date")
	private Timestamp date;

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
	public Timestamp getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	
}
