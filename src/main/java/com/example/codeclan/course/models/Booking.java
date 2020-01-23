package com.example.codeclan.course.models;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;



}
