package com.example.trainticketbooking.service.impl;

import java.text.ParseException;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.trainticketbooking.dto.UserDto;
import com.example.trainticketbooking.entity.User;
import com.example.trainticketbooking.repository.UserRepository;
import com.example.trainticketbooking.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	@Qualifier("userRepository")
	@Resource(name="userRepository")
	UserRepository testObj;
	private UserRepository userRepository;
	
@Override
	public String getInfo(String userName , String password){
		//String username = userDto.getUserName();
		//String password = userDto.getPassword();
		//User user = new User();
		User user = userRepository.findByUsernameAndPassword(userName,password);
		if(null != user) {
			return "authentication success";
		}
		else {
			return "authentication failed";
		}
	}
	
}
