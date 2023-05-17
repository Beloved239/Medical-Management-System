package com.tobi.MedicalManagementSystem.Repository;

import com.tobi.MedicalManagementSystem.Entity.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Addresses, Long> {

}
