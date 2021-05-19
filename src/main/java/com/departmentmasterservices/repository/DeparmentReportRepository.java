package com.departmentmasterservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.departmentmasterservices.entities.DepartmentReport;

@Repository
public interface DeparmentReportRepository extends JpaRepository<DepartmentReport, Integer> {

}
