package com.tobi.MedicalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Appointments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "appointmentId_generator")
    private Long appointmentId;

    @Column(name = "appointment_date")
    private LocalDateTime appointmentDate;
    @Column(name = "medicalNotes")
    private String medicalNotes;
    @Column(name = "otherDetails")
    private String otherDetails;

    @ManyToOne
    @JoinColumn(name = "location_code")
    private RefAppointmentLocations refAppointmentLocations;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patients patients;


}
