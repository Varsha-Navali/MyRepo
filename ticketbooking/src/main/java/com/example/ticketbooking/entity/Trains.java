package com.example.ticketbooking.entity;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trains")
public class Trains {

	@Id
	@Column(name="train_Id")
	private Integer trainId;
	@Column(name="trainno")
    private Integer trainno;
	@Column(name="trainname")
	private String trainname;
	@Column(name="fare")
	private Integer fare;
	@Column(name="total_seats")
	private Integer totalSeats;
	@Column(name="seats_available")
	private Integer seatsAvailable;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return trainId;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer trainId) {
		this.trainId = trainId;
	}
	/**
	 * @return the trainno
	 */
	public Integer getTrainno() {
		return trainno;
	}
	/**
	 * @param trainno the trainno to set
	 */
	public void setTrainno(Integer trainno) {
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
	public Integer getFare() {
		return fare;
	}
	/**
	 * @param fare the fare to set
	 */
	public void setFare(Integer fare) {
		this.fare = fare;
	}
	/**
	 * @return the totalSeats
	 */
	public Integer getTotalSeats() {
		return totalSeats;
	}
	/**
	 * @param totalSeats the totalSeats to set
	 */
	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}
	/**
	 * @return the seatsAvailable
	 */
	public Integer getSeatsAvailable() {
		return seatsAvailable;
	}
	/**
	 * @param seatsAvailable the seatsAvailable to set
	 */
	public void setSeatsAvailable(Integer seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	
}
