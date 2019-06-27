package com.dbutil.service;

import java.util.List;

import com.dbutil.po.Department;
import com.dbutil.po.Employee;

public interface EmployeeService {

	public boolean insertEmp(Employee emp);
	
	public boolean deleteEmp(int eid);
	
	public boolean updateEmp(Employee emp);
	
	public  Employee getByID(int eid);
	
	public List<Employee> findAll();
}
