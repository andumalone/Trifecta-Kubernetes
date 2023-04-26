package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entiteien.Booking;

public interface IBookingRepository extends JpaRepository<Booking, Long> {

	
}
