package com.tobi.MedicalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "staff_appointment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StaffInAppointment {
    //appointment id
    //staff id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "staffId_generator")
    @ManyToOne
    @JoinColumn(name = "staff_id")
    private ProfessionalStaff professionalStaff;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "appointmentId_generator")
    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private Appointments appointments;



    @Column(name = "comments")
    private String comments;
}
