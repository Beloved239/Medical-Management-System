package com.tobi.MedicalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Ref_disciplines")
public class RefDisciplines {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "disciplineCode_generator")
    private String disciplineCode;
    @Column(name = "discipline_name")
    private String disciplineName;
    @Column(name = "description")
    private String description;


}
