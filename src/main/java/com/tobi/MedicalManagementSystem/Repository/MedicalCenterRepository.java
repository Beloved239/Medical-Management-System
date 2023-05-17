package com.tobi.MedicalManagementSystem.Repository;

import com.tobi.MedicalManagementSystem.Entity.CommunityMedicalCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalCenterRepository extends JpaRepository<CommunityMedicalCenter, Long> {

}
