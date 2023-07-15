package com.hospital.patients.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    private PatientController partientController; //bean

    @GetMapping("/print-name")
    public String printPatientName() {
        partientController.printName("khouloud");
    }
    
}
