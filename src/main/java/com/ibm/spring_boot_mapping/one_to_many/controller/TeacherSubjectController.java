package com.ibm.spring_boot_mapping.one_to_many.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.spring_boot_mapping.one_to_many.dao.TeacherSubjectDao;
import com.ibm.spring_boot_mapping.one_to_many.dto.Teacher;

@RestController
public class TeacherSubjectController {
	
	@Autowired
	private TeacherSubjectDao teacherSubjectDao;
	
	@PostMapping(value = "/saveTeacherSubject")
	public Teacher saveTeacherSubjectDao(@RequestBody Teacher teacher) {
		return teacherSubjectDao.saveTeacherSubjectDao(teacher);
	}
}
