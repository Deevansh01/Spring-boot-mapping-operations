package com.ibm.spring_boot_mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.spring_boot_mapping.dao.PersonPanDao;
import com.ibm.spring_boot_mapping.dto.Pan;
import com.ibm.spring_boot_mapping.dto.Person;

@RestController
public class PersonPanController {
	@Autowired
	private PersonPanDao  personPanDao;
	
	@PostMapping(value="/savePersonPan")
	public Person savePersonController(@RequestBody Person person)
	{
		return personPanDao.savePersonPanDao(person); 
	}
	
	@GetMapping(value = "/getPersonPanByPersonId/{id}")
	public Pan getPersonPanByPersonIdController(@PathVariable int id) {
		Person person = personPanDao.getPersonPanByPersonIdDao(id);
		return person.getPan();
	}
	

}
