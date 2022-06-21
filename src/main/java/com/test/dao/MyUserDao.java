package com.test.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.dto.UserDto;

public class MyUserDao {
	Connection con = null;
	public MyUserDao() {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//전체 출력
	public List<UserDto> selectAll(){
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multi", "root", "1234");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Statement stmt = null;
		ResultSet rs = null;
		List<UserDto> res = new ArrayList<UserDto>();
		String sql = " SELECT * FROM MYUSER";
		
		try {
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				UserDto dto = new UserDto(rs.getString(1), rs.getString(2), rs.getString(3));
				res.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return res;
	}
	
}
