package com.ibm.spring_boot_mapping.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.spring_boot_mapping.dto.Pan;
import com.ibm.spring_boot_mapping.dto.Person;
import com.ibm.spring_boot_mapping.repository.PanRepository;
import com.ibm.spring_boot_mapping.repository.PersonRepository;

@Repository
public class PersonPanDao {
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private PanRepository panRepository;

	public Person savePersonPanDao(Person person) {
		return personRepository.save(person);
	}

	public Person getPersonPanByPersonIdDao(int id) {
		Optional<Person> optional = personRepository.findById(id);

		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	public Person savePersonDao(Person person, String panNumber) {

		Optional<Pan> optional = panRepository.findById(panNumber);

		if (optional.isPresent()) {
			Pan pan = optional.get();
			person.setPan(pan);
			return personRepository.save(person);
		} else {
			return null;
		}
	}
}
