package org.patient.webservices.rest.patdept.endpoint;

import java.util.Collection;
import java.util.List;

import org.patient.webservices.rest.patdept.domain.Patient;
import org.patient.webservices.rest.patdept.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;


	@PostMapping("/patients")
	public List<Patient> create(@RequestBody List<Patient> patients) {
		return patientService.insertData(patients);
	}

	@GetMapping("/patients")
	public Collection<Patient> getAllPatients() {
		return patientService.findAll();
	}


}