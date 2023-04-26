package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entiteien.Ticket;

public interface ITicketRepository extends JpaRepository<Ticket, Long> {

	
}
