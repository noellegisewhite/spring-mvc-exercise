package com.example.SpringMVCExercise;

public class Employee {

    //Variables
    private int empId;
    private String empFirstName;
    private String empMiddleName;
    private String empLastName;
    private String empSuffix;
    private Address empAddress;

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpMiddleName() {
        return empMiddleName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public String getEmpSuffix() {
        return empSuffix;
    }

    public Address getEmpAddress() {
        return empAddress;
    }

    // Constructor
    public Employee(int empId, String empFirstName, String empMiddleName, String empLastName, String empSuffix, Address empAddress) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empMiddleName = empMiddleName;
        this.empLastName = empLastName;
        this.empSuffix = empSuffix;
        this.empAddress = empAddress;
    }
}
