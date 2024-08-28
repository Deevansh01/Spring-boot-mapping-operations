package com.ibm.spring_boot_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.spring_boot_mapping.dto.Pan;

@Repository
public interface PanRepository extends JpaRepository<Pan, String> {

}
