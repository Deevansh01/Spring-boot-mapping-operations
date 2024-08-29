package com.ibm.spring_boot_mapping.one_to_many.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.spring_boot_mapping.one_to_many.dto.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
	

}
