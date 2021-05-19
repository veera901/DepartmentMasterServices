package com.departmentmasterservices.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doc_id;
	private String doc_name;
	private String doc_specialization;
	private String doc_email;
	private String doc_mobile;
	private String doc_gender;

}
