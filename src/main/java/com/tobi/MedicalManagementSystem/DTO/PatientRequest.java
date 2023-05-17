package com.tobi.MedicalManagementSystem.DTO;


import lombok.Data;

@Data
public class PatientRequest {

    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private String otherDetails;

}
