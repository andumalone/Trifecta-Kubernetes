package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entiteien.Festival;

@Component
public interface IFestivalRepository extends JpaRepository<Festival, Long> {

	
}
