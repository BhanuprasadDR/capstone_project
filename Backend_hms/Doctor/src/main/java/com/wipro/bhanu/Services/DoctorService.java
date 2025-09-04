package com.wipro.bhanu.Services;

import java.util.List;

import com.wipro.bhanu.Entities.Doctor;
import com.wipro.bhanu.dto.AppointmentDto;
import com.wipro.bhanu.dto.PatientDto;

public interface DoctorService {
	Doctor addDoctor(Doctor doctor);

    List<Doctor> getAllDoctors();

    Doctor getDoctorById(Long id);

    List<Doctor> getDoctorsBySpecialization(String specialization);

    Doctor updateDoctor(Long id, Doctor updatedDoctor);

    void deleteDoctor(Long id);

	PatientDto getPatientDetails(Long patientId);

	List<AppointmentDto> getAppointmentsForDoctor(Long doctorId);
	
	

}
