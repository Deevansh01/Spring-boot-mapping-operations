package com.ibm.spring_boot_mapping.one_to_many.dto;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Subject {
	@Id
	private int id;
	private String name;
	private String author;
	
	@ManyToOne
	@JoinColumn(name="teacherid")
	@JsonBackReference
	private Teacher teacher;

	public Subject() {
		super();
	}

	public Subject(int id, String name, String author, Teacher teacher) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.teacher = teacher;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	
	

}
