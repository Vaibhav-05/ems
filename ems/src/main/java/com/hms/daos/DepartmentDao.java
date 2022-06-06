package com.hms.daos;

import com.ems.entities.Department;

public interface DepartmentDao {

	Department findByDepartmentId(int departmentId);
	
	Department findByDepartmentName(String departmentName);
}
