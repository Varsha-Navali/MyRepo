package com.example.ticketbooking.service.impl;

import java.text.ParseException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ticketbooking.dto.PassangerDto;
import com.example.ticketbooking.dto.TrainsDto;
import com.example.ticketbooking.entity.Seats;
import com.example.ticketbooking.entity.TrainDetl;
import com.example.ticketbooking.repository.SeatsRepository;
import com.example.ticketbooking.repository.TrainDetlRepository;
import com.example.ticketbooking.repository.TrainRepository;
import com.example.ticketbooking.service.TrainService;

@Service
@Transactional
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository trainRepository;
	
	@Autowired
	private TrainDetlRepository trainDetlRepository;

	@Autowired
	private SeatsRepository seatsRepository;
	
	private static final String DATE_FORMATTER = "dd/MM/yyyy";

	public List<TrainDetl> getTrains(TrainsDto trainsDto) throws ParseException {
		String source = trainsDto.getSource();
		String destination = trainsDto.getDestination();
		List<TrainDetl> trainsList = trainDetlRepository.findTrainDetlBySourceAndDestinationAndTrainArrivalTime(source,destination,trainsDto.getDate());
		return trainsList;
	}

	public String getSeat(PassangerDto passangerDto) {
		Random rand = new Random();
		int pnr = rand.nextInt(1000);
		Integer bookedSeat = seatsRepository.bookSeat(passangerDto.getSource(),passangerDto.getDestination(),passangerDto.getDate(),passangerDto.getPassangername(),passangerDto.getGender(),passangerDto.getAge(),passangerDto.getPhone(),passangerDto.getEmail(),pnr,"booked","notbooked");
			if(bookedSeat>0) {
				return " Seat Booked successfully";
			}
			else {
				return "Seat not booked";
			}
	
	}

	public Seats getPassanger(int pnr) {
		Seats passanger = seatsRepository.findByPnr(pnr);
		return passanger;

	}
	
}
