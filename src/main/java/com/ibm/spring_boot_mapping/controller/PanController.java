package com.ibm.spring_boot_mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.spring_boot_mapping.dao.PanDao;
import com.ibm.spring_boot_mapping.dto.Pan;
@RestController
public class PanController {
	@Autowired
	private PanDao panDao;
	
	@PostMapping(value = "/savePan")
	public Pan savePanDao(@RequestBody Pan pan) {
		return panDao.savePanDao(pan);
	}

}
