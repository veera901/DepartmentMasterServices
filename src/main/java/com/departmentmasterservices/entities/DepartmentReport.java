package com.departmentmasterservices.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data
public class DepartmentReport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dreport_id;
	private String dreport_name;
	private String dreport_Description;
	
	@OneToOne
	@JoinColumn(name = "emp_id", referencedColumnName = "emp_id")
	private Employee emp;
	
	@OneToOne
	@JoinColumn(name = "doc_id", referencedColumnName = "doc_id")
	private Doctor doc;

}
