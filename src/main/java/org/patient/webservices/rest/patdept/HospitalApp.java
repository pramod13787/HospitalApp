package org.patient.webservices.rest.patdept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HospitalApp {
	
	@Autowired
	RestTemplate restTemplate ;

	public static void main(String[] args) {
		
		SpringApplication.run(HospitalApp.class, args);
		

	}
}