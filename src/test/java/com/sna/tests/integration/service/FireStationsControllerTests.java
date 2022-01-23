package com.sna.tests.integration.service;


import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.sna.model.FireStations;
import com.sna.service.FireStationsService;


import net.minidev.json.JSONObject;

@AutoConfigureMockMvc
@SpringBootTest
public class FireStationsControllerTests {

	@Autowired
    MockMvc mvc;
	
	@MockBean
    FireStationsService firestationsServices;
	
	@BeforeEach
    public void config() {
        List<FireStations> lfire= new ArrayList<>();
        when(firestationsServices.list()).thenReturn(lfire);
    }
	
	@Test
	void getFireStations() {
		try {
            this.mvc.perform(MockMvcRequestBuilders
                    .get("/firestations")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        } catch (Exception e) {
     
        }
	}
	@Test
	void addFirestations () {
		
		JSONObject object = new JSONObject ();
		object.put("address","1509 culver st");
		object.put("station ","5");

		
		String jsonString = object.toString();
		
		
		try {
			this.mvc.perform(MockMvcRequestBuilders
					.post("/firestations")
					.content(jsonString)
					.contentType(MediaType.APPLICATION_JSON))
					.andExpect(status().isOk());
			}catch(Exception e ) {
		
			}
		
	
	}	
	@Test 
	void modifyFireStations() {
		
		JSONObject object = new JSONObject ();
		object.put("address","new address");
		object.put("station ","4");
		
		
		String jsonString = object.toString();
		try {
			this.mvc.perform(MockMvcRequestBuilders
					.put("/firestations")
					.content(jsonString)
					.contentType(MediaType.APPLICATION_JSON))
					.andExpect(status().isOk());
			}catch(Exception e ) {
			
			}
	}
	
	@Test
	void removeFireStations() {
		
		try {
			this.mvc.perform(MockMvcRequestBuilders
					.delete("/firestations?address=new place&station=5")
					.contentType(MediaType.APPLICATION_JSON))
					.andExpect(status().isOk());
			}catch(Exception e ) {
				System.out.println(e.getMessage());
			}
	}
	
}	





