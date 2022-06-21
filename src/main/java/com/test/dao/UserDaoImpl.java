package com.test.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.UserDto;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	@Override
	public UserDto login(UserDto dto) {
		UserDto res = null;
		
		try {
			res = sqlSession.selectOne(NAMESPACE+"login", dto);
			
		} catch (Exception e) {
			System.out.println("[error] : login");
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int insert(UserDto dto) {
int res = 0;
		
		try {
			res = sqlSession.insert(NAMESPACE+"insert", dto);
		} catch (Exception e) {
			System.out.println("[error] : member insert");
			e.printStackTrace();
		}
		return res;
	}

}
