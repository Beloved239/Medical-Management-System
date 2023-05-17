package com.tobi.MedicalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "address")
public class Addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "addressId_generator")
    private Long addressId;
    @Column(name = "house_number")
    private String houseNumber;
    @Column(name = "street_number")
    private String streetNumber;
    @Column(name = "local_government")
    private String localGovernment;
    @Column(name = "city")
    private String city;
    @Column(name = "postcode")
    private String postCode;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;
    @Column(name = "other_details")
    private String otherDetails;

}
