package com.example.SpringMVCExercise;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

@Controller
public class EmployeeController {

    @Resource
    private EmployeeRepository allEmployeeRepo;

    // Main Home Page
    @RequestMapping("/home")
    public String homePage() {
        return ("home.html");
    }

    @RequestMapping("/employee/{empId}")
    public String displayOneEmployee(Model model, @PathVariable int empId) {
        model.addAttribute("OneEmployee", allEmployeeRepo.findOneEmployee(empId));
        return ("showSingleEmployee.html");
    }

    @RequestMapping("/all-employees")
    public String displayAllEmployees(Model model) {
        model.addAttribute("AllEmployees", allEmployeeRepo.findAllEmployees());
        return ("showAllEmployees.html");

    }




}
