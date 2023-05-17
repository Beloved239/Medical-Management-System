package com.tobi.MedicalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "professional_staff")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProfessionalStaff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "staffId_generator")
    private String staffId;

    @Column(name = "staff_details")
    private String staffDetails;

    @ManyToOne
    @JoinColumn(name = "discipline_code")
    private RefDisciplines refDisciplines;
}
