package com.example.ticketbooking.dto;

import java.sql.Timestamp;

public class TrainResponse {

    private String source;
	
	private String destination;
	
	private Timestamp date;
	
    private Double trainno;
	
	private String trainname;
	
	private Double fare;

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

	/**
	 * @return the trainno
	 */
	public Double getTrainno() {
		return trainno;
	}

	/**
	 * @param trainno the trainno to set
	 */
	public void setTrainno(Double trainno) {
		this.trainno = trainno;
	}

	/**
	 * @return the trainname
	 */
	public String getTrainname() {
		return trainname;
	}

	/**
	 * @param trainname the trainname to set
	 */
	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}

	/**
	 * @return the fare
	 */
	public Double getFare() {
		return fare;
	}

	/**
	 * @param fare the fare to set
	 */
	public void setFare(Double fare) {
		this.fare = fare;
	}
	
	
}
