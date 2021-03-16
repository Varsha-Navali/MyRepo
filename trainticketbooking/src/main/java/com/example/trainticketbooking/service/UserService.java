package com.example.trainticketbooking.service;


import java.text.ParseException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.trainticketbooking.dto.UserDto;

@Service
public interface UserService {
	
	public String getInfo(String userName , String password);

}
