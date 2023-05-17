package com.tobi.MedicalManagementSystem.Service;

import com.tobi.MedicalManagementSystem.DTO.MedicalCenterRequest;
import com.tobi.MedicalManagementSystem.Entity.CommunityMedicalCenter;
import com.tobi.MedicalManagementSystem.Repository.MedicalCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalCenterService {
    @Autowired
    MedicalCenterRepository medicalCenterRepository;

    public CommunityMedicalCenter addMedicalCenter(MedicalCenterRequest medicalCenterRequest){
        CommunityMedicalCenter communityMedicalCenter = new CommunityMedicalCenter();
        communityMedicalCenter.setMedicalCenterName(medicalCenterRequest.getMedicalCenterName());
        communityMedicalCenter.setMedicalCenterManager(medicalCenterRequest.getMedicalCenterManager());
        communityMedicalCenter.setContactDetails(medicalCenterRequest.getContactDetails());
        communityMedicalCenter.setOtherDetails(medicalCenterRequest.getOtherDetails());

        return medicalCenterRepository.save(communityMedicalCenter);
    }

    public List<CommunityMedicalCenter> fetchAllMedicalCenter(){
        return medicalCenterRepository.findAll();
    }


}
