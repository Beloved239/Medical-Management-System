package com.tobi.MedicalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "appointment_location")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RefAppointmentLocations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "appointment_generator")
    private Long locationCode;

    @Column(name = "location_description")
    private String locationDescription;
}
