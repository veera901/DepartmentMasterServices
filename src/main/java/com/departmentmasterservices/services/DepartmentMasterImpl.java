 package com.departmentmasterservices.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departmentmasterservices.entities.Department;

import com.departmentmasterservices.repository.DepartmentRepository;



@Service
public class DepartmentMasterImpl implements IDepartmentMaster {
	@Autowired
	private DepartmentRepository repo;
      @Override
	public Department createDepartment(Department department) {
	
		return repo.save(department);
	}
    @Override
	public Department updateDepartment(Department department) {
		 if(repo.existsById(department.getD_id())) {
			 return  repo.save(department);
		 }
		 else {
			 return null;
		}
	}
	
    @Override	
	public Optional<Department> findById(int id) {		
    	return repo.findById(id);
		
	}

	}
