package com.sna.service;

import java.util.List;
import java.util.Map;

import com.sna.model.Persons;
import com.sna.model.Resident;

public interface IResidentService {

	
	public Resident resident(String firstName , String lastName);
	
	public List<Resident> findListOfResidentsByAddress (String address);
	
	public  Map <Resident, List<Persons>> findChildByAddress (String address);
	
	public List<Resident> findListOfResidentsByFireStationNumber (String station_number);
	
	
}
