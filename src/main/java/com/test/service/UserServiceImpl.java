package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.dto.UserDto;

@Service

public class UserServiceImpl implements UserService{
	

 	
	@Autowired
	private UserDao dao;

	@Override
	public UserDto login(UserDto dto) {
		return dao.login(dto);
		
	}

	@Override
	public int insert(UserDto dto) {
		return dao.insert(dto);
	}
}
