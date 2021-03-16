package com.example.ticketbooking;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ticketbooking.controller.TrainsController;
import com.example.ticketbooking.dto.PassangerDto;
import com.example.ticketbooking.dto.TrainsDto;
import com.example.ticketbooking.entity.Seats;
import com.example.ticketbooking.entity.TrainDetl;
import com.example.ticketbooking.service.TrainService;

public class TrainsControllerTest extends TicketbookingApplicationTests{

	@InjectMocks TrainsController trainsController;
	
	@Mock TrainService trainService;
	
	@Test
	public void findBySourceDestinationTest() throws ParseException {
		TrainsDto trainsDto = new TrainsDto();
		trainsDto.setSource("Hubli");
		trainsDto.setDestination("Bangalore");
		trainsDto.setDate("10/03/2021");
		List<TrainDetl> list = new ArrayList<TrainDetl>();
		Mockito.when(trainService.getTrains(Mockito.anyObject())).thenReturn(list);
		trainsController.findBySourceDestination(trainsDto);
	}
	
	@Test
	public void bookseatTest() {
		PassangerDto passangerDto = new PassangerDto();
		passangerDto.setSource("Bangalore");
		passangerDto.setDestination("Hospet");
		passangerDto.setDate("10/03/2021");
		passangerDto.setPassangername("Varsha");
		passangerDto.setAge(26);
		passangerDto.setGender("Female");
		passangerDto.setEmail("varshanavali@gmail.com");
		passangerDto.setPhone("9448795043");
		Mockito.when(trainService.getSeat(Mockito.anyObject())).thenReturn("Booked");
		trainsController.bookseat(passangerDto);
	}
/*
	@Test
	public void fetchDetailsTest() {
		Seats pnr = new Seats();
	    pnr.setPnr(1000);
	   // Seats pnr = new Seats();
		Mockito.when(trainService.getPassanger(Mockito.anyInt())).thenReturn(pnr);
		trainsController.fetchDetails(pnr);
	}
	*/

	}