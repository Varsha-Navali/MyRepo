package com.example.ticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.ticketbooking.entity.Seats;

public interface SeatsRepository extends JpaRepository<Seats, Integer>{

	@Modifying
	@Query(value = "update seats SET source=?1 , destination=?2 , date=?3 , passangername=?4 , gender=?5 , age=?6 , phone=?7 , email=?8 ,pnr=?9, status=?10 where status = ?11",nativeQuery = true)
	Integer bookSeat(String source, String destination, String date, String passangername, String gender, int age,String phone, String email, int pnr,String status, String currentStatus);

	Seats findByPnr(int pnr);
}
