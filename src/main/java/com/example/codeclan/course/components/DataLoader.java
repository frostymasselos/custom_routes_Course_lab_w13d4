package com.example.codeclan.course.components;

import com.example.codeclan.course.models.Booking;
import com.example.codeclan.course.models.Course;
import com.example.codeclan.course.models.Customer;
import com.example.codeclan.course.repositories.BookingRepository;
import com.example.codeclan.course.repositories.CourseRepository;
import com.example.codeclan.course.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader () { //default constructor

    }

    public void run(ApplicationArguments args) {

        Course course = new Course("Java", "Edinburgh", 4);
        courseRepository.save(course);

        Customer customer = new Customer("Iain", "Livingston", 19);
        customerRepository.save(customer);

        Booking booking = new Booking("13-01-19", course, customer);
        bookingRepository.save(booking);

    }


}
