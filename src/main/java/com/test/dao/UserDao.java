package com.test.dao;

import com.test.dto.UserDto;

public interface UserDao {
	
	String NAMESPACE = "mymember";
	
	public UserDto login(UserDto dto);
	public int insert(UserDto dto);
}
