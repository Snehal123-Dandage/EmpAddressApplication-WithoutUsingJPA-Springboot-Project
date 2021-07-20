package com.JDBC.EmpAddress.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.JDBC.EmpAddress.Entity.Address;
import com.JDBC.EmpAddress.Entity.Emp;

public class EmpAddressMapper implements RowMapper<Emp> {

	@Override
	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emp emp = new Emp();
		Address ad = new Address();
		ad.setAddress(rs.getString("address"));	
		
		emp.setId(rs.getInt("empId"));
		emp.setName(rs.getString("name"));
		emp.setEmail(rs.getString("email"));
		emp.setAddress(ad);
		return emp;
	}
	

}
