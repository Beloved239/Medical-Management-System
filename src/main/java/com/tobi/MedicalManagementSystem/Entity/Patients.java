package com.tobi.MedicalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "patients")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Patients {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patientId_generator")
    private Long patientId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "middleName")
    private String middleName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "dateOfBirth")
    private String dateOfBirth;

    @CreationTimestamp
    @Column(name = "date_became_patient")
    private LocalDateTime dateBecamePatient;
    @Column(name = "other_details")
    private String otherDetails;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Addresses addressId;

    @ManyToOne
    @JoinColumn(name = "medical_center_id")
    private CommunityMedicalCenter communityMedicalCenter;
}
