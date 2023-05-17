package com.tobi.MedicalManagementSystem.Controller;

import com.tobi.MedicalManagementSystem.DTO.MedicalCenterRequest;
import com.tobi.MedicalManagementSystem.Entity.CommunityMedicalCenter;
import com.tobi.MedicalManagementSystem.Service.MedicalCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medical")
public class MedicalCenterController {

    @Autowired
    MedicalCenterService medicalCenterService;

    @PostMapping
    public CommunityMedicalCenter createMedicalCenter(@RequestBody MedicalCenterRequest medicalCenterRequest){
        return medicalCenterService.addMedicalCenter(medicalCenterRequest);
    }

    @GetMapping
    public List<CommunityMedicalCenter> getAllMedicalCenters(){
        return medicalCenterService.fetchAllMedicalCenter();
    }
}
