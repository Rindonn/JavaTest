package com.dbutil.service;

import java.util.List;

import com.dbutil.dao.DepartmentDao;
import com.dbutil.po.Department;

public class DepartmentServiceImpl implements DepartmentService{
    DepartmentDao depdao = new DepartmentDao();
	@Override
	public boolean insertDepartment(Department dep) {
		String sqlString = "insert into department(dname,dmanager) values(?,?)";
		Object[] params = {dep.getDname(),dep.getDmanager()};
		return depdao.update(sqlString, params);
		
	}

	@Override
	public boolean deleteDepartment(int did) {
		String sqlString = "delete from department where did=?";
		Object[] params = {did};
		return depdao.update(sqlString, params);
		
	}

	@Override
	public boolean updateDepartment(Department dep) {
		String sqlString = "update department set dname=?,dmanager=? where did=?";
		Object[] params = {dep.getDname(),dep.getDmanager(),dep.getDid()};
		return depdao.update(sqlString, params);
		
	}

	@Override
	public Department getByID(int did) {
		String sqlString = "select * from department where did="+did;
		//需要强制类型转换
		return (Department) depdao.get(sqlString, Department.class);
		
	}

	@Override
	public List<Department> findAll() {
		String sqlString = "select * from department";
		return depdao.query(sqlString, Department.class);
	}

}
