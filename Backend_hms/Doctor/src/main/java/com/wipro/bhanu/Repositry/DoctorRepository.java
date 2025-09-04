package com.wipro.bhanu.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bhanu.Entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	List<Doctor> findBySpecialization(String specialization);

	

}
