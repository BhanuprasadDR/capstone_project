package com.wipro.bhanu.Services;

import java.util.List;

import com.wipro.bhanu.Entities.Appointment;
import com.wipro.bhanu.dto.DoctorDto;
import com.wipro.bhanu.dto.PatientDto;

public interface AppointmentService {
    Appointment bookAppointment(Appointment appointment);
    List<Appointment> getAllAppointments();
    Appointment getAppointmentById(Long id);
    List<Appointment> getAppointmentsByDoctor(Long doctorId);
    List<Appointment> getAppointmentsByPatient(Long patientId);
    Appointment updateAppointment(Long id, Appointment updatedAppointment);
    void cancelAppointment(Long id);
    Appointment updateStatus(Long id, Appointment.Status status);
	PatientDto getPatientDetailsForAppointment(Long appointmentId);
	DoctorDto getDoctorDetailsForAppointment(Long appointmentId);
}