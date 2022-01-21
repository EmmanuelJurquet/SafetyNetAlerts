package com.sna.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sna.DAO.IPersonDAO;
import com.sna.model.Persons;

@Service
public class PersonService {

	@Autowired
	private IPersonDAO personDAO;

	public List<Persons> list() {
		return this.personDAO.findAll();
	}
	
	public Persons findPerson(String firstName, String lastName) {
		return personDAO.findPerson(firstName, lastName);
	}
	
	public boolean add (Persons persons) {
		personDAO.add(persons);
		return true;
	}

	public void replace (Persons person) {
		personDAO.replace(person);
	}

	public boolean remove (String firstName,String lastName) {
		personDAO.remove(firstName, lastName);
		return true;
	}
	
	public List<String> findPhoneByAddress (String address){
		return personDAO.findPhoneByAddress(address);
	}
	
	public  List<Persons> findPersonsByAddress (String address){
		return personDAO.findPersonsByAddress(address);
	}
	
	public List<Persons> findFamily (String firstName, String LastName){
		return personDAO.findFamily(firstName, LastName);
	}
	
	public List<String> findEmail (String city){
		return personDAO.findEmail(city);
	}


	
}