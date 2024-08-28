package com.ibm.spring_boot_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.spring_boot_mapping.dto.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
	
}
