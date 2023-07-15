package com.hospital.patients.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PatientModel {
    List<String> names = new ArrayList<>();

    PatientModel() {
        names.add("Frank");
        names.add("Med");
        names.add("Greg");
    }
    
    public String getPatientFromDatabase() {
        return names.get(0);
    }

    public List<String> getNames() {
        return names;
    }
}
