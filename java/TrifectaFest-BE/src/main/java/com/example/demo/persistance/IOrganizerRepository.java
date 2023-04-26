package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entiteien.Organizer;


@Component
public interface IOrganizerRepository extends JpaRepository<Organizer, Long> {

}
