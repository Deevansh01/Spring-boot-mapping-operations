package com.ibm.spring_boot_mapping.one_to_many.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.spring_boot_mapping.one_to_many.dto.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
	
}
