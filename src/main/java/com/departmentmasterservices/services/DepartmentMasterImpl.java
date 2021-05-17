package com.departmentmasterservices.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departmentmasterservices.entities.Department;

import com.departmentmasterservices.repository.DepartmentRepository;



@Service
public class DepartmentMasterImpl {
	@Autowired
	private DepartmentRepository repo;

	public Department createDepartment(Department department) {
	
		return repo.save(department);
	}

	public Department updateDepartment(Department department) {
		 if(repo.existsById(department.getId())) {
			 return  repo.save(department);
		 }
		 else {
			 return null;
		}
	}
	
	
	public Optional<Department> findById(int id) {
		return repo.findById(id);
		
	}

	}
