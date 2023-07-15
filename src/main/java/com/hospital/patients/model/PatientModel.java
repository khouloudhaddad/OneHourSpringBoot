package com.hospital.patients.model;

import java.util.List;

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
}
