package com.example.codeclan.course.controllers;

import com.example.codeclan.course.models.Course;
import com.example.codeclan.course.repositories.BookingRepository;
import com.example.codeclan.course.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/ratings/{rating}")
    public List<Course> findCoursesByStarRating(@PathVariable int rating) {
        return courseRepository.findCoursesByStarRating(rating);
    }

    @GetMapping(value = "/customers/{customerId}")
    public List<Course> findCoursesByBookingsCustomerId(@PathVariable Long customerId) {
        return courseRepository.findCoursesByBookingsCustomerId(customerId);
    }









}

