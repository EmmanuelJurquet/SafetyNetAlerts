package com.sna.tests.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.sna.DAO.IFireStationsDAO;
import com.sna.DAO.IMedicalRecordsDAO;
import com.sna.DAO.IPersonDAO;
import com.sna.service.ResidentService;

public class ResidentsTests {

	
	
	
	@Autowired
	ResidentService resService;
	
	@MockBean
	IPersonDAO personsDAO;
	@MockBean
	IFireStationsDAO firestationsDAO;
	@MockBean
	IMedicalRecordsDAO medicalrecordsDAO;

	
	
	
	
}
