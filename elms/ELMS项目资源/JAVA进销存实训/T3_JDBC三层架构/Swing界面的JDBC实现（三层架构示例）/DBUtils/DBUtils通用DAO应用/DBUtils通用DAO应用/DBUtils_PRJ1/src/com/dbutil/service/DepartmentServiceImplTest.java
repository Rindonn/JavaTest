package com.dbutil.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.dbutil.po.Department;

public class DepartmentServiceImplTest {
    DepartmentService depservice = new DepartmentServiceImpl();
	@Test
	public void testInsertDepartment() {
		Department dep = new Department();
		dep.setDname("dname2");
		dep.setDmanager("李四");
		boolean result = depservice.insertDepartment(dep);
		//assertEquals(true,result);//与期望值比较
		assertTrue(result); //直接判断是否为true
	}

	@Test
	public void testDeleteDepartment() {
		boolean result = depservice.deleteDepartment(2);
		assertTrue(result); //直接判断是否为true
	}

	@Test
	public void testUpdateDepartment() {
		Department dep = new Department();
		dep.setDid(1);
		dep.setDname("dname1");
		dep.setDmanager("张小三");
		boolean result = depservice.updateDepartment(dep);
		assertTrue(result); //直接判断是否为true
	}

	@Test
	public void testGetByID() {
		Department dep = depservice.getByID(1);
		assertNotNull(dep);//判断不为null
		System.out.println(dep.getDname());
	}

	@Test
	public void testFindAll() {
		List<Department> list = depservice.findAll();
		assertNotNull(list);
		System.out.println(list.size());
	}

}
