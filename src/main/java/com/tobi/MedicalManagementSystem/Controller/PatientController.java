package com.tobi.MedicalManagementSystem.Controller;

import com.tobi.MedicalManagementSystem.DTO.PatientRequest;
import com.tobi.MedicalManagementSystem.Entity.Patients;
import com.tobi.MedicalManagementSystem.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping
    public Patients addPatient(@RequestBody PatientRequest patientRequest){
        return patientService.addPatient(patientRequest);
    }

    @GetMapping
    public List getAllPatients(){
        return patientService.fetchAllPatients();
    }
}
