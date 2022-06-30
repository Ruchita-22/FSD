package com.ibm.SpringJDBC1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CustomerDAO {
	JdbcTemplate jt;

	public CustomerDAO() {
	}
	
	public CustomerDAO(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int addCustomer(Customer c) {
		String str = "insert into customer values(" + 
				c.getId() + ",'" + c.getName() + "','" +
				c.getAddress() + "')";
		return jt.update(str); 
	}
	
	public List<Customer> getCustomerDetails() {
		return jt.query("select * from customer", 
				new RowMapper<Customer>() {
	public Customer mapRow(ResultSet r,int row)
			throws SQLException {
			Customer c = new Customer();
			c.setId(r.getInt(1));
			c.setName(r.getString(2));
			c.setAddress(r.getString(3));
			return c;
			}
		});
	}
	
}
