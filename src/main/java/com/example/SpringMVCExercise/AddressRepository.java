package com.example.SpringMVCExercise;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.HashMap;

@Repository
public class AddressRepository {

    Map<Integer, Address> addressDatabase = new HashMap<>();

    private Employee dummyEmployee;

    // Addresses
    // String addressId, String addressLineOne, String addressLineTwo, String apartmentNum, String city, String state, String zipCode, String zipCodeLong, String county, String country
    Address addressA = new Address(dummyEmployee.getEmpId(), "123 WCCI Lane", "N/A", "1A", "Cleveland", "Ohio", "44321", "44321-0000", "Cool", "USA");
    Address addressB = new Address(dummyEmployee.getEmpId(), "234 WCCI Lane", "N/A", "1B", "Cleveland", "Ohio", "44321", "44321-0000", "Cool", "USA");
    Address addressC = new Address(dummyEmployee.getEmpId(), "456 WCCI Lane", "N/A", "1B", "Cleveland", "Ohio", "44321", "44321-0000", "Cool", "USA");

    // Methods
}
