package com.wipro.bhanu.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wipro.bhanu.dto.DoctorDto;

@FeignClient(name = "doctor-service", url = "http://localhost:8084") // URL of Doctor Service
public interface DoctorClient {

    @GetMapping("/api/doctors/{id}")
    DoctorDto getDoctorById(@PathVariable("id") Long id);
}

