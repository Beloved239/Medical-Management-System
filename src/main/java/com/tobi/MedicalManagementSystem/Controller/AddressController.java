package com.tobi.MedicalManagementSystem.Controller;

import com.tobi.MedicalManagementSystem.DTO.AddressRequest;
import com.tobi.MedicalManagementSystem.Entity.Addresses;
import com.tobi.MedicalManagementSystem.Repository.AddressRepository;
import com.tobi.MedicalManagementSystem.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping
    public Addresses addNewAddress(@RequestBody AddressRequest addressRequest){
        return addressService.addAddress(addressRequest);
    }

    @GetMapping
    public List<Addresses> listAddress(){
        return addressService.fetchAddress();
    }
}
