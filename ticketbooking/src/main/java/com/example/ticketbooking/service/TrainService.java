package com.example.ticketbooking.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ticketbooking.dto.PassangerDto;
import com.example.ticketbooking.dto.TrainsDto;
import com.example.ticketbooking.entity.Seats;
import com.example.ticketbooking.entity.TrainDetl;

@Service
public interface TrainService {

	 public String getSeat(PassangerDto passangerDto);

	public List<TrainDetl> getTrains(TrainsDto trainsDto) throws ParseException;

	public Seats getPassanger(int pnr);
}
