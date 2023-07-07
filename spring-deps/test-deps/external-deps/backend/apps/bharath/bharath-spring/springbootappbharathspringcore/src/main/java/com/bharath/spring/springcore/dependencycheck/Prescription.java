package com.bharath.spring.springcore.dependencycheck;

import java.util.List;

public class Prescription {

    private int id;
    private String patientName;
    private List<String> medicines;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Prescription [id=" + id + ", patientName=" + patientName + ", medicines=" + medicines + "]";
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public List<String> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<String> medicines) {
        this.medicines = medicines;
    }

}
