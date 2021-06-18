package org.patient.webservices.rest.patdept.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Patient {
	
	String name;
	int age;
	double weight;
	double height;
	double bmi;

}
