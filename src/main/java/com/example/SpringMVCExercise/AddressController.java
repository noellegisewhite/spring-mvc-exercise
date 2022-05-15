package com.example.SpringMVCExercise;

import org.springframework.stereotype.Controller;
import javax.annotation.Resource;

@Controller
public class AddressController {

    @Resource
    private AddressRepository allAddressRepo;
}
