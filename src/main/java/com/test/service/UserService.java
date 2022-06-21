package com.test.service;

import com.test.dto.UserDto;

public interface UserService{
	public UserDto login(UserDto dto);
	public int insert(UserDto dto);
}