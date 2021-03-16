package com.example.ticketbooking.dto;

import java.sql.Timestamp;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class RequestDto {

	private Long id;

	@NotEmpty
    private String passangername;
	
	@NotEmpty
	@Size(min=6)
	private int age;
	
	@NotEmpty
	private String gender;
	
	private String trainname;
	
	private double trainno;
	
	private Timestamp date;
	
	private double fare;
	
	private String source;
	
	private String destination;

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
	 * @return the trainno
	 */
	public double getTrainno() {
		return trainno;
	}

	/**
	 * @param trainno the trainno to set
	 */
	public void setTrainno(double trainno) {
		this.trainno = trainno;
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
	 * @return the fare
	 */
	public double getFare() {
		return fare;
	}

	/**
	 * @param fare the fare to set
	 */
	public void setFare(double fare) {
		this.fare = fare;
	}

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
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

	
	
}
