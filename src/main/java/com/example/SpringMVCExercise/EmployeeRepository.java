package com.example.SpringMVCExercise;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

@Repository
public class EmployeeRepository {

    // Hashmap
    Map<Integer, Employee> employeeDatabase = new HashMap<>();

    // Variable
    private Address empAddress;

    // Employees
    Employee employeeA = new Employee(111, "Scott", "Kevin", "Jankowski", "III", empAddress);
    Employee employeeB = new Employee(222, "Alan", "Jordan", "Kostrick", "Jr", empAddress);
    Employee employeeC = new Employee(333, "Cliff", "Farida", "Jenkins", "Sr", empAddress);

    // Constructor
    public EmployeeRepository() {
        employeeDatabase.put(employeeA.getEmpId(), employeeA);
        employeeDatabase.put(employeeB.getEmpId(), employeeB);
        employeeDatabase.put(employeeC.getEmpId(), employeeC);
    }

    // Controller Methods
    public Employee findOneEmployee(int employeeToGet) {
        return employeeDatabase.get(employeeToGet);
    }

    public Collection<Employee> findAllEmployees() {
        return employeeDatabase.values();
    }
}
