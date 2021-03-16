package com.example.ticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ticketbooking.entity.Trains;

@Repository
public interface TrainRepository extends JpaRepository<Trains,Integer > {
	
	
	
}
