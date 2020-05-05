package com.nakul.service.doctor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nakul.dao.doctor.DoctorRepository;
import com.nakul.model.doctor.Doctor;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository repository;
	
	@PostConstruct
	public void initDoctor() {
		repository.saveAll(new ArrayList<Doctor>(Arrays.asList(new Doctor(1001,"Shyam","Heart"),
																	new Doctor(1002,"Ravi","Cardiac"),
																	new Doctor(1003,"Mathew","Liver"))));
	}
	
	public List<Doctor> getAllDoctors(){
		return repository.findAll(); 
	}
	
	public Optional<Doctor> getDoctorById(int d_id) {
		return repository.findById(d_id);
	}
	
	public void addDoctor(Doctor doctor) {
		 repository.save(doctor);
	}
	
	public void updateDoctor(Doctor doctor,int d_id) {
		doctor=repository.getOne(d_id);
		repository.save(doctor);
	}
	
	public void deleteDoctor(int d_id) {
			Doctor doc=repository.getOne(d_id);
			repository.delete(doc);
	}
}
