package com.ibm.spring_boot_mapping.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.spring_boot_mapping.dto.Pan;
import com.ibm.spring_boot_mapping.repository.PanRepository;

@Repository
public class PanDao {
	@Autowired
	private PanRepository panRepository;
	
	public Pan savePanDao(Pan pan)
	{
		return panRepository.save(pan);
	}
}
