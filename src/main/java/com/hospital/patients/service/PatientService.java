package com.hospital.patients.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.hospital.patients.model.PatientModel;

@Service
public class PatientService {

    @Autowired
    private PatientModel patientModel;

    public String printName(String name) {
        return patientModel.getPatientFromDatabase().toUpperCase();
    }
    
}
