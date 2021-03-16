package com.example.trainticketbooking.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.trainticketbooking.dto.RequestDtoResponse;
import com.example.trainticketbooking.dto.UserDto;

@FeignClient(value="ticketbooking-service",url="http://localhost:2233/ticketbooking/user")
public interface UserClient {

	//@PostMapping("/login")
	//public List<RequestDtoResponse> loginUser(UserDto userDto);
	
	
}

