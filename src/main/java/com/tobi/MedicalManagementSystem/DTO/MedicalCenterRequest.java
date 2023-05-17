package com.tobi.MedicalManagementSystem.DTO;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class MedicalCenterRequest {
    private String medicalCenterName;
    private String medicalCenterManager;
    private String contactDetails;
    private String otherDetails;
}
