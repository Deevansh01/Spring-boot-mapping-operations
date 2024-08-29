package com.ibm.spring_boot_mapping.one_to_many.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.spring_boot_mapping.one_to_many.dto.Teacher;
import com.ibm.spring_boot_mapping.one_to_many.repository.TeacherRepository;

@Repository
public class TeacherSubjectDao {
	@Autowired
	private TeacherRepository repository;
	
	
	public Teacher saveTeacherSubjectDao(Teacher teacher) {
		return repository.save(teacher);
	}

}
