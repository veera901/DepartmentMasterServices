package com.departmentmasterservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.departmentmasterservices.entities.Department;
import com.departmentmasterservices.entities.DepartmentReport;

public interface DeparmentReportRepository extends JpaRepository<DepartmentReport, Integer> {

}
