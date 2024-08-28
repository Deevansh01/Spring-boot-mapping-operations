package com.ibm.spring_boot_mapping.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public class Pan {
	@Id
	private String panNumber;
	private String address;
	private LocalDate  dob;
	
	
	@OneToOne(mappedBy  ="pan")
	@JsonIgnore
	@JsonBackReference
	private Person person;
}
