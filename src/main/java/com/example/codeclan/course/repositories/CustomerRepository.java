package com.example.codeclan.course.repositories;

import com.example.codeclan.course.models.Course;
import com.example.codeclan.course.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findCustomersByBookingsCourseId(Long courseId);

    List<Customer> findCustomersByTownAndBookingsCourseId(String town, Long courseId);

}
