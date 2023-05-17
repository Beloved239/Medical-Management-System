package com.tobi.MedicalManagementSystem.Service;

import com.tobi.MedicalManagementSystem.DTO.PatientRequest;
import com.tobi.MedicalManagementSystem.Entity.Patients;
import com.tobi.MedicalManagementSystem.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;
    public Patients addPatient(PatientRequest patientRequest){
        Patients patients = new Patients();

        patients.setFirstName(patientRequest.getFirstName());
        patients.setMiddleName(patientRequest.getMiddleName());
        patients.setLastName(patientRequest.getLastName());
        patients.setGender(patientRequest.getGender());
        patients.setDateOfBirth(patientRequest.getDateOfBirth());
        patients.setOtherDetails(patientRequest.getOtherDetails());

        Patients savedPatients= patientRepository.save(patients);
//        return (Patients) patientRepository.save(patients);
        return savedPatients;
    }

    public List fetchAllPatients(){
        return patientRepository.findAll();
    }


}
