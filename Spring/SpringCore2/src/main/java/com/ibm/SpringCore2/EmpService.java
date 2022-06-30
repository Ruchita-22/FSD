package com.ibm.SpringCore2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("service")
public class EmpService {
	private EmpDAO empDao; //dependency 
	
	public EmpService() {
		System.out.println("default service costructor");
	}
	
	@Autowired
	public EmpService(EmpDAO eDao) {
		System.out.println("constructor service");
		this.empDao = eDao;
	}
	
	public EmpDAO getEmpDao() {
		return empDao;
	}
	
	public void setEmpDao(EmpDAOImpl empDaoImpl) {
		this.empDao = empDaoImpl;
	}
	
	public void getUser(String username) {
		empDao.connectDB();
		System.out.println(username);
	}
}
