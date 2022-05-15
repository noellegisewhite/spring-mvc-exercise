package com.example.SpringMVCExercise;

public class Address {

    // Variables
    // private Employee empAddressId;
    private int addressId;
    private String addressLineOne;
    private String addressLineTwo;
    private String apartmentNum;
    private String city;
    private String state;
    private String zipCode;
    private String zipCodeLong;
    private String county;
    private String country;

    // Getters

//     public Employee getEmpAddressId() {
//        return empAddressId;
//    }

    public int getAddressId() {
        return addressId;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public String getApartmentNum() {
        return apartmentNum;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getZipCodeLong() {
        return zipCodeLong;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }

    public Address(int addressId, String addressLineOne, String addressLineTwo, String apartmentNum, String city, String state, String zipCode, String zipCodeLong, String county, String country) {
        this.addressId = addressId;
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.apartmentNum = apartmentNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.zipCodeLong = zipCodeLong;
        this.county = county;
        this.country = country;
    }

    // Methods
    public Address returnOneAddress(int empIdToGet) {
        return null;
    }
}
