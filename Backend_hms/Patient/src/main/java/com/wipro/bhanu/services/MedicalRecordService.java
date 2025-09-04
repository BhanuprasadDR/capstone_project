package com.wipro.bhanu.services;

import java.util.List;

import com.wipro.bhanu.dto.MedicalRecordDto;
import com.wipro.bhanu.dto.MedicineDto;

public interface MedicalRecordService {

    MedicalRecordDto addMedicalRecord(int patientId, MedicalRecordDto dto);

    List<MedicalRecordDto> getRecordsByPatientId(int patientId);

    MedicalRecordDto addMedicineToRecord(Long recordId, List<MedicineDto> medicines);
}

