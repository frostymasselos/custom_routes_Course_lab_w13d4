package com.example.codeclan.course.controllers;

import com.example.codeclan.course.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/customers")
public class CustomerController {

    CustomerRepository customerRepository;

}
