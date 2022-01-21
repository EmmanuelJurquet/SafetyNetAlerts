package com.sna.DAO;

import com.sna.model.Persons;

import java.util.List;


public interface IPersonDAO {
	

	
	public List<Persons>findAll();

	public Persons findPerson(String firstName, String lastName);
		
	public boolean add(Persons persons);

	public void replace(Persons person);

	public boolean remove(String firstName, String lastName);
	
	public List<String> findPhoneByAddress (String address);
	
	public  List<Persons> findPersonsByAddress (String address);
	
	public List<Persons> findFamily (String firstName, String LastName);

	public List<String> findEmail(String city);
}
