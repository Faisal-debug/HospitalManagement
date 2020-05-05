package com.nakul.controller.doctor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nakul.model.doctor.Doctor;
import com.nakul.service.doctor.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService service;
	

	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors(){
		
		return service.getAllDoctors();
	}
	
	@GetMapping("/doctors/{d_id}")
	public Optional<Doctor> getDoctorById(@PathVariable int d_id) {
		return service.getDoctorById(d_id);
	}
	
	@PostMapping(path = "/doctors",consumes = "application/json")
	public String addDoctor(@RequestBody Doctor doctor) {
		service.addDoctor(doctor);
		return "added";
	}
	
	@PutMapping(path = "/doctors/{d_id}",consumes = "application/json")
	public String updateDoctor(@RequestBody Doctor doctor,@PathVariable int d_id) {
		service.updateDoctor(doctor, d_id);
		return "updated";
	}
	
	@DeleteMapping("/doctors/{d_id}")
	public String deleteDoctor(@PathVariable int d_id) {
		service.deleteDoctor(d_id);
		return "deleted";
	}
}
