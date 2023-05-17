package com.tobi.MedicalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "community_medical_center")
public class CommunityMedicalCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicalCenterId_generator")
    private Long medicalCenterId;
    @Column(name = "medical_center_name")
    private String medicalCenterName;
    @Column(name = "medical_center_manager")
    private String medicalCenterManager;
    @Column(name = "contact_details")
    private String contactDetails;
    @Column(name = "other_details")
    private String otherDetails;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Addresses addresses;



}
