package com.departmentmasterservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.departmentmasterservices.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
