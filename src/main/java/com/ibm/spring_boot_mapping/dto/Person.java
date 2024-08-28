package com.ibm.spring_boot_mapping.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "pannumber")
	@JsonManagedReference
	private Pan pan;
	
	
}
