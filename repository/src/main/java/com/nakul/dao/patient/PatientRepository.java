package com.nakul.dao.patient;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nakul.model.patient.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
