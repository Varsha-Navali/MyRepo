package com.example.ticketbooking.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ticketbooking.dto.PassangerDto;
import com.example.ticketbooking.dto.TrainsDto;
import com.example.ticketbooking.entity.Seats;
import com.example.ticketbooking.entity.TrainDetl;
import com.example.ticketbooking.service.TrainService;


@RestController
@RequestMapping("/trains")
public class TrainsController {

	@Autowired
	TrainService trainService;
	
	
	@PostMapping("/listtrains")
	public List<TrainDetl> findBySourceDestination(@RequestBody TrainsDto trainsDto) throws ParseException {
		List<TrainDetl> trainsList = trainService.getTrains(trainsDto);
		return trainsList;
	}
	
	
	@PostMapping("/bookseat")
	public String bookseat(@RequestBody PassangerDto passangerDto) {
		System.out.println(passangerDto.toString());
		String bookedSeat = trainService.getSeat(passangerDto);
		return bookedSeat;
		//return "Booking Successful" ;
	}
	
	
	@GetMapping("/history/{pnr}")
	public Seats fetchDetails(@PathVariable int pnr) {
		Seats passangerDetails = trainService.getPassanger(pnr);
		return passangerDetails;
		
	}
	
	
}
  