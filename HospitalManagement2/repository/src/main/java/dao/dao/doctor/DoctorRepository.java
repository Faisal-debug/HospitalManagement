package dao.doctor;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techie.model.doctor.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

	
}
