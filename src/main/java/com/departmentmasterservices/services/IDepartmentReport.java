package com.departmentmasterservices.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.departmentmasterservices.entities.DepartmentReport;

@Service
public interface IDepartmentReport {
	 public DepartmentReport createDepartmentReport(DepartmentReport departmentreport) ;
		
		public DepartmentReport updateDepartmentReport(DepartmentReport departmentreport);
		
		public Optional<DepartmentReport>  findById(int id);
		
}
