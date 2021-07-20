package com.JDBC.EmpAddress.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JDBC.EmpAddress.Entity.Emp;
import com.JDBC.EmpAddress.Mapper.EmpAddressMapper;
import com.JDBC.EmpAddress.Mapper.EmpMapper;

@RequestMapping("/emp")
@RestController
public class EmpAddressController {

	@Autowired
	JdbcTemplate jdbc;

	@GetMapping("/getdetails/{id}")
	public Emp getEmp(@PathVariable int id) {
		String getEmp = "Select empId, name, email from emp where empId = ?";
		return jdbc.queryForObject(getEmp, new Object[] {id}, new EmpMapper());
	}

	@GetMapping("/getdetailsemp/{id}")
	public Emp getEmpAllDetails(@PathVariable int id) {
		String getEmpAllDetails = "select e.empid, e.name, e.email, ad.address from emp e inner join address ad on e.empid = ad.addressid where e.empid = ?";
		return jdbc.queryForObject(getEmpAllDetails, new Object[] {id}, new EmpAddressMapper());
	}

	@GetMapping("/getallemp")
	public List<Emp> getAllEmployees(){  
		return jdbc.query("select * from emp",new ResultSetExtractor<List<Emp>>(){  
			@Override  
			public List<Emp> extractData(ResultSet rs) throws SQLException,  
			DataAccessException {  

				List<Emp> list=new ArrayList<Emp>();  
				while(rs.next()){  
					Emp e=new Emp();  
					e.setId(rs.getInt(1));  
					e.setName(rs.getString(2)); 
					e.setEmail(rs.getString(3));
					list.add(e); 
					System.out.println(e.toString());
				}

				return list;  
			}  
		});  
	} 
	
	

}
