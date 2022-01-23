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
	@Test
	public void findResidentsPhoneByStationNumber () {
		String phone = "phone\":\"841-874-6513";
		List<String> test = urlsService.findResidentsPhoneByStationNumber(phone);
		String firestation = "2";
		List<String> findStationTest = new ArrayList<>();
		
		List<String> findStation = fireDAO.findAddressByStationNumber(firestation);
		when(fireDAO.findAddressByStationNumber(firestation)).thenReturn(findStationTest);
		List<String> result =  new ArrayList<>();
		List<String> persResult =  new ArrayList<>();
		for (String address : findStation) {

			List<String> results  = personDAO.findPhoneByAddress(address);
			when(personDAO.findPhoneByAddress(address)).thenReturn(persResult);
			result.addAll(results);
		
		}
		assertEquals(findStationTest.size(),findStation.size());
		assertEquals(result.size(),test.size());
	}
	@Test
	public void findEmail() {
		String city = "Culver";
		List <String> findEmail = personDAO.findEmail(city);
		List <String> tests = new ArrayList<>();
		
		when(personDAO.findEmail(city)).thenReturn(tests);
		assertEquals(findEmail.size(),tests.size());
		
		
		
	}
		
}
	
