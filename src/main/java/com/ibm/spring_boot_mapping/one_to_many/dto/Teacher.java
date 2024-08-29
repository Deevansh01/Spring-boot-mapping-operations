package com.ibm.spring_boot_mapping.one_to_many.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
	
	@Id
	private int id;
	private String name;
	private String email;
	
	@OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Subject> subjects;
}

	/*public Teacher() {
		super();
	}

	public Teacher(int id, String name, String email, List<Subject> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.subjects = subjects;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	
}*/
	
	
