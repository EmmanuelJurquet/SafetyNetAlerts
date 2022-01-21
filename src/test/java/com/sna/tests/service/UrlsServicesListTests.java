package com.sna.tests.service;

import 	java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.sna.DAO.IFireStationsDAO;
import com.sna.DAO.IMedicalRecordsDAO;
import com.sna.DAO.IPersonDAO;
import com.sna.service.ResidentService;
import com.sna.service.UrlsServices;

@SpringBootTest
public class UrlsServicesListTests {
	
	
	@Autowired
	UrlsServices urlsService;
	
	@Autowired
	ResidentService resService;
	
	@MockBean
	IPersonDAO personDAO;
	
	@MockBean
	IFireStationsDAO fireDAO;
	
	@MockBean
	IMedicalRecordsDAO medDAO;
	
	@Test
	public void findPersonsByStationNumber () {
		
		String stationNumber = "2";
		
		List<String> lAddress = fireDAO.findAddressByStationNumber(stationNumber);
		List<String>lAdressTest =  new ArrayList<>();
 		when(fireDAO.findAddressByStationNumber(stationNumber)).thenReturn(lAdressTest);
		
		assertEquals(lAddress.size(), lAdressTest.size());
	}

}
