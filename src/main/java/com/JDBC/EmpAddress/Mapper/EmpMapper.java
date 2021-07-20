package com.JDBC.EmpAddress.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.JDBC.EmpAddress.Entity.Emp;

public class EmpMapper implements RowMapper<Emp>{

	@Override
	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emp emp = new Emp();
		emp.setId(rs.getInt("empId"));
		emp.setName(rs.getString("name"));
		emp.setEmail(rs.getString("email"));
		return emp;
	}

}
