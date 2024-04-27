package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {
    // Any additional methods if needed can be added here
}