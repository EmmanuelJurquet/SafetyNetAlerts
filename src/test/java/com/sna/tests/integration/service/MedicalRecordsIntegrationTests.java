package com.sna.tests.integration.service;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sna.model.MedicalRecords;
import com.sna.service.MedicalRecordsService;


@SpringBootTest
public class MedicalRecordsIntegrationTests {

	@Autowired
	MedicalRecordsService mService;
	
	@Test
	public void add () {
		
		MedicalRecords medic = new MedicalRecords();
		medic.setFirstname("Audrey");
		medic.setLastname("Guillet");
		medic.setBirthdate(LocalDate.of(1982,12,13));
		medic.setAllergies(null);
		medic.setMedications(null);
		
		boolean successAdd = mService.add(medic);
		MedicalRecords findmedfile = mService.findMedFile("Audrey", "Guillet");


		assertEquals (true, successAdd);
		assertEquals(medic, findmedfile);	
	}
	@Test
	public void remove () {

		MedicalRecords medic = new MedicalRecords();
		medic.setFirstname("Audrey");
		medic.setLastname("Guillet");
		medic.setBirthdate(LocalDate.of(1982,12,13));
		medic.setAllergies(null);
		medic.setMedications(null);
	
		mService.add(medic);
		mService.remove("Audrey", "Guillet");
		assertEquals(mService.remove("Audrey", "Guillet"), true);

	}
	@Test 
	public void replace () {
		
		MedicalRecords medic = new MedicalRecords();
		medic.setFirstname("Audrey");
		medic.setLastname("Guillet");
		medic.setBirthdate(LocalDate.of(1982,12,13));
		medic.setAllergies(null);
		medic.setMedications(null);
	
		mService.add(medic);
		medic.setFirstname("Andréa");
		
		mService.replace(medic);
		
		MedicalRecords findmedfile = mService.findMedFile("Andréa", "Guillet");
		
		assertEquals(findmedfile.getFirstname(), "Andréa");
	
		
		
		
		
		
	}
	@Test 
	public void findMedFile() {
		
		MedicalRecords medic = new MedicalRecords();
		medic.setFirstname("Audrey");
		medic.setLastname("Guillet");
		medic.setBirthdate(LocalDate.of(1982,12,13));
		medic.setAllergies(null);
		medic.setMedications(null);
		
		mService.add(medic);
		
		assertEquals(mService.findMedFile("Audrey", "Guillet"), medic);
		
	}
	@Test
	public void findBirthDate () {
		
		MedicalRecords medic = new MedicalRecords();
		medic.setFirstname("Audrey");
		medic.setLastname("Guillet");
		medic.setBirthdate(LocalDate.of(1982,12,13));
		medic.setAllergies(null);
		medic.setMedications(null);
		
		mService.add(medic);
		
		assertEquals( mService.findbirthdate("Audrey", "Guillet"), LocalDate.of(1982,12,13));
	}
}


