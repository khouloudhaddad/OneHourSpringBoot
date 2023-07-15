package com.hospital.patients.service;

import org.springframework.stereotype.Service;

@Service
public class PatientService {
    public String printName(String name){
        return name.toUpperCase();
    }
}
