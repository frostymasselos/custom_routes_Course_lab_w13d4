package com.example.codeclan.course.controllers;

import com.example.codeclan.course.repositories.BookingRepository;
import com.example.codeclan.course.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

}

