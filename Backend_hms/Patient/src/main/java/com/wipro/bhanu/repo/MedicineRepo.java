package com.wipro.bhanu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.bhanu.entities.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine, Long> {
}
