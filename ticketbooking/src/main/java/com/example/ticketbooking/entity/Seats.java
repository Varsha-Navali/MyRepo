package com.example.ticketbooking.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seats")
public class Seats {

	@Id
	@Column(name = "seat_id")
	private Integer seatId;
	@Column(name = "passangername")
	private String passangername;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "berth")
	private String berth;
	
	@Column(name = "phone")
	private String phone;
	@Column(name = "email")
	private String email;
	@Column(name = "seatno")
	private int seatno;
	@Column(name = "source")
	private String source;
	@Column(name = "destination")
	private String destination;
	@Column(name = "trainname")
	private String trainname;
	@Column(name = "trainno")
	private double trainno;
	@Column(name = "date")
	private String date;
	@Column(name = "fare")
	private int fare;
	@Column(name = "pnr")
	private int pnr;
	@Column(name = "status")
	private String status;

	@Column(name="train_arrival_time")
	private String train_arrival_time;
	
	@Column(name="train_dept_time")
	private String train_dept_time;

	/**
	 * @return the seatId
	 */
	public Integer getSeatId() {
		return seatId;
	}

	/**
	 * @param seatId the seatId to set
	 */
	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
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
	 * @return the berth
	 */
	public String getBerth() {
		return berth;
	}

	/**
	 * @param berth the berth to set
	 */
	public void setBerth(String berth) {
		this.berth = berth;
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
	 * @return the seatno
	 */
	public int getSeatno() {
		return seatno;
	}

	/**
	 * @param seatno the seatno to set
	 */
	public void setSeatno(int seatno) {
		this.seatno = seatno;
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
	 * @return the fare
	 */
	public int getFare() {
		return fare;
	}

	/**
	 * @param fare the fare to set
	 */
	public void setFare(int fare) {
		this.fare = fare;
	}

	/**
	 * @return the pnr
	 */
	public int getPnr() {
		return pnr;
	}

	/**
	 * @param pnr the pnr to set
	 */
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the train_arrival_time
	 */
	public String getTrain_arrival_time() {
		return train_arrival_time;
	}

	/**
	 * @param train_arrival_time the train_arrival_time to set
	 */
	public void setTrain_arrival_time(String train_arrival_time) {
		this.train_arrival_time = train_arrival_time;
	}

	/**
	 * @return the train_dept_time
	 */
	public String getTrain_dept_time() {
		return train_dept_time;
	}

	/**
	 * @param train_dept_time the train_dept_time to set
	 */
	public void setTrain_dept_time(String train_dept_time) {
		this.train_dept_time = train_dept_time;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Seats [seatId=" + seatId + ", passangername=" + passangername + ", age=" + age + ", gender=" + gender
				+ ", berth=" + berth + ", phone=" + phone + ", email=" + email + ", seatno=" + seatno + ", source="
				+ source + ", destination=" + destination + ", trainname=" + trainname + ", trainno=" + trainno
				+ ", date=" + date + ", fare=" + fare + ", pnr=" + pnr + ", status=" + status + ", train_arrival_time="
				+ train_arrival_time + ", train_dept_time=" + train_dept_time + "]";
	}
	
	
}

