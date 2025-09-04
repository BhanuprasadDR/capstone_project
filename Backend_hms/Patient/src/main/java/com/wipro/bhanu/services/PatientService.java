package com.wipro.bhanu.services;

import java.util.List;
import java.util.Optional;

import com.wipro.bhanu.entities.Patient;

public interface PatientService {

    Patient savePatient(Patient patient);

    Optional<Patient> getPatientById(Long id);

    List<Patient> getAllPatients();

    void deletePatient(Long id);
}
