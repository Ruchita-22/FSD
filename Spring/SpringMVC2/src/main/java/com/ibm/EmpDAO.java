package com.ibm;

import java.util.*;
public class EmpDAO {
	private List<Emp> emplist;
	public EmpDAO() {
		emplist = new ArrayList<Emp>();
		emplist.add(new Emp(1, "ram"));
	}
	
	public EmpDAO(List<Emp> emplist) {
		this.emplist = emplist;
	}
	
	public List<Emp> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Emp> emplist) {
		this.emplist = emplist;
	}
	
	public void addEmp(Emp e) {
		emplist.add(e);
	}
	
	public List<Emp> getEmpDetails() {
		return emplist;
	}
}
