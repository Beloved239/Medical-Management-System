package com.tobi.MedicalManagementSystem.DTO;


import lombok.Data;

@Data
public class AddressRequest {
    private String houseNumber;
    private String streetNumber;
    private String localGovernment;
    private String city;
    private String postCode;
    private String state;
    private String country;
    private String otherDetails;
}
