package com.wipro.bhanu.Reposirty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bhanu.Entites.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {
	List<Billing> findByPatientId(Long patientId);
    List<Billing> findByAppointmentId(Long appointmentId);

}
