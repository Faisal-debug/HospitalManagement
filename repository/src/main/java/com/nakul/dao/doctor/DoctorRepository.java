package com.nakul.dao.doctor;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nakul.model.doctor.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

}
