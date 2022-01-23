package com.sna.tests.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

import com.sna.DAO.FireStationsDAOImpl;
import com.sna.DAO.IFireStationsDAO;
import com.sna.DAO.IMedicalRecordsDAO;
import com.sna.DAO.IPersonDAO;
import com.sna.DAO.MedicalRecordsDAOImpl;
import com.sna.DAO.PersonDAOImpl;
import com.sna.model.FireStations;
import com.sna.model.MedicalRecords;
import com.sna.model.Persons;
import com.sna.model.Resident;
import com.sna.service.FireStationsService;
import com.sna.service.PersonService;
import com.sna.service.ResidentService;
@SpringBootTest
public class ResidentsTests {

	
	
	
	
	
	@Autowired
	ResidentService resService;
	
	@MockBean
	PersonDAOImpl personsDAO;
	@MockBean
	IFireStationsDAO firestationsDAO;
	@MockBean
	IMedicalRecordsDAO medicalrecordsDAO;


	
	
	@Test
	public void resident () {
		
		
		Persons newPerson = new Persons();
		
		newPerson.setFirstname("Emmanuel");
		newPerson.setLastname("Jurquet");
		newPerson.setAddress("new address");
		newPerson.setPhone("phone:841-874-6513");
		
		FireStations newFire  = new FireStations ();
		
		newFire.setAddress("new address");
		newFire.setStation("5");
		
		MedicalRecords newMedfile = new MedicalRecords();
		
		
		newMedfile.setMedications(Arrays.nonNullElementsIn(null));
		newMedfile.setAllergies(Arrays.nonNullElementsIn(null));
		
		
		
		Persons pTest =  new Persons();
		when(personsDAO.findPerson("Emmanuel","Jurquet")).thenReturn(pTest);
		List<String> fTest =  new ArrayList<>();
		when(firestationsDAO.findStationByAddress(newPerson.getAddress())).thenReturn(fTest);
		MedicalRecords medTest = new MedicalRecords();
		MedicalRecords medFile =  medicalrecordsDAO.findMedFile("Emmanuel", "Jurquet");
		when(medicalrecordsDAO.findMedFile("Emmanuel", "Jurquet")).thenReturn(medTest);
		
		
		Resident resident = resService.resident("Emmanuel","Jurquet");
		List<Resident> result = new ArrayList<>();
		
		result.add(resident);
		
		
		assertEquals(result.add(resident), true);
	}
	
	
	}
	
	
	

