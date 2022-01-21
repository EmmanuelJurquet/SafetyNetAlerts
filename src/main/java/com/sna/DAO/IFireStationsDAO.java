package com.sna.DAO;

import java.util.List;

import com.sna.model.FireStations;

public interface IFireStationsDAO {
	
	List<FireStations> findAll();
	
	public boolean add (FireStations firestations);
	
	public	boolean replace(FireStations firestations);

	public	boolean remove( String address, String station);
	
	public List<String> findAddressByStationNumber( String firestation_number);

	public List<String> findStationByAddress(String address);

}


