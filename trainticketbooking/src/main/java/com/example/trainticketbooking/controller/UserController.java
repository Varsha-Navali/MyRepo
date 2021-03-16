package com.example.trainticketbooking.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.example.trainticketbooking.dto.RequestDtoResponse;
//import com.example.trainticketbooking.dto.UserDto;
//import com.example.trainticketbooking.feignclient.UserClient;
import com.example.trainticketbooking.service.UserService;

@RestController
@RequestMapping("/users")
@Validated
public class UserController {

	@Autowired
	@Resource(name="userService")
	UserService testObj;
	UserService userService;
	
	//@Autowired
	//UserClient userClient;
	
	@PostMapping("/login")
	public String findByUsernamePassword(@RequestParam String userName , @RequestParam String password){
		String result = userService.getInfo(userName, password);
		return result;	
}

}