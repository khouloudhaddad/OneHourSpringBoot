package com.hospital.patients.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @GetMapping("/print-name")
    public void printPatientName(){
        System.out.println("My name is ...");
    }
}
