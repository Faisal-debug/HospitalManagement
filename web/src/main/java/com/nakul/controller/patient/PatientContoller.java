package com.nakul.controller.patient;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.nakul.model.patient.Patient;
import com.nakul.service.patient.PatientService;

@RestController
public class PatientContoller {

	@Autowired
	private PatientService service;
	
	@GetMapping("/patients")
	public List<Patient> getAllPatients(){
		
		return service.getAllPatients();
	}
	
	@GetMapping("/patients/{p_id}")
	public Optional<Patient> getPatientById(@PathVariable int p_id) {
		return service.getPatientById(p_id);
	}
}
