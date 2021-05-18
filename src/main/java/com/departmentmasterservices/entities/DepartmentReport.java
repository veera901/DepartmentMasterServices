package com.departmentmasterservices.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class DepartmentReport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dreport_id;
	private String dreport_name;
	private String dreport_Description;

}
