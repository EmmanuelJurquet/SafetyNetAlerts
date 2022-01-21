package com.sna.tests.integration.service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sna.model.Resident;
import com.sna.service.ResidentService;
import com.sna.service.UrlsServices;

@SpringBootTest
public class UrlsServicesIntegrationsTests {

	
	
	@Autowired
	UrlsServices urlsService; 
	
	@Autowired
	ResidentService resService;
	
	
	
	@Test
	 public void findResident () {
		
		
		Resident res = new Resident();
		
		res.setFirstName("Emmanuel");
		res.setLastName("Jurquet");
		res.setAddress("new address");
		
		assertEquals(res.getLastName(), "Jurquet");
		
		
	}
	
	
	
}
