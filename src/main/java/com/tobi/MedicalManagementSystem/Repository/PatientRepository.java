package com.tobi.MedicalManagementSystem.Repository;

import com.tobi.MedicalManagementSystem.Entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PatientRepository extends JpaRepository<Patients, Long> {
}
