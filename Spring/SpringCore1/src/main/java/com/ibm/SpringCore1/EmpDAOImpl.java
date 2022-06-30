package com.ibm.SpringCore1;

public class EmpDAOImpl  implements EmpDAO {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmpDAOImpl [username=" + username + ", password=" + password + "]";
	}
	
	public void connectDB() {
		System.out.println("Connecting to Database");
	}
	
}
