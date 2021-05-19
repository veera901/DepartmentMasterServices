package com.departmentmasterservices.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.departmentmasterservices.entities.Department;


@Service
public interface IDepartmentMaster {
    public  Department createDepartment(Department department) ;
	
	public Department updateDepartment(Department department);
	
	public Optional<Department>  findById(int id);

}
