package com.example.codeclan.course;

import com.example.codeclan.course.models.Booking;
import com.example.codeclan.course.models.Course;
import com.example.codeclan.course.models.Customer;
import com.example.codeclan.course.repositories.BookingRepository;
import com.example.codeclan.course.repositories.CourseRepository;
import com.example.codeclan.course.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class) //didn't have this before?
@SpringBootTest
class CourseApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void allModelsCanPopulateDB () {

		Course course = new Course("Java", "Edinburgh", 4);
		courseRepository.save(course);

		Customer customer = new Customer("Iain", "Livingston", 19);
		customerRepository.save(customer);

		Booking booking = new Booking("13/01/19", course, customer);
		bookingRepository.save(booking);

	}

	@Test
	public void canGetCoursesForGivenStarRating () {

		List<Course> found = courseRepository.findCoursesByStarRating(4);
		assertEquals("Java", found.get(0).getName());

	}

	@Test
	public void canGetCustomersForGivenCourse () {

		List<Customer> found = customerRepository.findCustomersByBookingsCourseId(1L);
		assertEquals("Iain", found.get(0).getName());
	}

	@Test
	public void canGetCoursesForGivenCustomer () {
		List<Course> found = courseRepository.findCoursesByBookingsCustomerId(1L);
		assertEquals("Java", found.get(0).getName());
	}

}
