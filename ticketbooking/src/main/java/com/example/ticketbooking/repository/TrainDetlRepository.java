/**
 * 
 */
package com.example.ticketbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ticketbooking.entity.TrainDetl;

/**
 * @author MURALIDHAR
 *
 */
public interface TrainDetlRepository extends JpaRepository<TrainDetl,Integer > {

	@Query(value = "select * from train_detl where lower(source) = lower(?1) and lower(destination) = lower(?2) and date_format(train_arrival_time,'%d-%m-%Y') = ?3",nativeQuery = true)
	List<TrainDetl> findTrainDetlBySourceAndDestinationAndTrainArrivalTime(String source,String destination,String date);
	
	
	
}
