package com.nakul.service.patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nakul.dao.patient.PatientRepository;
import com.nakul.model.patient.Patient;

@Service
public class PatientService {

	@Autowired
	private PatientRepository repository;
	
	@PostConstruct
	public void initPatient() {
		repository.saveAll(new ArrayList<>(Arrays.asList(new Patient(2001,"Gopal","Eye flu"),
														 new Patient(2002,"Raju","diabeties"),
														 new Patient(2003,"Rohan","infection"))));
	}

	public List<Patient> getAllPatients(){
		return repository.findAll(); 
	}
	
	public Optional<Patient> getPatientById(int p_id) {
		return repository.findById(p_id);
	}
}
