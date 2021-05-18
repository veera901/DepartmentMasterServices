package com.departmentmasterservices.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departmentmasterservices.entities.Department;
import com.departmentmasterservices.entities.DepartmentReport;
import com.departmentmasterservices.repository.DeparmentReportRepository;
@Service
public class DepartmentReportImpl  implements IDepartmentReport {
	@Autowired
	private DeparmentReportRepository repo;

	@Override
	public DepartmentReport createDepartmentReport(DepartmentReport departmentreport) {
		// TODO Auto-generated method stub
		return repo.save(departmentreport);
	}

	@Override
	public DepartmentReport updateDepartmentReport(DepartmentReport departmentreport) {
		// TODO Auto-generated method stub
		return repo.save(departmentreport);
	}

	@Override
	public Optional<DepartmentReport> findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}
	

}
