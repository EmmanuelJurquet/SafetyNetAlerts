package com.sna.service;

import java.time.LocalDate;
import java.util.List;

import com.sna.model.MedicalRecords;

public interface IMedicalRecordsServices {
	
	
	public List<MedicalRecords> list();
	
	public void add (MedicalRecords medicalrecords);
	
	public void replace ( MedicalRecords medicalrecords);
	
	public void remove (String firstName, String lastName);
	
	public LocalDate findbirthdate(String firstName, String lastName);
	
	public List<MedicalRecords> findChild(String lastName);


}
