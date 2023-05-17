package com.tobi.MedicalManagementSystem.Service;

import com.tobi.MedicalManagementSystem.DTO.AddressRequest;
import com.tobi.MedicalManagementSystem.Entity.Addresses;
import com.tobi.MedicalManagementSystem.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;
    public Addresses addAddress(AddressRequest addressRequest){
        Addresses addresses = new Addresses();

        addresses.setHouseNumber(addressRequest.getHouseNumber());
        addresses.setStreetNumber(addressRequest.getStreetNumber());
        addresses.setLocalGovernment(addressRequest.getLocalGovernment());
        addresses.setCity(addressRequest.getCity());
        addresses.setPostCode(addressRequest.getPostCode());
        addresses.setState(addressRequest.getState());
        addresses.setCountry(addressRequest.getCountry());
        addresses.setOtherDetails(addressRequest.getOtherDetails());
        return addressRepository.save(addresses);
    }

    public List<Addresses> fetchAddress(){
      return addressRepository.findAll();
    }
}
