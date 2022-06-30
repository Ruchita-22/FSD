package com.ibm.SpringCore2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dbconfig.properties")
public class EmpDAOImpl  implements EmpDAO {
	@Value("${dburl}")
	private String dbUrl;
	@Value("${userid}")
	private String userid;
	private String password;

	public EmpDAOImpl() {
		System.out.println("default constructor of empdao");
	}
	public EmpDAOImpl(String dbUrl, String userid, String password) {
		super();
		this.dbUrl = dbUrl;
		this.userid = userid;
		this.password = password;
	}
	public void connectDB() {
		System.out.println("Connecting to Database");
	}
	public String getDbUrl() {
		return dbUrl;
	}
	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmpDAOImpl [dbUrl=" + dbUrl + ", userid=" + userid + ", password=" + password + "]";
	}

	
}
