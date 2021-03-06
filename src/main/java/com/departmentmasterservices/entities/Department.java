package com.departmentmasterservices.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int d_id;
	private String d_name;
}
