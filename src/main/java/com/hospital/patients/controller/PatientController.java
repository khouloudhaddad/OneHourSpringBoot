package com.hospital.patients.controller;

import com.hospital.patients.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/print-name")
    public String printPatientName() {
       return patientService.printName("khouloud");
    }

}
