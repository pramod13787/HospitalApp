package org.patient.webservices.rest.patdept.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.patient.webservices.rest.patdept.domain.Patient;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

	Map<String, Patient> inmeoryRep = new ConcurrentHashMap<String, Patient>();

	public List<Patient> insertData(List<Patient> patients)

	{
		patients.parallelStream().forEach(p -> {
			p.setBmi(cal(p.getHeight(), p.getWeight()));

			inmeoryRep.put(p.getName(), p);

		}

		);
		return patients;

	}

	private double cal(double height, double weight) {
		return weight / ((height * height) * .01);
	}

	public Collection<Patient> findAll() {
		return  inmeoryRep.values();
	}
}
