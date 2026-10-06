package com.JPAHibernate.service;

import java.util.List;

import com.JPAHibernate.entity.Department;

public interface DepartmentService {
	Department saveDepartment(Department department);
	List<Department> fetchDepartmentList();
	Department updateDepartment(Department department , Long Dpeartment);
	void deleteDepartmentById(Long departmentId);
}
