package com.example.codeclan.course.controllers;

import com.example.codeclan.course.models.Customer;
import com.example.codeclan.course.repositories.CourseRepository;
import com.example.codeclan.course.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;


    @GetMapping(value="/bookings/courses/{id}")
    public List<Customer> findCustomersByBookingsCourseId(@PathVariable Long id) {
        return customerRepository.findCustomersByBookingsCourseId(id);
    }

    @GetMapping(value="/{town}/bookings/course/{id}")
    public List<Customer> findCustomersByTownAndBookingsCourseId(@PathVariable String town, @PathVariable Long id) {
        return customerRepository.findCustomersByTownAndBookingsCourseId(town, id);
    }

    @GetMapping(value="/{town}/{age}/bookings/course/{id}")
    public List<Customer> findCustomersByTownAndAgeAndBookingsCourseId(@PathVariable String town, @PathVariable int age, @PathVariable Long id) {
        return customerRepository.findCustomersByTownAndAgeGreaterThanAndBookingsCourseId(town, age, id);
    }
}
