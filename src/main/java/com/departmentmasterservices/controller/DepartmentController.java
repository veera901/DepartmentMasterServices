package com.departmentmasterservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.departmentmasterservices.entities.Department;
import com.departmentmasterservices.repository.DepartmentRepository;
import com.departmentmasterservices.services.DepartmentMasterImpl;

@RestController
@RequestMapping("/api/department")

public class DepartmentController {
	@Autowired
	private DepartmentMasterImpl departmentMasterImpl;
	
	@Autowired
	private DepartmentRepository repo;
	
	@PostMapping("/add")
	public ResponseEntity<String> createDepartment(@RequestBody Department depart) {
		if(!repo.existsById(depart.getD_id())) {
			departmentMasterImpl.createDepartment(depart);
			return new ResponseEntity<String>("Saved Successflyy",HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<String>("No data Found",HttpStatus.ACCEPTED);
		}
	}
	
	
	
	@GetMapping("/{id}")
	public ResponseEntity<String> findById(@PathVariable int id)  {
	
		if(repo.existsById(id)) {
		return new ResponseEntity<String>("Data Found",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No Data Found",HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/del/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		if(repo.existsById(id)) {
		repo.deleteById(id);
		return new ResponseEntity<String>("Data  DEleetd",HttpStatus.OK);
		
	}
		else {
			return new ResponseEntity<String>("Data Not Found",HttpStatus.BAD_REQUEST);
		}
}
	@GetMapping("/getall")
	public java.util.List<Department> getall(){
		return repo.findAll();
	}

}
