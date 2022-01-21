package com.sna.tests.integration.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.sna.model.FireStations;

import com.sna.service.FireStationsService;

@SpringBootTest
public class FireStationsIntegrationsTests {

	@Autowired
	FireStationsService fservice;

	@Test
	public void add () {
		
		FireStations station = new FireStations ();
		
		station.setAddress("158 av Nichols");
		station.setStation("4");
		
		
		assertEquals(fservice.add(station),true);
	}
	@Test
	public void remove () {
		
		FireStations station =  new FireStations ();
		station.setAddress("new place");
		station.setStation("5");
		
		fservice.add(station);
		fservice.remove("new place", "5");
		assertEquals(fservice.remove("new place ", "5"), true);
		
	}
	@Test
	public void replace () {
		FireStations station =  new FireStations ();
		station.setAddress("new place");
		station.setStation("5");
		
		fservice.add(station);
		station.setAddress("16 av zanzibar");
		
		fservice.replace(station);
		fservice.findStationByAddress("16, av Zanzibar");
		assertEquals("16, av Zanzibar", "16, av Zanzibar");
		
		
	}
	}	



