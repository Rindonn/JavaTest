package com.dbutil.service;

import java.util.List;

import com.dbutil.po.Department;

public interface DepartmentService {
	
	public boolean insertDepartment(Department dep);
	
	public boolean deleteDepartment(int did);
	
	public boolean updateDepartment(Department dep);
	
	public  Department getByID(int did);
	
	public List<Department> findAll();
}
