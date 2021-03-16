/**
 * 
 */
package com.example.ticketbooking.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author MURALIDHAR
 *
 */
@Entity
@Table(name = "train_detl")
@IdClass(TrainDetl.class)
public class TrainDetl implements Serializable {
	
	private static final long serialVersionUID = 1L;		
	
	@Id
	@Column(name = "train_detl_id")
	private Integer trainDetlId;
	
	@Column(name = "train_id")
	private Integer trainId;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name="train_arrival_time")
	private String trainArrivalTime;
	
	@Column(name="train_dept_time")
	private String trainDeptTime;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return trainDetlId;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer trainDetlId) {
		this.trainDetlId = trainDetlId;
	}

	/**
	 * @return the trainId
	 */
	public Integer getTrainId() {
		return trainId;
	}

	/**
	 * @param trainId the trainId to set
	 */
	public void setTrainId(Integer trainId) {
		this.trainId = trainId;
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
	 * @return the trainArrivalTime
	 */
	public String getTrainArrivalTime() {
		return trainArrivalTime;
	}

	/**
	 * @param trainArrivalTime the trainArrivalTime to set
	 */
	public void setTrainArrivalTime(String trainArrivalTime) {
		this.trainArrivalTime = trainArrivalTime;
	}

	/**
	 * @return the trainDeptTime
	 */
	public String getTrainDeptTime() {
		return trainDeptTime;
	}

	/**
	 * @param trainDeptTime the trainDeptTime to set
	 */
	public void setTrainDeptTime(String trainDeptTime) {
		this.trainDeptTime = trainDeptTime;
	}
	
	

}
