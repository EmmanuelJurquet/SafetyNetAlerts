package com.sna.service;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sna.model.FireStations;
import com.sna.DAO.IFireStationsDAO;

@Service
public class FireStationsService {
	
	@Autowired
	private	IFireStationsDAO firestationsDAO;
	
	public List<FireStations> list() {
		return this.firestationsDAO.findAll();
	}
	
	public boolean add (FireStations firestations ) {
		firestationsDAO.add(firestations);
		return true;
	
	}
	public boolean remove (String address, String station) {
		firestationsDAO.remove(address, station);
		return true;
	}
	
	public boolean replace(FireStations firestations) {
		firestationsDAO.replace(firestations);
		return true;
	}
		
	
	public List<String> findAddressByStationNumber(String firestation) {	
		return firestationsDAO.findAddressByStationNumber(firestation);
	}
	
	public List<String> findStationByAddress (String address) {
		return firestationsDAO.findStationByAddress(address);
	}
}
