package com.wipro.bhanu.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.wipro.bhanu.Entities.Doctor;
import com.wipro.bhanu.Services.DoctorService;
import com.wipro.bhanu.dto.AppointmentDto;
import com.wipro.bhanu.dto.PatientDto;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorService.addDoctor(doctor);
    }

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        return doctorService.getDoctorById(id);
    }

    @GetMapping("/specialization/{specialization}")
    public List<Doctor> getDoctorsBySpecialization(@PathVariable String specialization) {
        return doctorService.getDoctorsBySpecialization(specialization);
    }

    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor doctor) {
        return doctorService.updateDoctor(id, doctor);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
    }

    // Feign endpoints
    @GetMapping("/patient/{patientId}")
    public PatientDto getPatientDetails(@PathVariable Long patientId) {
        return doctorService.getPatientDetails(patientId);
    }

    @GetMapping("/{doctorId}/appointments")
    public List<AppointmentDto> getAppointmentsForDoctor(@PathVariable Long doctorId) {
        return doctorService.getAppointmentsForDoctor(doctorId);
    }
}
