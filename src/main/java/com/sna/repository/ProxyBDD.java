package com.sna.repository;

import java.util.List;
import com.sna.model.FireStations;
import com.sna.model.MedicalRecords;
import com.sna.model.Persons;

public class ProxyBDD {

	private List<Persons> lpersons;

	private List<MedicalRecords> lMedicalRecords;

	private List<FireStations> lFireStations;

	public void loadData(final String filePath) {
		loadPersons(filePath);
		loadFireStations(filePath);
		loadMedicalRecords(filePath);
	}
	
	private void loadPersons(final String filePath) {
		JSONPersons jsonPersons = new JSONPersons();
		lpersons = jsonPersons.readPersons();
	}
	
	private void loadFireStations (final String filePath) {
		
		JSONFireStations jsonFireStations = new JSONFireStations();
		lFireStations = jsonFireStations.readFireStations();
		
	}
	
	private void loadMedicalRecords (final String filePath) {
		
		JSONMedicalRecord jsonMedicalRecords = new JSONMedicalRecord();
		lMedicalRecords = jsonMedicalRecords.readMedicalRecords();
	}

	public List<Persons> getLpersons() {
		return lpersons;
	}

	public List<MedicalRecords> getlMedicalRecords() {
		return lMedicalRecords;
	}

	public List<FireStations> getlFireStations() {
		return lFireStations;
	}
}
	

	

	

	

			

	



