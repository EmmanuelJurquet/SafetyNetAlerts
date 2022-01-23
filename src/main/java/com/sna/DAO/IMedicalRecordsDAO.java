package com.sna.DAO;
import com.sna.model.MedicalRecords;

import java.time.LocalDate;
import java.util.List;


public interface IMedicalRecordsDAO {



	public List<MedicalRecords>findAll();

	public boolean add(MedicalRecords medicalrecords);

	public boolean remove(String firstName, String lastName);

	public boolean replace(MedicalRecords medicalrecords);
	
	public LocalDate findbirthdate(String firstName, String lastName);
	
	public List<MedicalRecords> findChild(String lastName);
	
	public MedicalRecords findMedFile(String firstName, String lastName);
}



